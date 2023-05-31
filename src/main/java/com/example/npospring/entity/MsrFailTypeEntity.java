package com.example.npospring.entity;

import com.example.npospring.model.MsrFailCategory;
import com.example.npospring.model.MsrFailSeverity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MsrFailTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msr_fail_type_id;
    @ManyToOne
    @JoinColumn(name = "msr_fail_category_id")
    private MsrFailCategoryEntity msr_fail_category_id;
    @ManyToOne
    @JoinColumn(name = "msr_fail_severity_id")
    private MsrFailSeverityEntity msr_fail_severity_id;
    private String msr_fail_type_sysname;
    private String msr_fail_type_name;
    private String msr_fail_type_sname;
    private boolean msr_fail_type_need_recalc;
    private boolean msr_fail_type_desc;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();

    private String row_modify_user;
    private boolean row_is_ready = false;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_fail_type_id")
    @JsonIgnore
    private List<MsrFail2Entity> msrFail2EntityList;

    public List<MsrFail2Entity> getMsrFail2EntityList() {
        return msrFail2EntityList;
    }

    public void setMsrFail2EntityList(List<MsrFail2Entity> msrFail2EntityList) {
        this.msrFail2EntityList = msrFail2EntityList;
    }

    public Long getMsr_fail_type_id() {
        return msr_fail_type_id;
    }

    public void setMsr_fail_type_id(Long msr_fail_type_id) {
        this.msr_fail_type_id = msr_fail_type_id;
    }

    public MsrFailCategoryEntity getMsr_fail_category_id() {
        return msr_fail_category_id;
    }

    public void setMsr_fail_category_id(MsrFailCategoryEntity msr_fail_category_id) {
        this.msr_fail_category_id = msr_fail_category_id;
    }

    public MsrFailSeverityEntity getMsr_fail_severity_id() {
        return msr_fail_severity_id;
    }

    public void setMsr_fail_severity_id(MsrFailSeverityEntity msr_fail_severity_id) {
        this.msr_fail_severity_id = msr_fail_severity_id;
    }

    public String getMsr_fail_type_sysname() {
        return msr_fail_type_sysname;
    }

    public void setMsr_fail_type_sysname(String msr_fail_type_sysname) {
        this.msr_fail_type_sysname = msr_fail_type_sysname;
    }

    public String getMsr_fail_type_name() {
        return msr_fail_type_name;
    }

    public void setMsr_fail_type_name(String msr_fail_type_name) {
        this.msr_fail_type_name = msr_fail_type_name;
    }

    public String getMsr_fail_type_sname() {
        return msr_fail_type_sname;
    }

    public void setMsr_fail_type_sname(String msr_fail_type_sname) {
        this.msr_fail_type_sname = msr_fail_type_sname;
    }

    public boolean isMsr_fail_type_need_recalc() {
        return msr_fail_type_need_recalc;
    }

    public void setMsr_fail_type_need_recalc(boolean msr_fail_type_need_recalc) {
        this.msr_fail_type_need_recalc = msr_fail_type_need_recalc;
    }

    public boolean isMsr_fail_type_desc() {
        return msr_fail_type_desc;
    }

    public void setMsr_fail_type_desc(boolean msr_fail_type_desc) {
        this.msr_fail_type_desc = msr_fail_type_desc;
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

    public MsrFailTypeEntity() {
    }
}
