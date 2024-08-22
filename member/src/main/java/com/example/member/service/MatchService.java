package com.example.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllTableNames() {
        return List.of(
            "2023_Spring_1", "2023_Spring_2", "2023_Spring_3", "2023_Spring_4",
            "2023_Summer_6", "2023_Summer_7", "2023_Summer_8",
            "2024_Spring_1", "2024_Spring_2", "2024_Spring_3", "2024_Spring_4",
            "2024_Summer_6", "2024_Summer_7"
        );
    }

    public List<String> getUniqueTeamsForSeason(String season) {
        String sql = "SELECT DISTINCT Team FROM " + season + " UNION SELECT DISTINCT Opponent_Team FROM " + season;
        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<Map<String, Object>> findDataBySeasonAndTeam(String season, String team) {
        String sql = "SELECT * FROM " + season + " WHERE Team = ? OR Opponent_Team = ?";
        return jdbcTemplate.queryForList(sql, team, team);
    }
}
