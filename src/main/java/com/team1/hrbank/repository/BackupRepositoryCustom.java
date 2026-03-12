package com.team1.hrbank.repository;

public interface BackupRepositoryCustom {
  CursorPageResponse<BackupResponse>
  findByCondition(BackupSearchRequest request);
}
