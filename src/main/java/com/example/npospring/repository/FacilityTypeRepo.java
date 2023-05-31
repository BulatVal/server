package com.example.npospring.repository;

import com.example.npospring.entity.FacilityTypeEntity;
import com.example.npospring.model.FacilityType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacilityTypeRepo extends CrudRepository<FacilityTypeEntity,Long> {

}
