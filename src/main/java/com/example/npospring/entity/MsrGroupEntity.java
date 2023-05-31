package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MsrGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msr_group_id;
    private String msr_group_name;
    private String msr_group_sname;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;

    public List<MsrTypeEntity> getMsrTypeEntityList() {
        return msrTypeEntityList;
    }

    public void setMsrTypeEntityList(List<MsrTypeEntity> msrTypeEntityList) {
        this.msrTypeEntityList = msrTypeEntityList;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_group_id")
    @JsonIgnore
    private List<MsrTypeEntity> msrTypeEntityList;

    public Long getMsr_group_id() {
        return msr_group_id;
    }

    public void setMsr_group_id(Long msr_group_id) {
        this.msr_group_id = msr_group_id;
    }

    public String getMsr_group_name() {
        return msr_group_name;
    }

    public void setMsr_group_name(String msr_group_name) {
        this.msr_group_name = msr_group_name;
    }

    public String getMsr_group_sname() {
        return msr_group_sname;
    }

    public void setMsr_group_sname(String msr_group_sname) {
        this.msr_group_sname = msr_group_sname;
    }

    public LocalDateTime getRow_date_begin() {
        return row_date_begin;
    }

    public void setRow_date_begin(LocalDateTime row_date_begin) {
        this.row_date_begin = row_date_begin;
    }

    public LocalDateTime getRow_date_end() {
        return row_date_end;
    }

    public void setRow_date_end(LocalDateTime row_date_end) {
        this.row_date_end = row_date_end;
    }

    public LocalDateTime getRow_create_date() {
        return row_create_date;
    }

    public void setRow_create_date(LocalDateTime row_create_date) {
        this.row_create_date = row_create_date;
    }

    public String getRow_create_user() {
        return row_create_user;
    }

    public void setRow_create_user(String row_create_user) {
        this.row_create_user = row_create_user;
    }

    public LocalDateTime getRow_modify_date() {
        return row_modify_date;
    }

    public void setRow_modify_date(LocalDateTime row_modify_date) {
        this.row_modify_date = row_modify_date;
    }

    public String getRow_modify_user() {
        return row_modify_user;
    }

    public void setRow_modify_user(String row_modify_user) {
        this.row_modify_user = row_modify_user;
    }

    public boolean isRow_is_ready() {
        return row_is_ready;
    }

    public void setRow_is_ready(boolean row_is_ready) {
        this.row_is_ready = row_is_ready;
    }

    public MsrGroupEntity() {
    }
}
