package com.example.npospring.service;

import com.example.npospring.entity.*;
import com.example.npospring.model.MsrFailType;
import com.example.npospring.model.MsrValue;
import com.example.npospring.repository.MsrRepo;
import com.example.npospring.repository.MsrValueRepo;
import com.example.npospring.repository.MsrValueTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrValueService {

    @Autowired
    MsrValueRepo msrValueRepo;
    @Autowired
    MsrRepo msrRepo;
    @Autowired
    MsrValueTypeRepo msrValueTypeRepo;

    public MsrValueEntity createData(MsrValueEntity msrValueEntity , Long msrID, Long valueTypeID){
        MsrEntity msrEntity =msrRepo.findById(msrID).get();
        MsrValueTypeEntity msrValueTypeEntity = msrValueTypeRepo.findById(valueTypeID).get();
        msrValueEntity.setMsr_id(msrEntity);
        msrValueEntity.setMsr_value_type_id(msrValueTypeEntity);
        return msrValueRepo.save(msrValueEntity);
    }

    public MsrValueEntity getMsrValueOne(Long id)  {
        MsrValueEntity msrValueEntity = msrValueRepo.findById(id).get();

        return msrValueEntity;
    }

    public Long delete (Long id){
        msrValueRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrValue msrValue){
        MsrValueEntity entity =  msrValueRepo.findById(id).get();

        entity.setValue(msrValue.getValue());
        msrValueRepo.save(entity);

        return id;

    }
}
