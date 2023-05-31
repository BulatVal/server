package com.example.npospring.model;

import com.example.npospring.entity.SourceEntity;
import com.example.npospring.entity.UserRolesEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UserRoles {
    private Long role_id;
    private String role_name;
    private List<User> userList;

    public static UserRoles toModel(UserRolesEntity entity){
        UserRoles model =new UserRoles();

        model.setRole_id(entity.getRole_id());
        model.setRole_name(entity.getRole_name());
        model.setUserList(entity.getUserEntityList().stream().map(User::toModel).collect(Collectors.toList()));
        return model;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
