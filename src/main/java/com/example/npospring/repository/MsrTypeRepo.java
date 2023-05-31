package com.example.npospring.repository;

import com.example.npospring.entity.MsrFailTypeEntity;

import com.example.npospring.entity.MsrTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface MsrTypeRepo extends CrudRepository<MsrTypeEntity,Long> {
}
