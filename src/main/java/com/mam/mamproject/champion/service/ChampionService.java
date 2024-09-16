package com.mam.mamproject.champion.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import com.mam.mamproject.champion.repository.ChampionRepository;
import com.mam.mamproject.champion.dto.ChampionResponseDto;
import com.mam.mamproject.champion.entity.Champion;

@Service
public class ChampionService {

    // Assume there's a repository to interact with the database
    private final ChampionRepository championRepository;

    public ChampionService(ChampionRepository championRepository) {
        this.championRepository = championRepository;
    }


    public List<ChampionResponseDto> getAllChampions() {
        List<Champion> champions = championRepository.findAll();
        return champions.stream()
                        .map(champion -> {
                            ChampionResponseDto responseDto = new ChampionResponseDto();
                            responseDto.setChampionid(champion.getChampionid());
                            responseDto.setWinrate(champion.getWinrate());
                            responseDto.setPickrate(champion.getPickrate());
                            return responseDto;
                        })
                        .collect(Collectors.toList());

    }
}
