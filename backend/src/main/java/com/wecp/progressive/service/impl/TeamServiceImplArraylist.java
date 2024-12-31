package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService  {
    private static List<Team> teamList=new ArrayList<>();
    public TeamServiceImplArraylist(){

    }

    @Override
    public List<Team> getAllTeams() {
        return teamList;
        //return List.of();
        
    }

    @Override
    public int addTeam(Team team) {
        // TODO Auto-generated method stub
       
       // throw new UnsupportedOperationException("Unimplemented method 'addTeam'");
       //return -1;
       teamList.add(team);
       return teamList.size();
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        // TODO Auto-generated method stub
       // return List.of();
       List<Team> sortedTeam=teamList;
       sortedTeam.sort(Comparator.comparing(Team::getTeamName));
       return sortedTeam;
        
       // throw new UnsupportedOperationException("Unimplemented method 'getAllTeamsSortedByName'");
    }
    @Override
    public void emptyArrayList(){
        teamList=new ArrayList<>();
        //TeamService.super.emptyArrayList();
    }

    

}