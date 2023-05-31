package com.example.npospring.service;

import com.example.npospring.entity.MsrFailEntity;
import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.model.MsrFail;
import com.example.npospring.model.MsrGroup;
import com.example.npospring.repository.MsrFailRepo;
import com.example.npospring.repository.MsrGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrFailService {
    @Autowired
    MsrFailRepo msrFailRepo;

    public MsrFailEntity addData(MsrFailEntity msrFailEntity){
        return msrFailRepo.save(msrFailEntity);
    }

    public MsrFail getMsrFailOne(Long id)  {
        MsrFailEntity msrFail = msrFailRepo.findById(id).get();

        return MsrFail.toModel(msrFail);
    }

    public Long delete (Long id){
        msrFailRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrFail msrFail){
        MsrFailEntity entity =  msrFailRepo.findById(id).get();


        entity.setMsr_fail_code(msrFail.getMsr_fail_code());
        entity.setMsr_fail_mask_id(msrFail.getMsr_fail_mask_id());
        entity.setMsr_fail_type_id(msrFail.getMsr_fail_type_id());
        entity.setMsr_fail_sysname(msrFail.getMsr_fail_sysname());
        entity.setMsr_fail_name(msrFail.getMsr_fail_name());
        entity.setMsr_fail_sname(msrFail.getMsr_fail_sname());
        entity.setMsr_fail_desc(msrFail.getMsr_fail_desc());

        entity.setRow_date_begin(msrFail.getRow_date_begin());
        entity.setRow_date_end(msrFail.getRow_date_end());
        entity.setRow_create_date(msrFail.getRow_create_date());
        entity.setRow_create_user(msrFail.getRow_create_user());
        entity.setRow_modify_date(msrFail.getRow_modify_date());
        entity.setRow_modify_user(msrFail.getRow_modify_user());
        entity.setRow_is_ready(msrFail.isRow_is_ready());
        msrFailRepo.save(entity);

        return id;

    }
}
