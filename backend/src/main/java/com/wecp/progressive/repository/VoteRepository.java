package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wecp.progressive.entity.Vote;

public interface VoteRepository extends JpaRepository<Vote,Integer>{
    Vote countByCategory(String category);

    @Query("DELETE teamId FROM Team t")
    void deleteByTeamId(int teamId);

    @Query("DELETE cricketerId FROM Cricketer c")
    void deleteByCricketer(int cricketerId);
    
}
