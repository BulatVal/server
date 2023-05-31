package com.example.npospring.service;

import com.example.npospring.entity.MsrFailSeverityEntity;
import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.model.MsrFailSeverity;
import com.example.npospring.model.MsrGroup;
import com.example.npospring.repository.MsrFailSeverityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrFailSeverityService {
    @Autowired
    MsrFailSeverityRepo msrFailSeverityRepo;

    public MsrFailSeverityEntity addData(MsrFailSeverityEntity msrFailSeverityEntity){
        return msrFailSeverityRepo.save(msrFailSeverityEntity);
    }

    public MsrFailSeverity getMsrFailSeverityOne(Long id)  {
        MsrFailSeverityEntity msrFailSeverity = msrFailSeverityRepo.findById(id).get();

        return MsrFailSeverity.toModel(msrFailSeverity);
    }

    public Long delete (Long id){
        msrFailSeverityRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrFailSeverity msrFailSeverity){
        MsrFailSeverityEntity entity =  msrFailSeverityRepo.findById(id).get();


        entity.setMsr_fail_severity_id(msrFailSeverity.getMsr_fail_severity_id());
        entity.setMsr_fail_severity_sysname(msrFailSeverity.getMsr_fail_severity_sysname());
        entity.setMsr_fail_severity_name(msrFailSeverity.getMsr_fail_severity_name());
        entity.setRow_date_begin(msrFailSeverity.getRow_date_begin());
        entity.setRow_date_end(msrFailSeverity.getRow_date_end());
        entity.setRow_create_date(msrFailSeverity.getRow_create_date());
        entity.setRow_create_user(msrFailSeverity.getRow_create_user());
        entity.setRow_modify_date(msrFailSeverity.getRow_modify_date());
        entity.setRow_modify_user(msrFailSeverity.getRow_modify_user());
        entity.setRow_is_ready(msrFailSeverity.isRow_is_ready());
        msrFailSeverityRepo.save(entity);

        return id;

    }

}
