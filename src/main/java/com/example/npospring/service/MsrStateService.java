package com.example.npospring.service;

import com.example.npospring.entity.MsrRejectionEntity;
import com.example.npospring.entity.MsrStateEntity;
import com.example.npospring.model.MsrRegection;
import com.example.npospring.model.MsrState;
import com.example.npospring.repository.MsrStateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrStateService {

    @Autowired
    MsrStateRepo msrStateRepo;

    public MsrStateEntity addData(MsrStateEntity msrStateEntity){
        return msrStateRepo.save(msrStateEntity);
    }

    public MsrState getMsrStateOne(Long id)  {
        MsrStateEntity msrStateEntity = msrStateRepo.findById(id).get();

        return MsrState.toModel(msrStateEntity);
    }

    public Long delete (Long id){
        msrStateRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrState msrState){
        MsrStateEntity entity =  msrStateRepo.findById(id).get();

        entity.setMsr_state_id(msrState.getMsr_state_id());
        entity.setMsr_state_sysname(msrState.getMsr_state_sysname());
        entity.setMsr_state_code(msrState.getMsr_state_code());
        entity.setMsr_state_name(msrState.getMsr_state_name());
        entity.setMsr_state_sname(msrState.getMsr_state_sname());
        entity.setMsr_state_desc(msrState.getMsr_state_desc());

        entity.setRow_date_begin(msrState.getRow_date_begin());
        entity.setRow_date_end(msrState.getRow_date_end());
        entity.setRow_create_date(msrState.getRow_create_date());
        entity.setRow_create_user(msrState.getRow_create_user());
        entity.setRow_modify_date(msrState.getRow_modify_date());
        entity.setRow_modify_user(msrState.getRow_modify_user());
        entity.setRow_is_ready(msrState.isRow_is_ready());
        msrStateRepo.save(entity);
        return id;

    }
}
