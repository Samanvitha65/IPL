package com.wecp.progressive.service.impl;
<<<<<<< HEAD
 
import java.util.List;
 
import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
 
public class TeamServiceImplJpa implements TeamService  {
    private TeamDAO teamDAO;
   
 
    public TeamServiceImplJpa(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }
 
    @Override
    public List<Team> getAllTeams() {
        return null;
       
    }
 
    @Override
    public int addTeam(Team team) {
        return -1;
    }
 
    @Override
    public List<Team> getAllTeamsSortedByName() {
        return List.of();
    }
   
 
=======

public class TeamServiceImplJpa  {

>>>>>>> 75a4cc9095f7baf3e1ebd41194f34486c049ee0d
}