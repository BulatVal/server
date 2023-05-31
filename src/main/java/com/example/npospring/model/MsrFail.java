package com.example.npospring.model;

import com.example.npospring.entity.MsrFailEntity;

import java.time.LocalDateTime;

public class MsrFail {
    private Long msr_fail_id;
    private String msr_fail_code;
    private String msr_fail_mask_id;
    private String msr_fail_type_id;
    private String msr_fail_sysname;
    private String msr_fail_name;
    private String msr_fail_sname;
    private String msr_fail_desc;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;

    public static MsrFail toModel(MsrFailEntity entity){
        MsrFail model =  new MsrFail();

        model.setMsr_fail_id(entity.getMsr_fail_id());
        model.setMsr_fail_code(entity.getMsr_fail_code());
        model.setMsr_fail_mask_id(entity.getMsr_fail_mask_id());
        model.setMsr_fail_type_id(entity.getMsr_fail_type_id());
        model.setMsr_fail_sysname(entity.getMsr_fail_sysname());
        model.setMsr_fail_name(entity.getMsr_fail_name());
        model.setMsr_fail_sname(entity.getMsr_fail_sname());
        model.setMsr_fail_desc(entity.getMsr_fail_desc());

        model.setRow_date_begin(entity.getRow_date_begin());
        model.setRow_date_end(entity.getRow_date_end());
        model.setRow_create_date(entity.getRow_create_date());
        model.setRow_create_user(entity.getRow_create_user());
        model.setRow_modify_date(entity.getRow_modify_date());
        model.setRow_modify_user(entity.getRow_modify_user());
        model.setRow_is_ready(entity.isRow_is_ready());
        return model;
    }

    public Long getMsr_fail_id() {
        return msr_fail_id;
    }

    public void setMsr_fail_id(Long msr_fail_id) {
        this.msr_fail_id = msr_fail_id;
    }

    public String getMsr_fail_code() {
        return msr_fail_code;
    }

    public void setMsr_fail_code(String msr_fail_code) {
        this.msr_fail_code = msr_fail_code;
    }

    public String getMsr_fail_mask_id() {
        return msr_fail_mask_id;
    }

    public void setMsr_fail_mask_id(String msr_fail_mask_id) {
        this.msr_fail_mask_id = msr_fail_mask_id;
    }

    public String getMsr_fail_type_id() {
        return msr_fail_type_id;
    }

    public void setMsr_fail_type_id(String msr_fail_type_id) {
        this.msr_fail_type_id = msr_fail_type_id;
    }

    public String getMsr_fail_sysname() {
        return msr_fail_sysname;
    }

    public void setMsr_fail_sysname(String msr_fail_sysname) {
        this.msr_fail_sysname = msr_fail_sysname;
    }

    public String getMsr_fail_name() {
        return msr_fail_name;
    }

    public void setMsr_fail_name(String msr_fail_name) {
        this.msr_fail_name = msr_fail_name;
    }

    public String getMsr_fail_sname() {
        return msr_fail_sname;
    }

    public void setMsr_fail_sname(String msr_fail_sname) {
        this.msr_fail_sname = msr_fail_sname;
    }

    public String getMsr_fail_desc() {
        return msr_fail_desc;
    }

    public void setMsr_fail_desc(String msr_fail_desc) {
        this.msr_fail_desc = msr_fail_desc;
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

    public MsrFail() {
    }
}
