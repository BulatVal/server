package com.example.npospring.service;

import com.example.npospring.entity.*;
import com.example.npospring.exception.MsrDescNotFoundException;
import com.example.npospring.model.Facility;
import com.example.npospring.model.FacilityType;
import com.example.npospring.model.MsrDesc;
import com.example.npospring.model.MsrFailType;
import com.example.npospring.repository.FacilityRepo;
import com.example.npospring.repository.FacilityTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilityService {

    @Autowired
    public FacilityRepo facilityRepo;
    @Autowired
    public FacilityTypeRepo facilityTypeRepo;

    public FacilityEntity createData(FacilityEntity facilityEntity , Long facilityTypeID){
        FacilityTypeEntity facilityTypeEntity =facilityTypeRepo.findById(facilityTypeID).get();

        facilityEntity.setFacility_type_id(facilityTypeEntity);
        return facilityRepo.save(facilityEntity);
    }

    public Facility getMsrFailTypeOne(Long id)  {
        FacilityEntity facility = facilityRepo.findById(id).get();

        return Facility.toModel(facility);
    }

    public Long delete (Long id){
        facilityRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , Facility facility){
        FacilityEntity entity =  facilityRepo.findById(id).get();

        entity.setFacility_name(facility.getFacility_name());

        facilityRepo.save(entity);

        return id;

    }

}
