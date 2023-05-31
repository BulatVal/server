package com.example.npospring.model;

import com.example.npospring.entity.MsrMarkerEntity;

import java.time.LocalDateTime;

public class MsrMarker {

    private Long msr_marker_id;
    private String msr_marker_code;
    private String msr_marker_name;
    private String msr_marker_sname;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();



    private String row_modify_user;
    private boolean row_is_ready = false;

    public static MsrMarker toModel(MsrMarkerEntity entity){
        MsrMarker model =  new MsrMarker();

        model.setMsr_marker_id(entity.getMsr_marker_id());
        model.setMsr_marker_code(entity.getMsr_marker_code());
        model.setMsr_marker_name(entity.getMsr_marker_name());
        model.setMsr_marker_sname(entity.getMsr_marker_sname());

        model.setRow_date_begin(entity.getRow_date_begin());
        model.setRow_date_end(entity.getRow_date_end());
        model.setRow_create_date(entity.getRow_create_date());
        model.setRow_create_user(entity.getRow_create_user());
        model.setRow_modify_date(entity.getRow_modify_date());
        model.setRow_modify_user(entity.getRow_modify_user());
        model.setRow_is_ready(entity.isRow_is_ready());
        return model;
    }

    public Long getMsr_marker_id() {
        return msr_marker_id;
    }

    public void setMsr_marker_id(Long msr_marker_id) {
        this.msr_marker_id = msr_marker_id;
    }

    public String getMsr_marker_code() {
        return msr_marker_code;
    }

    public void setMsr_marker_code(String msr_marker_code) {
        this.msr_marker_code = msr_marker_code;
    }

    public String getMsr_marker_name() {
        return msr_marker_name;
    }

    public void setMsr_marker_name(String msr_marker_name) {
        this.msr_marker_name = msr_marker_name;
    }

    public String getMsr_marker_sname() {
        return msr_marker_sname;
    }

    public void setMsr_marker_sname(String msr_marker_sname) {
        this.msr_marker_sname = msr_marker_sname;
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

    public MsrMarker() {
    }
}
