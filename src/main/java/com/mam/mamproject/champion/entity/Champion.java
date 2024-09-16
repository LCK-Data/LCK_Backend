package com.mam.mamproject.champion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Data
@Entity
public class Champion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer championid;
    private float winrate;
    private float pickrate;

}
// seq
// champion_id
// champion_name
// pick_rate
// win_rate
// ban_rate
// position
// champion_tier