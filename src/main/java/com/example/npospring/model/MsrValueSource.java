package com.example.npospring.model;

import com.example.npospring.entity.MsrDescEntity;
import com.example.npospring.entity.MsrValueSourceEntity;

import java.time.LocalDateTime;

public class MsrValueSource {
    private Long value_source_id;
    private Long value_source_code;
    private String value_source_name;
    private String value_source_sname;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;

    public static  MsrValueSource toModel(MsrValueSourceEntity entity){
        MsrValueSource model =  new MsrValueSource();

        model.setValue_source_id(entity.getValue_source_id());
        model.setValue_source_code(entity.getValue_source_code());
        model.setValue_source_name(entity.getValue_source_name());
        model.setValue_source_sname(entity.getValue_source_sname());
        model.setRow_date_begin(entity.getRow_date_begin());
        model.setRow_date_end(entity.getRow_date_end());
        model.setRow_create_date(entity.getRow_create_date());
        model.setRow_create_user(entity.getRow_create_user());
        model.setRow_modify_date(entity.getRow_modify_date());
        model.setRow_modify_user(entity.getRow_modify_user());
        model.setRow_is_ready(entity.isRow_is_ready());
        return model;
    }

    public Long getValue_source_id() {
        return value_source_id;
    }

    public void setValue_source_id(Long value_source_id) {
        this.value_source_id = value_source_id;
    }

    public Long getValue_source_code() {
        return value_source_code;
    }

    public void setValue_source_code(Long value_source_code) {
        this.value_source_code = value_source_code;
    }

    public String getValue_source_name() {
        return value_source_name;
    }

    public void setValue_source_name(String value_source_name) {
        this.value_source_name = value_source_name;
    }

    public String getValue_source_sname() {
        return value_source_sname;
    }

    public void setValue_source_sname(String value_source_sname) {
        this.value_source_sname = value_source_sname;
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

    public MsrValueSource() {
    }
}
