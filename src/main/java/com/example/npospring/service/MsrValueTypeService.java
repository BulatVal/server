package com.example.npospring.service;

import com.example.npospring.entity.MsrValueSourceEntity;
import com.example.npospring.entity.MsrValueTypeEntity;
import com.example.npospring.model.MsrValueSource;
import com.example.npospring.model.MsrValueType;
import com.example.npospring.repository.MsrValueTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrValueTypeService {
    @Autowired
    MsrValueTypeRepo msrValueTypeRepo;

    public MsrValueTypeEntity addData(MsrValueTypeEntity msrValueTypeEntity){
        return msrValueTypeRepo.save(msrValueTypeEntity);
    }

    public MsrValueType getMsrValueTypeOne(Long id)  {
        MsrValueTypeEntity msrValueSource = msrValueTypeRepo.findById(id).get();

        return MsrValueType.toModel(msrValueSource);
    }

    public Long delete (Long id){
        msrValueTypeRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrValueType msrValueType){
        MsrValueTypeEntity entity =  msrValueTypeRepo.findById(id).get();

        entity.setValue_type_id(msrValueType.getValue_type_id());
        entity.setValue_type_sysname(msrValueType.getValue_type_sysname());
        entity.setValue_type_name(msrValueType.getValue_type_name());
        entity.setValue_type_sname(msrValueType.getValue_type_sname());
        entity.setUnit_id(msrValueType.getUnit_id());
        entity.setValue_type_default_duration(msrValueType.getValue_type_default_duration());
        entity.setValue_type_has_cross(msrValueType.isValue_type_has_cross());
        entity.setValue_data_type(msrValueType.getValue_data_type());


        entity.setRow_date_begin(msrValueType.getRow_date_begin());
        entity.setRow_date_end(msrValueType.getRow_date_end());
        entity.setRow_create_date(msrValueType.getRow_create_date());
        entity.setRow_create_user(msrValueType.getRow_create_user());
        entity.setRow_modify_date(msrValueType.getRow_modify_date());
        entity.setRow_modify_user(msrValueType.getRow_modify_user());
        entity.setRow_is_ready(msrValueType.isRow_is_ready());
        msrValueTypeRepo.save(entity);
        return id;

    }
}
