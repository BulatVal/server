package com.example.npospring.model;

import com.example.npospring.entity.MsrDescEntity;
import com.example.npospring.entity.MsrGroupEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class MsrGroup {
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

    public List<MsrType> getMsrTypeList() {
        return msrTypeList;
    }

    public void setMsrTypeList(List<MsrType> msrTypeList) {
        this.msrTypeList = msrTypeList;
    }

    private List<MsrType> msrTypeList;

    public static  MsrGroup toModel(MsrGroupEntity entity){
        MsrGroup model =  new MsrGroup();

        model.setMsr_group_id(entity.getMsr_group_id());
        model.setMsr_group_name(entity.getMsr_group_name());
        model.setMsr_group_sname(entity.getMsr_group_sname());
        model.setMsrTypeList(entity.getMsrTypeEntityList().stream().map(MsrType::toModel).collect(Collectors.toList()));

        model.setRow_date_begin(entity.getRow_date_begin());
        model.setRow_date_end(entity.getRow_date_end());
        model.setRow_create_date(entity.getRow_create_date());
        model.setRow_create_user(entity.getRow_create_user());
        model.setRow_modify_date(entity.getRow_modify_date());
        model.setRow_modify_user(entity.getRow_modify_user());
        model.setRow_is_ready(entity.isRow_is_ready());
        return model;
    }

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

    public MsrGroup() {
    }
}
