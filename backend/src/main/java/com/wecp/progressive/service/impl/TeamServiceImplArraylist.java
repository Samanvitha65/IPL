package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService  {
    ArrayList<Team>teams=new ArrayList<>();

    @Override
    public List<Team> getAllTeams() {
        
        return List.of();
        
    }

    @Override
    public int addTeam(Team team) {
        // TODO Auto-generated method stub
       
       // throw new UnsupportedOperationException("Unimplemented method 'addTeam'");
       return -1;
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        // TODO Auto-generated method stub
        return List.of();
        
       // throw new UnsupportedOperationException("Unimplemented method 'getAllTeamsSortedByName'");
    }
    @Override
    public void emptyArrayList(){
        TeamService.super.emptyArrayList();
    }

    

}