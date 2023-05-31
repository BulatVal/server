package com.example.npospring.service;


import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.entity.MsrTypeEntity;
import com.example.npospring.model.MsrFailType;

import com.example.npospring.model.MsrType;
import com.example.npospring.repository.MsrGroupRepo;
import com.example.npospring.repository.MsrTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrTypeService {
    @Autowired
    MsrTypeRepo msrTypeRepo;
    @Autowired
    MsrGroupRepo msrGroupRepo;


    public MsrTypeEntity createData(MsrTypeEntity msrTypeEntity,Long groupID){

        MsrGroupEntity msrGroupEntity =msrGroupRepo.findById(groupID).get();

        msrTypeEntity.setMsr_group_id(msrGroupEntity);

        return msrTypeRepo.save(msrTypeEntity);
    }

    public MsrType getMsrTypeOne(Long id)  {
        MsrTypeEntity msrFailType = msrTypeRepo.findById(id).get();

        return MsrType.toModel(msrFailType);
    }

    public Long delete (Long id){
        msrTypeRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrType msrType){
        MsrTypeEntity entity =  msrTypeRepo.findById(id).get();

        entity.setMsr_type_id(msrType.getMsr_type_id());
        entity.setMsr_type_code(msrType.getMsr_type_code());
        entity.setMsr_type_sysname(msrType.getMsr_type_sysname());
        entity.setMsr_type_name(msrType.getMsr_type_name());
        entity.setMsr_type_sname(msrType.getMsr_type_sname());
        entity.setMsr_type_desc(msrType.getMsr_type_desc());
        entity.setMsr_type_auto_process(msrType.isMsr_type_auto_process());
        entity.setMsr_type_need_check(msrType.isMsr_type_need_check());
        entity.setMsr_type_need_calc(msrType.isMsr_type_need_calc());
        entity.setMsr_type_need_reject(msrType.isMsr_type_need_reject());

        entity.setRow_date_begin(msrType.getRow_date_begin());
        entity.setRow_date_end(msrType.getRow_date_end());
        entity.setRow_create_date(msrType.getRow_create_date());
        entity.setRow_create_user(msrType.getRow_create_user());
        entity.setRow_modify_date(msrType.getRow_modify_date());
        entity.setRow_modify_user(msrType.getRow_modify_user());
        entity.setRow_is_ready(msrType.isRow_is_ready());
        msrTypeRepo.save(entity);

        return id;

    }
}
