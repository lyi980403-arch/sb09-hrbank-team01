package com.team1.hrbank.repository;

import com.team1.hrbank.entity.Backup;
import com.team1.hrbank.entity.BackupStatus;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackupRepository
    extends JpaRepository<Backup, Long>, BackupRepositoryCustom {

  // 가장 최근 완료된 백업 1건 조회 (백업 필요 여부 판단용)
  Optional<Backup> findTopByStatusOrderByStartedAtDesc(BackupStatus status);

  // 진행중인 백업 존재 여부 (중복 실행 방지)
  boolean existsByStatus(BackupStatus status);
}
