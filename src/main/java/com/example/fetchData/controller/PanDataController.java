package com.example.fetchData.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fetchData.entity.PanData;
import com.example.fetchData.service.PanDataService;

@RestController
@RequestMapping("/api")
public class PanDataController {

    @Autowired
    private PanDataService panDataService;

    @PostMapping("/fetchPanData")
    public ResponseEntity<PanData> fetchPanData(@RequestBody Map<String, String> requestData) {
        String panNumber = requestData.get("panNumber");
        System.out.println("pan"+panNumber);
        PanData panData = panDataService.getPanDataByPanNumber(panNumber);
        if (panData != null) {
            return ResponseEntity.ok(panData);
        } else {
        	System.out.println("entering not found");
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/save")
    public ResponseEntity<PanData> save(@RequestBody PanData panData){
    	return ResponseEntity.ok(panDataService.save(panData));
    }
}
