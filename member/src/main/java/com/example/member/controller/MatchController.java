package com.example.member.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.member.service.MatchService;

@Controller
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/match")
    public String listTables(Model model) {
        List<String> tableNames = matchService.getAllTableNames();
        model.addAttribute("tableNames", tableNames);
        return "match";
    }

    @GetMapping("/api/teams")
    @ResponseBody
    public List<String> listTeams(@RequestParam String season) {
        return matchService.getUniqueTeamsForSeason(season);
    }

    @GetMapping("/api/matches")
    @ResponseBody
    public List<Map<String, Object>> showTableData(@RequestParam String season, @RequestParam String team) {
        return matchService.findDataBySeasonAndTeam(season, team);
    }
}
