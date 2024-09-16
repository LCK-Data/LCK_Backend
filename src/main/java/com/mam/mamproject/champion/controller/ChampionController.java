package com.mam.mamproject.champion.controller;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mam.mamproject.champion.dto.ChampionResponseDto;
import com.mam.mamproject.champion.service.ChampionService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/api")
public class ChampionController {

    private final ChampionService championService;

    //생성자
    public ChampionController(ChampionService championService) {
        this.championService = championService;
    }
    // 챔피언 이름 가져오기 아직 구현 안함.
    // @PostMapping("/champion")
    // public ChampionResponseDto postchamList(@RequestBody ChampionDto championDto) {
    //     // log.info("champion: {}", championDto);
    //     ChampionResponseDto championResponseDto = new ChampionResponseDto();
    //     championResponseDto.setChampionid(championDto.getChampionid());
    //     championResponseDto.setWinrate(championDto.getWinrate());
    //     championResponseDto.setPickrate(championDto.getPickrate());
    //     return championResponseDto;
    // }
    
    //간단한 챔피언 데이터
    @GetMapping("/championlist") // @PostMapping -> @GetMapping 수정
    public List<ChampionResponseDto> getChampionList() {
        List<ChampionResponseDto> championList = championService.getAllChampions();
        return championList;
    }
}
