package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MsrTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msr_type_id;
    @ManyToOne
    @JoinColumn(name = "msr_group_id")
    private MsrGroupEntity msr_group_id;
    private String msr_type_code;
    private String msr_type_sysname;
    private String msr_type_name;
    private String msr_type_sname;
    private String msr_type_desc;
    private boolean msr_type_auto_process =false;
    private boolean msr_type_need_check =false;
    private boolean msr_type_need_calc =false;
    private boolean msr_type_need_reject =false;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_type_id")
    @JsonIgnore
    private List<MsrTagLinkEntity> msrTagLinkEntityList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_type_id")
    @JsonIgnore
    private List<MsrEntity> msrEntityList;


    public List<MsrEntity> getMsrEntityList() {
        return msrEntityList;
    }

    public void setMsrEntityList(List<MsrEntity> msrEntityList) {
        this.msrEntityList = msrEntityList;
    }

    public List<MsrTagLinkEntity> getMsrTagLinkEntityList() {
        return msrTagLinkEntityList;
    }

    public void setMsrTagLinkEntityList(List<MsrTagLinkEntity> msrTagLinkEntityList) {
        this.msrTagLinkEntityList = msrTagLinkEntityList;
    }

    public Long getMsr_type_id() {
        return msr_type_id;
    }

    public void setMsr_type_id(Long msr_type_id) {
        this.msr_type_id = msr_type_id;
    }

    public MsrGroupEntity getMsr_group_id() {
        return msr_group_id;
    }

    public void setMsr_group_id(MsrGroupEntity msr_group_id) {
        this.msr_group_id = msr_group_id;
    }

    public String getMsr_type_code() {
        return msr_type_code;
    }

    public void setMsr_type_code(String msr_type_code) {
        this.msr_type_code = msr_type_code;
    }

    public String getMsr_type_sysname() {
        return msr_type_sysname;
    }

    public void setMsr_type_sysname(String msr_type_sysname) {
        this.msr_type_sysname = msr_type_sysname;
    }

    public String getMsr_type_name() {
        return msr_type_name;
    }

    public void setMsr_type_name(String msr_type_name) {
        this.msr_type_name = msr_type_name;
    }

    public String getMsr_type_sname() {
        return msr_type_sname;
    }

    public void setMsr_type_sname(String msr_type_sname) {
        this.msr_type_sname = msr_type_sname;
    }

    public String getMsr_type_desc() {
        return msr_type_desc;
    }

    public void setMsr_type_desc(String msr_type_desc) {
        this.msr_type_desc = msr_type_desc;
    }

    public boolean isMsr_type_auto_process() {
        return msr_type_auto_process;
    }

    public void setMsr_type_auto_process(boolean msr_type_auto_process) {
        this.msr_type_auto_process = msr_type_auto_process;
    }

    public boolean isMsr_type_need_check() {
        return msr_type_need_check;
    }

    public void setMsr_type_need_check(boolean msr_type_need_check) {
        this.msr_type_need_check = msr_type_need_check;
    }

    public boolean isMsr_type_need_calc() {
        return msr_type_need_calc;
    }

    public void setMsr_type_need_calc(boolean msr_type_need_calc) {
        this.msr_type_need_calc = msr_type_need_calc;
    }

    public boolean isMsr_type_need_reject() {
        return msr_type_need_reject;
    }

    public void setMsr_type_need_reject(boolean msr_type_need_reject) {
        this.msr_type_need_reject = msr_type_need_reject;
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

    public MsrTypeEntity() {
    }
}
