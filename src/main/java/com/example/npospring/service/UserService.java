package com.example.npospring.service;

import com.example.npospring.entity.*;
import com.example.npospring.model.Source;
import com.example.npospring.model.User;
import com.example.npospring.repository.UserRepo;
import com.example.npospring.repository.UserRolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserRolesRepo userRolesRepo;

    public UserEntity createData(UserEntity userEntity, Long roleID){

        UserRolesEntity userRolesEntity =userRolesRepo.findById(roleID).get();


        userEntity.setUser_role_id(userRolesEntity);


        return userRepo.save(userEntity);
    }

    public User getSourceOne(Long id)  {
        UserEntity userEntity = userRepo.findById(id).get();

        return User.toModel(userEntity);
    }

    public Long delete (Long id){
        userRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id , User user){
        UserEntity entity =  userRepo.findById(id).get();

        entity.setUser_firstname(user.getUser_firstname());
        entity.setUser_secondname(user.getUser_secondname());
        entity.setUser_thirdname(user.getUser_thirdname());
        entity.setUser_login(user.getUser_login());
        entity.setUser_password(user.getUser_password());


        userRepo.save(entity);
        return id;

    }
}
