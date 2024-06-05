package com.example.fetchData.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fetchData.entity.PanData;
import com.example.fetchData.repository.PanDataRepository;

@Service
public class PanDataService {
    
    @Autowired
    private PanDataRepository panDataRepository;

    

    public PanData getPanDataByPanNumber(String panNumber) {
    	System.out.println(panNumber+",,,,,,");
        return panDataRepository.findById(panNumber).orElse(null);
    }
    
    public PanData save(PanData panData) {
    	System.out.println("wyyyyyyyyyyyyyy");
    	return panDataRepository.save(panData);
    }
}