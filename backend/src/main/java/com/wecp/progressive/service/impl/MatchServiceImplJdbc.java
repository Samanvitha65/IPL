package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Match;
import com.wecp.progressive.service.MatchService;

public class MatchServiceImplJdbc implements MatchService {

    @Override
    public List<Match> getAllMatches() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllMatches'");
        return List.of();
    }

    @Override
    public Match getMatchById(int matchId) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getMatchById'");
        return null;
    }

    @Override
    public Integer addMatch(Match match) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addMatch'");
        return -1;
    }

    @Override
    public void updateMatch(Match match) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateMatch'");
    }

    @Override
    public void deleteMatch(int matchId) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'deleteMatch'");
    }

}