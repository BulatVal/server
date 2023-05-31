package com.example.npospring.repository;

import com.example.npospring.entity.UserEntity;
import com.example.npospring.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity,Long> {
}
