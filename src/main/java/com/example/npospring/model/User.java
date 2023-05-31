package com.example.npospring.model;

import com.example.npospring.entity.SourceEntity;
import com.example.npospring.entity.UserEntity;

import java.util.stream.Collectors;

public class User {

    private Long user_id;
    private String user_firstname;
    private String user_secondname;
    private String user_thirdname;
    private String user_login;
    private String user_password;

    public static User toModel(UserEntity entity){
        User model =new User();

        model.setUser_id(entity.getUser_id());
        model.setUser_firstname(entity.getUser_firstname());
        model.setUser_secondname(entity.getUser_secondname());
        model.setUser_thirdname(entity.getUser_thirdname());
        model.setUser_login(entity.getUser_login());
        model.setUser_password(entity.getUser_password());


        return model;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public void setUser_firstname(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public String getUser_secondname() {
        return user_secondname;
    }

    public void setUser_secondname(String user_secondname) {
        this.user_secondname = user_secondname;
    }

    public String getUser_thirdname() {
        return user_thirdname;
    }

    public void setUser_thirdname(String user_thirdname) {
        this.user_thirdname = user_thirdname;
    }
}
