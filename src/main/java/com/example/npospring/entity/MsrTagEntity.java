package com.example.npospring.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MsrTagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msr_tag_id;
    private String msr_tag_name;
    private String msr_tag_sname;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;


    public List<MsrTagLinkEntity> getMsrTagEntityList() {
        return msrTagEntityList;
    }

    public void setMsrTagEntityList(List<MsrTagLinkEntity> msrTagEntityList) {
        this.msrTagEntityList = msrTagEntityList;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_tag_id")
    private List<MsrTagLinkEntity> msrTagEntityList;

    public Long getMsr_tag_id() {
        return msr_tag_id;
    }

    public void setMsr_tag_id(Long msr_tag_id) {
        this.msr_tag_id = msr_tag_id;
    }

    public String getMsr_tag_name() {
        return msr_tag_name;
    }

    public void setMsr_tag_name(String msr_tag_name) {
        this.msr_tag_name = msr_tag_name;
    }

    public String getMsr_tag_sname() {
        return msr_tag_sname;
    }

    public void setMsr_tag_sname(String msr_tag_sname) {
        this.msr_tag_sname = msr_tag_sname;
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

    public MsrTagEntity() {
    }
}
