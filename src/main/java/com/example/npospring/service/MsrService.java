package com.example.npospring.service;

import com.example.npospring.entity.*;
import com.example.npospring.model.Msr;
import com.example.npospring.model.MsrType;
import com.example.npospring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MsrService {
    @Autowired
    MsrRepo msrRepo;
    @Autowired
    MsrTypeRepo msrTypeRepo;
    @Autowired
    SourceRepo sourceRepo;
    @Autowired
    MsrStateRepo msrStateRepo;
    @Autowired
    FacilityRepo facilityRepo;




    public MsrEntity createData(MsrEntity msrEntity, Long typeID,Long sourceID,Long stateID,Long facilityID){



        MsrTypeEntity msrTypeEntity =msrTypeRepo.findById(typeID).get();
        SourceEntity sourceEntity =sourceRepo.findById(sourceID).get();
        MsrStateEntity msrState =msrStateRepo.findById(stateID).get();
        FacilityEntity facility = facilityRepo.findById(facilityID).get();

        msrEntity.setMsr_type_id(msrTypeEntity);

        msrEntity.setSource_id(sourceEntity);
        msrEntity.setMsr_state_id(msrState);
        msrEntity.setFacility_id(facility);

        return msrRepo.save(msrEntity);
    }

    public Msr getMsrOne(Long id)  {
        MsrEntity msrEntity = msrRepo.findById(id).get();

        return Msr.toModel(msrEntity);
    }

    public Long delete (Long id){
        msrRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , Msr msr){
        MsrEntity entity =  msrRepo.findById(id).get();


        entity.setMsr_parent_id(msr.getMsr_parent_id());
        entity.setMsr_desc(msr.getMsr_desc());


        entity.setRejection_date(msr.getRejection_date());
        entity.setMsr_control(msr.isMsr_control());
        entity.setRejection_date(msr.getRejection_date());
        entity.setMsr_number(msr.getMsr_number());
        msrRepo.save(entity);

        return id;

    }
}
