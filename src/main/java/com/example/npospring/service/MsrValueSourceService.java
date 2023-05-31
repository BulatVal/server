package com.example.npospring.service;

import com.example.npospring.entity.MsrTagEntity;
import com.example.npospring.entity.MsrValueSourceEntity;
import com.example.npospring.model.MsrTag;
import com.example.npospring.model.MsrValueSource;
import com.example.npospring.repository.MsrValueSourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrValueSourceService {

    @Autowired
    MsrValueSourceRepo msrValueSourceRepo;


    public MsrValueSourceEntity addData(MsrValueSourceEntity msrValueSourceEntity){
        return msrValueSourceRepo.save(msrValueSourceEntity);
    }

    public MsrValueSource getMsrValueSourceOne(Long id)  {
        MsrValueSourceEntity msrValueSource = msrValueSourceRepo.findById(id).get();

        return MsrValueSource.toModel(msrValueSource);
    }

    public Long delete (Long id){
        msrValueSourceRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrValueSource msrValueSource){
        MsrValueSourceEntity entity =  msrValueSourceRepo.findById(id).get();

        entity.setValue_source_code(msrValueSource.getValue_source_code());
        entity.setValue_source_name(msrValueSource.getValue_source_name());
        entity.setValue_source_sname(msrValueSource.getValue_source_sname());
        entity.setRow_date_begin(msrValueSource.getRow_date_begin());
        entity.setRow_date_end(msrValueSource.getRow_date_end());
        entity.setRow_create_date(msrValueSource.getRow_create_date());
        entity.setRow_create_user(msrValueSource.getRow_create_user());
        entity.setRow_modify_date(msrValueSource.getRow_modify_date());
        entity.setRow_modify_user(msrValueSource.getRow_modify_user());
        entity.setRow_is_ready(msrValueSource.isRow_is_ready());
        msrValueSourceRepo.save(entity);
        return id;

    }

}
