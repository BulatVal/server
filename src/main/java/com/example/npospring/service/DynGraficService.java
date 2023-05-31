package com.example.npospring.service;

import com.example.npospring.entity.DynGraficEntity;
import com.example.npospring.entity.DynamogramEntity;
import com.example.npospring.entity.MsrEntity;
import com.example.npospring.repository.DynGraficRepo;
import com.example.npospring.repository.DynamogramRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynGraficService {

    @Autowired
    private DynGraficRepo dynGraficRepo;
    @Autowired
    private DynamogramRepo dynamogramRepo;

    public DynGraficEntity addData(DynGraficEntity dynGraficEntity, Long dynamogramID){
        DynamogramEntity dynamogramEntity = dynamogramRepo.findById(dynamogramID).get();
        dynGraficEntity.setDynamogram_id(dynamogramEntity);

        return dynGraficRepo.save(dynGraficEntity);
    }
}
