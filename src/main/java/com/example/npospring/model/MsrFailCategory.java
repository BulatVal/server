package com.example.npospring.model;

import com.example.npospring.entity.MsrFailCategoryEntity;
import com.example.npospring.entity.MsrFailTypeEntity;
import com.example.npospring.entity.MsrGroupEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class MsrFailCategory {
    private Long msr_fail_category_id;
    private String msr_fail_category_sysname;
    private String msr_fail_category_name;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;
    private List<MsrFailType> msrFailTypeList;

    public List<MsrFailType> getMsrFailTypeList() {
        return msrFailTypeList;
    }

    public void setMsrFailTypeList(List<MsrFailType> msrFailTypeList) {
        this.msrFailTypeList = msrFailTypeList;
    }



    public static MsrFailCategory toModel(MsrFailCategoryEntity entity){
        MsrFailCategory model =  new MsrFailCategory();

        model.setMsr_fail_category_id(entity.getMsr_fail_category_id());
        model.setMsr_fail_category_name(entity.getMsr_fail_category_name());
        model.setMsr_fail_category_sysname(entity.getMsr_fail_category_sysname());
        model.setMsrFailTypeList(entity.getMsrFailTypeEntityList().stream().map(MsrFailType::toModel).collect(Collectors.toList()));

        model.setRow_date_begin(entity.getRow_date_begin());
        model.setRow_date_end(entity.getRow_date_end());
        model.setRow_create_date(entity.getRow_create_date());
        model.setRow_create_user(entity.getRow_create_user());
        model.setRow_modify_date(entity.getRow_modify_date());
        model.setRow_modify_user(entity.getRow_modify_user());
        model.setRow_is_ready(entity.isRow_is_ready());
        return model;
    }

    public Long getMsr_fail_category_id() {
        return msr_fail_category_id;
    }

    public void setMsr_fail_category_id(Long msr_fail_category_id) {
        this.msr_fail_category_id = msr_fail_category_id;
    }

    public String getMsr_fail_category_sysname() {
        return msr_fail_category_sysname;
    }

    public void setMsr_fail_category_sysname(String msr_fail_category_sysname) {
        this.msr_fail_category_sysname = msr_fail_category_sysname;
    }

    public String getMsr_fail_category_name() {
        return msr_fail_category_name;
    }

    public void setMsr_fail_category_name(String msr_fail_category_name) {
        this.msr_fail_category_name = msr_fail_category_name;
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

    public MsrFailCategory() {
    }
}
