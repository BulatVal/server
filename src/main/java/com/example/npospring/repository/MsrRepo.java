package com.example.npospring.repository;

import com.example.npospring.entity.MsrEntity;
import org.springframework.data.repository.CrudRepository;

public interface MsrRepo extends CrudRepository<MsrEntity,Long> {
}
