package com.example.npospring.model;

import com.example.npospring.entity.MsrStateEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class MsrState {
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
    private List<Msr> msrList;

    public List<Msr> getMsrList() {
        return msrList;
    }

    public void setMsrList(List<Msr> msrList) {
        this.msrList = msrList;
    }

    public static  MsrState toModel(MsrStateEntity entity){
        MsrState model = new MsrState();

        model.setMsr_state_id(entity.getMsr_state_id());
        model.setMsr_state_sysname(entity.getMsr_state_sysname());
        model.setMsr_state_code(entity.getMsr_state_code());
        model.setMsr_state_name(entity.getMsr_state_name());
        model.setMsr_state_sname(entity.getMsr_state_sname());
        model.setMsr_state_desc(entity.getMsr_state_desc());
        model.setMsrList(entity.getMsrEntityList().stream().map(Msr::toModel).collect(Collectors.toList()));

        model.setRow_date_begin(entity.getRow_date_begin());
        model.setRow_date_end(entity.getRow_date_end());
        model.setRow_create_date(entity.getRow_create_date());
        model.setRow_create_user(entity.getRow_create_user());
        model.setRow_modify_date(entity.getRow_modify_date());
        model.setRow_modify_user(entity.getRow_modify_user());
        model.setRow_is_ready(entity.isRow_is_ready());

        return model;
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

    public MsrState() {
    }
}
