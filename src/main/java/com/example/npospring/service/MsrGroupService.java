package com.example.npospring.service;

import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.entity.MsrTagEntity;
import com.example.npospring.model.MsrGroup;
import com.example.npospring.model.MsrTag;
import com.example.npospring.repository.MsrGroupRepo;
import com.example.npospring.repository.MsrTagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrGroupService {
    @Autowired
    MsrGroupRepo msrGroupRepo;

    public MsrGroupEntity addData(MsrGroupEntity msrGroupEntity){
        return msrGroupRepo.save(msrGroupEntity);
    }

    public MsrGroup getMsrGroupOne(Long id)  {
        MsrGroupEntity msrGroup = msrGroupRepo.findById(id).get();

        return MsrGroup.toModel(msrGroup);
    }

    public Long delete (Long id){
        msrGroupRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrGroup msrGroup){
        MsrGroupEntity entity =  msrGroupRepo.findById(id).get();


        entity.setMsr_group_name(msrGroup.getMsr_group_name());
        entity.setMsr_group_sname(msrGroup.getMsr_group_sname());
        entity.setRow_date_begin(msrGroup.getRow_date_begin());
        entity.setRow_date_end(msrGroup.getRow_date_end());
        entity.setRow_create_date(msrGroup.getRow_create_date());
        entity.setRow_create_user(msrGroup.getRow_create_user());
        entity.setRow_modify_date(msrGroup.getRow_modify_date());
        entity.setRow_modify_user(msrGroup.getRow_modify_user());
        entity.setRow_is_ready(msrGroup.isRow_is_ready());
        msrGroupRepo.save(entity);

        return id;

    }
}
