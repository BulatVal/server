package com.example.npospring.service;

import com.example.npospring.entity.MsrValueSourceEntity;
import com.example.npospring.entity.SourceEntity;
import com.example.npospring.model.MsrValueSource;
import com.example.npospring.model.Source;
import com.example.npospring.repository.SourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceService {

    @Autowired
    SourceRepo sourceRepo;

    public SourceEntity addData(SourceEntity sourceEntity){
        return sourceRepo.save(sourceEntity);
    }

    public Source getSourceOne(Long id)  {
        SourceEntity sourceEntity = sourceRepo.findById(id).get();

        return Source.toModel(sourceEntity);
    }

    public Long delete (Long id){
        sourceRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , Source source){
        SourceEntity entity =  sourceRepo.findById(id).get();

        entity.setSource_name(source.getSource_name());

        sourceRepo.save(entity);
        return id;

    }
}
