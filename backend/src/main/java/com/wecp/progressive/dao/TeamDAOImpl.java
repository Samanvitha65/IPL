package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Team;

public class TeamDAOImpl implements TeamDAO {
    ArrayList<Team>teamms=new ArrayList<>();

    @Override
    public int addTeam(Team team) {
        // TODO Auto-generated method stub
       // teamms.add(team);
       return -1;
       // throw new UnsupportedOperationException("Unimplemented method 'addTeam'");
    }

    @Override
    public Team getTeamById(int teamId) {
        // TODO Auto-generated method stub
        return null;
        //throw new UnsupportedOperationException("Unimplemented method 'getTeamById'");
    }

    @Override
    public void updateTeam(Team team) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateTeam'");
    }

    @Override
    public void deleteTeam(int teamId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteTeam'");
    }

    @Override
    public List<Team> getAllTeams() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAllTeams'");
       return List.of();
    }
    




}
