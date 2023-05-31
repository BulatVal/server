package com.example.npospring.service;

import com.example.npospring.entity.MsrFailCategoryEntity;
import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.model.MsrFailCategory;
import com.example.npospring.model.MsrGroup;
import com.example.npospring.repository.MsrFailCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrFailCategoryService {

    @Autowired
    MsrFailCategoryRepo msrFailCategoryRepo;

    public MsrFailCategoryEntity addData(MsrFailCategoryEntity msrFailCategoryEntity){
        return msrFailCategoryRepo.save(msrFailCategoryEntity);
    }

    public MsrFailCategory getMsrFailCategoryOne(Long id)  {
        MsrFailCategoryEntity msrFailCategory = msrFailCategoryRepo.findById(id).get();

        return MsrFailCategory.toModel(msrFailCategory);
    }

    public Long delete (Long id){
        msrFailCategoryRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrFailCategory msrFailCategory){
        MsrFailCategoryEntity entity =  msrFailCategoryRepo.findById(id).get();


        entity.setMsr_fail_category_sysname(msrFailCategory.getMsr_fail_category_sysname());
        entity.setMsr_fail_category_name(msrFailCategory.getMsr_fail_category_name());
        entity.setRow_date_begin(msrFailCategory.getRow_date_begin());
        entity.setRow_date_end(msrFailCategory.getRow_date_end());
        entity.setRow_create_date(msrFailCategory.getRow_create_date());
        entity.setRow_create_user(msrFailCategory.getRow_create_user());
        entity.setRow_modify_date(msrFailCategory.getRow_modify_date());
        entity.setRow_modify_user(msrFailCategory.getRow_modify_user());
        entity.setRow_is_ready(msrFailCategory.isRow_is_ready());
        msrFailCategoryRepo.save(entity);
        return id;

    }
}
