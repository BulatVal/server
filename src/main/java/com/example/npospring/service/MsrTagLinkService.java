package com.example.npospring.service;

import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.entity.MsrTagEntity;
import com.example.npospring.entity.MsrTagLinkEntity;
import com.example.npospring.entity.MsrTypeEntity;
import com.example.npospring.model.MsrTagLink;
import com.example.npospring.model.MsrType;
import com.example.npospring.repository.MsrGroupRepo;
import com.example.npospring.repository.MsrTagLinkRepo;
import com.example.npospring.repository.MsrTagRepo;
import com.example.npospring.repository.MsrTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsrTagLinkService {
    @Autowired
    MsrTagLinkRepo msrTagLinkRepo;
    @Autowired
    MsrTagRepo msrTagRepo;
    @Autowired
    MsrTypeRepo msrTypeRepo;


    public MsrTagLinkEntity createData(MsrTagLinkEntity msrTagLinkEntity, Long tagID, Long typeID){

        MsrTagEntity msrTagEntity =msrTagRepo.findById(tagID).get();
        MsrTypeEntity msrTypeEntity =msrTypeRepo.findById(typeID).get();

        msrTagLinkEntity.setMsr_tag_id(msrTagEntity);
        msrTagLinkEntity.setMsr_type_id(msrTypeEntity);

        return msrTagLinkRepo.save(msrTagLinkEntity);
    }

    public MsrTagLink getMsrTagLinkOne(Long id)  {
        MsrTagLinkEntity msrTagLink = msrTagLinkRepo.findById(id).get();

        return MsrTagLink.toModel(msrTagLink);
    }

    public Long delete (Long id){
        msrTagLinkRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , MsrTagLink msrTagLink){
        MsrTagLinkEntity entity =  msrTagLinkRepo.findById(id).get();

        entity.setRow_date_begin(msrTagLink.getRow_date_begin());
        entity.setRow_date_end(msrTagLink.getRow_date_end());
        entity.setRow_create_date(msrTagLink.getRow_create_date());
        entity.setRow_create_user(msrTagLink.getRow_create_user());
        entity.setRow_modify_date(msrTagLink.getRow_modify_date());
        entity.setRow_modify_user(msrTagLink.getRow_modify_user());
        entity.setRow_is_ready(msrTagLink.isRow_is_ready());
        msrTagLinkRepo.save(entity);

        return id;

    }
}
