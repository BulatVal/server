package com.example.npospring.service;

import com.example.npospring.entity.MsrDescEntity;
import com.example.npospring.entity.MsrEntity;
import com.example.npospring.exception.MsrDescNotFoundException;
import com.example.npospring.model.MsrDesc;
import com.example.npospring.repository.MsrDescRepo;
import com.example.npospring.repository.MsrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrDescService {

    @Autowired
    private MsrDescRepo msrDescRepo;
    @Autowired
    private MsrRepo msrRepo;
    public MsrDescEntity addData(MsrDescEntity msrDescEntity, Long msrID){
        MsrEntity msrEntity = msrRepo.findById(msrID).get();
        msrDescEntity.setMsr_id(msrEntity);

        return msrDescRepo.save(msrDescEntity);
    }

    public MsrDesc getMsrDescOne(Long id) throws MsrDescNotFoundException {
        MsrDescEntity msrDesc = msrDescRepo.findById(id).get();
        if ( msrDesc == null){
            throw new MsrDescNotFoundException("Запись не найдена");
        }
        return MsrDesc.toModel(msrDesc);
    }

    public Long delete(Long id){
        msrDescRepo.deleteById(id);
        return  id;
    }

    public Long updateData(Long id , MsrDesc msrDesc){
        MsrDescEntity entity =  msrDescRepo.findById(id).get();
        entity.setMsr_desc(msrDesc.getMsr_desc());
        msrDescRepo.save(entity);
        return id;

    }



}
