package com.example.npospring.service;

import com.example.npospring.entity.MsrMarkerEntity;

import com.example.npospring.model.MsrMarker;

import com.example.npospring.repository.MsrMarkerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrMarkerService {
    @Autowired
    MsrMarkerRepo msrMarkerRepo;

    public MsrMarkerEntity addData(MsrMarkerEntity msrMarkerEntity){
        return msrMarkerRepo.save(msrMarkerEntity);
    }

    public MsrMarker getMsrMarkerOne(Long id)  {
        MsrMarkerEntity msrRejectionEntity = msrMarkerRepo.findById(id).get();

        return MsrMarker.toModel(msrRejectionEntity);
    }

    public Long delete (Long id){
        msrMarkerRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrMarker msrMarker){
        MsrMarkerEntity entity =  msrMarkerRepo.findById(id).get();



        entity.setMsr_marker_code(msrMarker.getMsr_marker_code());
        entity.setMsr_marker_name(msrMarker.getMsr_marker_name());
        entity.setMsr_marker_sname(msrMarker.getMsr_marker_sname());
        entity.setRow_date_begin(msrMarker.getRow_date_begin());
        entity.setRow_date_end(msrMarker.getRow_date_end());
        entity.setRow_create_date(msrMarker.getRow_create_date());
        entity.setRow_create_user(msrMarker.getRow_create_user());
        entity.setRow_modify_date(msrMarker.getRow_modify_date());
        entity.setRow_modify_user(msrMarker.getRow_modify_user());
        entity.setRow_is_ready(msrMarker.isRow_is_ready());
        msrMarkerRepo.save(entity);
        return id;

    }
}
