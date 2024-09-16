package com.mam.mamproject.champion.repository;

import com.mam.mamproject.champion.entity.ChampionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionInfoRepository extends JpaRepository<ChampionInfo, Long> {
    // 추가적인 쿼리 메서드를 여기에 정의할 수 있습니다.
}
