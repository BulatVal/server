package com.example.npospring.repository;

import com.example.npospring.entity.MsrValueEntity;
;
import org.springframework.data.repository.CrudRepository;

public interface MsrValueRepo extends CrudRepository<MsrValueEntity,Long> {
}
