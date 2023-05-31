package com.example.npospring.service;

import com.example.npospring.entity.*;
import com.example.npospring.model.MsrFail;
import com.example.npospring.model.MsrFailCategory;
import com.example.npospring.model.MsrFailType;
import com.example.npospring.repository.MsrFailCategoryRepo;
import com.example.npospring.repository.MsrFailSeverityRepo;
import com.example.npospring.repository.MsrFailTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsrFailTypeService {

    @Autowired
    MsrFailTypeRepo msrFailTypeRepo;
    @Autowired
    MsrFailCategoryRepo msrFailCategoryRepo;
    @Autowired
    MsrFailSeverityRepo msrFailSeverityRepo;

    public MsrFailTypeEntity createData(MsrFailTypeEntity msrFailTypeEntity , Long categoryID, Long severityID){
        MsrFailCategoryEntity msrFailCategoryEntity =msrFailCategoryRepo.findById(categoryID).get();
        MsrFailSeverityEntity msrFailSeverityEntity = msrFailSeverityRepo.findById(severityID).get();
        msrFailTypeEntity.setMsr_fail_category_id(msrFailCategoryEntity);
        msrFailTypeEntity.setMsr_fail_severity_id(msrFailSeverityEntity);
        return msrFailTypeRepo.save(msrFailTypeEntity);
    }

    public MsrFailType getMsrFailTypeOne(Long id)  {
        MsrFailTypeEntity msrFailType = msrFailTypeRepo.findById(id).get();

        return MsrFailType.toModel(msrFailType);
    }



    public Long delete (Long id){
        msrFailTypeRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrFailType msrFailType){
        MsrFailTypeEntity entity =  msrFailTypeRepo.findById(id).get();

        entity.setMsr_fail_type_sysname(msrFailType.getMsr_fail_type_sysname());
        entity.setMsr_fail_type_name(msrFailType.getMsr_fail_type_name());
        entity.setMsr_fail_type_sname(msrFailType.getMsr_fail_type_sname());
        entity.setMsr_fail_type_need_recalc(msrFailType.isMsr_fail_type_need_recalc());
        entity.setMsr_fail_type_desc(msrFailType.isMsr_fail_type_desc());

        entity.setRow_date_begin(msrFailType.getRow_date_begin());
        entity.setRow_date_end(msrFailType.getRow_date_end());
        entity.setRow_create_date(msrFailType.getRow_create_date());
        entity.setRow_create_user(msrFailType.getRow_create_user());
        entity.setRow_modify_date(msrFailType.getRow_modify_date());
        entity.setRow_modify_user(msrFailType.getRow_modify_user());
        entity.setRow_is_ready(msrFailType.isRow_is_ready());
        msrFailTypeRepo.save(entity);

        return id;

    }

}
