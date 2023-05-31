package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MsrStateEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long msr_state_id;
    private String msr_state_sysname;
    private String msr_state_code;
    private String msr_state_name;
    private String msr_state_sname;
    private String msr_state_desc;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_state_id")
    @JsonIgnore
    private List<MsrEntity> msrEntityList;

    public List<MsrEntity> getMsrEntityList() {
        return msrEntityList;
    }

    public void setMsrEntityList(List<MsrEntity> msrEntityList) {
        this.msrEntityList = msrEntityList;
    }

    public Long getMsr_state_id() {
        return msr_state_id;
    }

    public void setMsr_state_id(Long msr_state_id) {
        this.msr_state_id = msr_state_id;
    }

    public String getMsr_state_sysname() {
        return msr_state_sysname;
    }

    public void setMsr_state_sysname(String msr_state_sysname) {
        this.msr_state_sysname = msr_state_sysname;
    }

    public String getMsr_state_code() {
        return msr_state_code;
    }

    public void setMsr_state_code(String msr_state_code) {
        this.msr_state_code = msr_state_code;
    }

    public String getMsr_state_name() {
        return msr_state_name;
    }

    public void setMsr_state_name(String msr_state_name) {
        this.msr_state_name = msr_state_name;
    }

    public String getMsr_state_sname() {
        return msr_state_sname;
    }

    public void setMsr_state_sname(String msr_state_sname) {
        this.msr_state_sname = msr_state_sname;
    }

    public String getMsr_state_desc() {
        return msr_state_desc;
    }

    public void setMsr_state_desc(String msr_state_desc) {
        this.msr_state_desc = msr_state_desc;
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

    public MsrStateEntity() {
    }
}
