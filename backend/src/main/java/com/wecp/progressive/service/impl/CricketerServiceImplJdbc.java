package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.CricketerDAO;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplJdbc implements CricketerService {
    private CricketerDAO cricketerDAO;

    @Override
    public List<Cricketer> getAllCricketers() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCricketers'");
        return List.of();
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCricketer'");
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAllCricketersSortedByExperience'");
       return List.of();
    }

    
        

   

}