package com.wecp.progressive.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Vote;
import com.wecp.progressive.repository.VoteRepository;
import com.wecp.progressive.service.VoteService;

//private VoteRepository voteRepository;

@Service

public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllVotes'");
    }

    @Override
    public Vote createVote(Vote vote) {
        return voteRepository.save(vote);
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'createVote'");
    }

    @Override
    public Map<String, Long> getVotesCountOfAllCategories() {
       return null;
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getVotesCountOfAllCategories'");
    }

}