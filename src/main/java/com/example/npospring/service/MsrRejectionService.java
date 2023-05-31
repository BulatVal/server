package com.example.npospring.service;

import com.example.npospring.entity.MsrFailCategoryEntity;
import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.entity.MsrRejectionEntity;
import com.example.npospring.model.MsrGroup;
import com.example.npospring.model.MsrRegection;
import com.example.npospring.repository.MsrRejectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrRejectionService {
    @Autowired
    MsrRejectionRepo msrRejectionRepo;

    public MsrRejectionEntity addData(MsrRejectionEntity msrRejectionEntity){
        return msrRejectionRepo.save(msrRejectionEntity);
    }

    public MsrRegection getMsrRejectionOne(Long id)  {
        MsrRejectionEntity msrRejectionEntity = msrRejectionRepo.findById(id).get();

        return MsrRegection.toModel(msrRejectionEntity);
    }

    public Long delete (Long id){
        msrRejectionRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrRegection msrRegection){
        MsrRejectionEntity entity =  msrRejectionRepo.findById(id).get();


        entity.setMsr_rejection_code(msrRegection.getMsr_rejection_code());
        entity.setMsr_type_mask(msrRegection.getMsr_type_mask());
        entity.setMsr_rejection_mask_id(msrRegection.getMsr_rejection_mask_id());
        entity.setMsr_rejection_sysname(msrRegection.getMsr_rejection_sysname());
        entity.setMsr_rejection_name(msrRegection.getMsr_rejection_name());
        entity.setMsr_reejection_sname(msrRegection.getMsr_reejection_sname());
        entity.setMsr_rejection_desc(msrRegection.getMsr_rejection_desc());
        entity.setMsr_rejection_correct(msrRegection.isMsr_rejection_correct());
        entity.setMsr_rejection_recommendation_no(msrRegection.getMsr_rejection_recommendation_no());
        entity.setRow_date_begin(msrRegection.getRow_date_begin());
        entity.setRow_date_end(msrRegection.getRow_date_end());
        entity.setRow_create_date(msrRegection.getRow_create_date());
        entity.setRow_create_user(msrRegection.getRow_create_user());
        entity.setRow_modify_date(msrRegection.getRow_modify_date());
        entity.setRow_modify_user(msrRegection.getRow_modify_user());
        entity.setRow_is_ready(msrRegection.isRow_is_ready());
        msrRejectionRepo.save(entity);
        return id;

    }
}
