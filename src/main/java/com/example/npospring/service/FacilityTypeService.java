package com.example.npospring.service;

import com.example.npospring.entity.FacilityTypeEntity;
import com.example.npospring.entity.MsrFail2Entity;
import com.example.npospring.entity.MsrValueTypeEntity;
import com.example.npospring.model.FacilityType;
import com.example.npospring.model.MsrFail2;
import com.example.npospring.model.MsrValueType;
import com.example.npospring.repository.FacilityTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class FacilityTypeService {
    @Autowired
    FacilityTypeRepo facilityTypeRepo;

    public FacilityTypeEntity addData(FacilityTypeEntity facilityTypeEntity){
        return facilityTypeRepo.save(facilityTypeEntity);
    }

    public FacilityType getFacilityTypeOne(Long id)  {
        FacilityTypeEntity msrFail2 = facilityTypeRepo.findById(id).get();

        return FacilityType.toModel(msrFail2);
    }



    public Long delete (Long id){
        facilityTypeRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , FacilityType facilityType){
        FacilityTypeEntity entity =  facilityTypeRepo.findById(id).get();

        entity.setFacility_type_name(facilityType.getFacility_type_name());

        return id;

    }
}
