package com.example.npospring.service;

import com.example.npospring.entity.MsrDescEntity;
import com.example.npospring.entity.MsrTagEntity;
import com.example.npospring.exception.MsrDescNotFoundException;
import com.example.npospring.model.MsrDesc;
import com.example.npospring.model.MsrTag;
import com.example.npospring.repository.MsrTagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrTagService {

    @Autowired
    MsrTagRepo msrTagRepo;

    public MsrTagEntity addData(MsrTagEntity msrTagEntity){
        return msrTagRepo.save(msrTagEntity);
    }

    public MsrTag getMsrTagOne(Long id)  {
        MsrTagEntity msrTag = msrTagRepo.findById(id).get();

        return MsrTag.toModel(msrTag);
    }

    public Long delete (Long id){
        msrTagRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrTag msrTag){
        MsrTagEntity entity =  msrTagRepo.findById(id).get();

        entity.setMsr_tag_name(msrTag.getMsr_tag_name());
        entity.setMsr_tag_sname(msrTag.getMsr_tag_sname());
        entity.setRow_date_begin(msrTag.getRow_date_begin());
        entity.setRow_date_end(msrTag.getRow_date_end());
        entity.setRow_create_date(msrTag.getRow_create_date());
        entity.setRow_create_user(msrTag.getRow_create_user());
        entity.setRow_modify_date(msrTag.getRow_modify_date());
        entity.setRow_modify_user(msrTag.getRow_modify_user());
        entity.setRow_is_ready(msrTag.isRow_is_ready());
        msrTagRepo.save(entity);
        return id;

    }
}
