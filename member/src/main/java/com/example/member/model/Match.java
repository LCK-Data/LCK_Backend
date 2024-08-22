package com.example.member.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "2023_LCK_1")
public class Match {
    @Id
    private Long id;
    private String season;
    private String date;
    private String team;
    private Integer teamScore;
    private Integer opponentScore;
    private String opponentTeam;
    private String champion;
    private String opponentChampion;
    private String player;
    private String opponentPlayer;
    private String kda;
    private String opponentKda;
    private String damage;
    private String opponentDamage;
    private String sight;
    private String opponentSight;
    private Integer cs;
    private Integer opponentCs;
    private String perCs;
    private String opponentPerCs;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(Integer teamScore) {
        this.teamScore = teamScore;
    }

    public Integer getOpponentScore() {
        return opponentScore;
    }

    public void setOpponentScore(Integer opponentScore) {
        this.opponentScore = opponentScore;
    }

    public String getOpponentTeam() {
        return opponentTeam;
    }

    public void setOpponentTeam(String opponentTeam) {
        this.opponentTeam = opponentTeam;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getOpponentChampion() {
        return opponentChampion;
    }

    public void setOpponentChampion(String opponentChampion) {
        this.opponentChampion = opponentChampion;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getOpponentPlayer() {
        return opponentPlayer;
    }

    public void setOpponentPlayer(String opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
    }

    public String getKda() {
        return kda;
    }

    public void setKda(String kda) {
        this.kda = kda;
    }

    public String getOpponentKda() {
        return opponentKda;
    }

    public void setOpponentKda(String opponentKda) {
        this.opponentKda = opponentKda;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getOpponentDamage() {
        return opponentDamage;
    }

    public void setOpponentDamage(String opponentDamage) {
        this.opponentDamage = opponentDamage;
    }

    public String getSight() {
        return sight;
    }

    public void setSight(String sight) {
        this.sight = sight;
    }

    public String getOpponentSight() {
        return opponentSight;
    }

    public void setOpponentSight(String opponentSight) {
        this.opponentSight = opponentSight;
    }

    public Integer getCs() {
        return cs;
    }

    public void setCs(Integer cs) {
        this.cs = cs;
    }

    public Integer getOpponentCs() {
        return opponentCs;
    }

    public void setOpponentCs(Integer opponentCs) {
        this.opponentCs = opponentCs;
    }

    public String getPerCs() {
        return perCs;
    }

    public void setPerCs(String perCs) {
        this.perCs = perCs;
    }

    public String getOpponentPerCs() {
        return opponentPerCs;
    }

    public void setOpponentPerCs(String opponentPerCs) {
        this.opponentPerCs = opponentPerCs;
    }
}
