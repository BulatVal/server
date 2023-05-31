package com.example.npospring.service;

import com.example.npospring.entity.DynamogramEntity;
import com.example.npospring.entity.MsrDescEntity;
import com.example.npospring.entity.MsrEntity;
import com.example.npospring.model.Dynamogram;
import com.example.npospring.model.Msr;
import com.example.npospring.repository.DynamogramRepo;
import com.example.npospring.repository.MsrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynamogramService {
    @Autowired
    private  DynamogramRepo dynamogramRepo;
    @Autowired
    private MsrRepo msrRepo;

    public DynamogramEntity addData(DynamogramEntity dynamogramEntity, Long msrID){
        MsrEntity msrEntity = msrRepo.findById(msrID).get();
        dynamogramEntity.setMsr_id(msrEntity);

        return dynamogramRepo.save(dynamogramEntity);
    }
    public Dynamogram getDynamogramOne(Long id)  {
        DynamogramEntity dynamogramEntity = dynamogramRepo.findById(id).get();

        return Dynamogram.toModel(dynamogramEntity);
    }

    public Long delete (Long id){
        dynamogramRepo.deleteById(id);
        return id;
    }


}
