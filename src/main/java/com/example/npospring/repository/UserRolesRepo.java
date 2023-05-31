package com.example.npospring.repository;

import com.example.npospring.entity.UserRolesEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRolesRepo extends CrudRepository<UserRolesEntity,Long> {
}
