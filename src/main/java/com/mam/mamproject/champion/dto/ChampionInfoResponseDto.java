package com.mam.mamproject.champion.dto;


import lombok.Data;

@Data

public class ChampionInfoResponseDto {
    private Integer seq;
    private Integer champion_id;
    private String champion_name;
    private float pick_rate;
    private float win_rate;
    private float ban_rate;
    private String position;
    private String champion_tier;
}
