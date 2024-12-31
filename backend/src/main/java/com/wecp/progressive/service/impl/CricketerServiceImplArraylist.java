package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplArraylist implements CricketerService {
    private static List<Cricketer> cricketerList=new ArrayList<>();
    public CricketerServiceImplArraylist(){
        
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCricketers'");
        return cricketerList;
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCricketer'");
        cricketerList.add(cricketer);

        return cricketerList.size();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCricketersSortedByExperience'");
        List<Cricketer> sortedCricketer=cricketerList;
        sortedCricketer.sort(Comparator.comparing(Cricketer::getExperience));
        return sortedCricketer;
        //return List.of();
    }
    @Override
    public void emptyArrayList(){
        cricketerList=new ArrayList<>();
        //TeamService.super.emptyArrayList();
    }


}