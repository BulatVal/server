package com.example.npospring.service;

import com.example.npospring.entity.SourceEntity;
import com.example.npospring.entity.UserRolesEntity;
import com.example.npospring.model.Source;
import com.example.npospring.model.UserRoles;
import com.example.npospring.repository.SourceRepo;
import com.example.npospring.repository.UserRolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRolesService {

    @Autowired
    UserRolesRepo userRolesRepo;

    public UserRolesEntity addData(UserRolesEntity userRolesEntity){
        return userRolesRepo.save(userRolesEntity);
    }

    public UserRoles getSourceOne(Long id)  {
        UserRolesEntity userRolesEntity = userRolesRepo.findById(id).get();

        return UserRoles.toModel(userRolesEntity);
    }

    public Long delete (Long id){
        userRolesRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , UserRoles source){
        UserRolesEntity entity =  userRolesRepo.findById(id).get();

        entity.setRole_name(source.getRole_name());

        userRolesRepo.save(entity);
        return id;

    }
}
