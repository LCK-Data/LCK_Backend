package com.example.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.member.service.TableService;

@Controller
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping("/")
    public String showMainPage() {
        return "main"; // main.html을 렌더링
    }

    

    // @PostMapping("/match")
    // public String handleMatchForm(@RequestParam("team1") String team1, @RequestParam("team2") String team2, Model model) {
    //     // 팀에 따른 매치 데이터를 처리하고 model에 추가
    //     model.addAttribute("team1", team1);
    //     model.addAttribute("team2", team2);
        
    //     // 필요한 데이터를 model에 추가하여 match.html로 전달
    //     return "match"; // match.html로 리턴
    // }


    @GetMapping("/tables")
    public String listTables(Model model) {
        List<String> tableNames = tableService.getAllTableNames();
        model.addAttribute("tableNames", tableNames);
        return "tables";
    }


    @GetMapping("/teams")
    public String listTeams(@RequestParam String season, Model model) {
        List<String> teams = tableService.getUniqueTeamsForSeason(season);
        model.addAttribute("season", season);
        model.addAttribute("teams", teams);
        return "teams";
    }

    @GetMapping("/tableData")
    public String showTableData(@RequestParam String season, @RequestParam String team, Model model) {
        List<?> data = tableService.findDataBySeasonAndTeam(season, team);
        model.addAttribute("dataList", data);
        model.addAttribute("season", season);
        model.addAttribute("team", team);
        return "tableData";
    }
}
