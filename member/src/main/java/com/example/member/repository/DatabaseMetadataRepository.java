package com.example.member.repository;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseMetadataRepository {

    private final JdbcTemplate jdbcTemplate;

    public DatabaseMetadataRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getTables() {
        String sql = "SHOW TABLES";
        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<Map<String, Object>> getTableColumns(String tableName) {
        String sql = "DESCRIBE " + tableName;
        return jdbcTemplate.queryForList(sql);
    }
}
