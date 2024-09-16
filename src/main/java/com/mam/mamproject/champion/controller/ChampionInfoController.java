package com.mam.mamproject.champion.controller;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mam.mamproject.champion.dto.ChampionInfoResponseDto;

import com.mam.mamproject.champion.service.ChampionInfoService;

import lombok.extern.log4j.Log4j2;


@Log4j2
@RestController
@RequestMapping("/api")
public class ChampionInfoController {

    private final ChampionInfoService ChampionInfoService;

    public ChampionInfoController(ChampionInfoService championInfoService) {
        this.ChampionInfoService = championInfoService;
    }
    // 챔피언 데이터 가져오기
    @GetMapping("/championInfo") // @PostMapping -> @GetMapping 수정
    public List<ChampionInfoResponseDto> getChampionInfoList() {
        List<ChampionInfoResponseDto> championInfoList = ChampionInfoService.getAllChampionsInfo();
        return championInfoList;
    }
    
}
