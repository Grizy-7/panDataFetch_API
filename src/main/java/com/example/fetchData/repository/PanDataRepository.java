package com.example.fetchData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fetchData.entity.PanData;

@Repository
public interface PanDataRepository extends JpaRepository<PanData, String> {
	PanData findBypanNumber(String panNumber);
	
}

