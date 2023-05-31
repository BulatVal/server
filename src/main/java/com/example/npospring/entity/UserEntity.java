package com.example.npospring.entity;

import jakarta.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String user_firstname;
    private String user_secondname;
    private String user_thirdname;
    private String user_login;
    private String user_password;
    @ManyToOne
    @JoinColumn(name = "user_role_id")
    private UserRolesEntity user_role_id;

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

    public UserRolesEntity getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(UserRolesEntity user_role_id) {
        this.user_role_id = user_role_id;
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
