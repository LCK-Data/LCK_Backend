package com.mam.mamproject.champion.dto;

import lombok.Data;

@Data
public class ChampionResponseDto {
    private Integer championid;
    private float winrate;
    private float pickrate;
}
