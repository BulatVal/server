package com.example.npospring.service;

import com.example.npospring.entity.*;
import com.example.npospring.model.MsrFail2;
import com.example.npospring.model.MsrTagLink;
import com.example.npospring.repository.MsrFail2Repo;
import com.example.npospring.repository.MsrFailTypeRepo;
import com.example.npospring.repository.MsrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrFail2Service {

    @Autowired
    MsrFail2Repo msrFail2Repo;
    @Autowired
    MsrRepo msrRepo;
    @Autowired
    MsrFailTypeRepo msrFailTypeRepo;

    public MsrFail2Entity createData(MsrFail2Entity msrFail2Entity, Long msrID, Long failTypeID){

        MsrEntity msrEntity =msrRepo.findById(msrID).get();
        MsrFailTypeEntity msrFailTypeEntity =msrFailTypeRepo.findById(failTypeID).get();

        msrFail2Entity.setMsr_id(msrEntity);
        msrFail2Entity.setMsr_fail_type_id(msrFailTypeEntity);

        return msrFail2Repo.save(msrFail2Entity);
    }

    public MsrFail2 getMsrFail2One(Long id)  {
        MsrFail2Entity msrFail2 = msrFail2Repo.findById(id).get();

        return MsrFail2.toModel(msrFail2);
    }

    public Long delete (Long id){
        msrFail2Repo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrFail2 msrFail2){
        MsrFail2Entity entity =  msrFail2Repo.findById(id).get();

        entity.setMsr_fail_id(msrFail2.getMsr_fail_id());
        entity.setMsr_desc(msrFail2.getMsr_desc());
        msrFail2Repo.save(entity);

        return id;

    }
}
