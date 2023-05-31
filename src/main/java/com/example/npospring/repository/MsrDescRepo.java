package com.example.npospring.repository;

import com.example.npospring.entity.MsrDescEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MsrDescRepo extends CrudRepository <MsrDescEntity,Long> {
    List< MsrDescEntity > findAll();
}
