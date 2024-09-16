package com.mam.mamproject.champion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "champion_info")
@Data
@Entity
public class ChampionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;
    private Integer champion_Id;
    private String champion_Name;
    private float pick_Rate;
    private float win_Rate;
    private float ban_Rate;
    private String position;
    private String champion_ier;
}
