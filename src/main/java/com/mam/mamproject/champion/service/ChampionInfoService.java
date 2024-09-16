package com.mam.mamproject.champion.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import com.mam.mamproject.champion.repository.ChampionInfoRepository;
import com.mam.mamproject.champion.dto.ChampionInfoResponseDto;
import com.mam.mamproject.champion.entity.ChampionInfo;

@Service
public class ChampionInfoService {

    // Assume there's a repository to interact with the database
    private final ChampionInfoRepository championInfoRepository;

    public ChampionInfoService(ChampionInfoRepository championInfoRepository) {
        this.championInfoRepository = championInfoRepository;
    }


    public List<ChampionInfoResponseDto> getAllChampionsInfo() {
        List<ChampionInfo> championsInfo = championInfoRepository.findAll();
        return championsInfo.stream()
                        .map(championInfo -> {
                            ChampionInfoResponseDto responseInfoDto = new ChampionInfoResponseDto();
                            // responseDto.setChampionid(championInfo.getChampionid());
                            // responseDto.setWinrate(championInfo.getWinrate());
                            // responseDto.setPickrate(championInfo.getPickrate());
                            responseInfoDto.setChampion_id(championInfo.getChampion_Id());

                            return responseInfoDto;
                        })
                        .collect(Collectors.toList());

    }
}
// private Integer seq;
// private Integer champion_id;
// private String champion_name;
// private float pick_rate;
// private float win_rate;
// private float ban_rate;
// private String position;
// private String champion_tier;