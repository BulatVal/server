package com.example.npospring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class MsrRejectionEntity {

    public Long getMsr_rejection_id() {
        return msr_rejection_id;
    }

    public void setMsr_rejection_id(Long msr_rejection_id) {
        this.msr_rejection_id = msr_rejection_id;
    }

    public String getMsr_rejection_code() {
        return msr_rejection_code;
    }

    public void setMsr_rejection_code(String msr_rejection_code) {
        this.msr_rejection_code = msr_rejection_code;
    }

    public String getMsr_type_mask() {
        return msr_type_mask;
    }

    public void setMsr_type_mask(String msr_type_mask) {
        this.msr_type_mask = msr_type_mask;
    }

    public Long getMsr_rejection_mask_id() {
        return msr_rejection_mask_id;
    }

    public void setMsr_rejection_mask_id(Long msr_rejection_mask_id) {
        this.msr_rejection_mask_id = msr_rejection_mask_id;
    }

    public String getMsr_rejection_sysname() {
        return msr_rejection_sysname;
    }

    public void setMsr_rejection_sysname(String msr_rejection_sysname) {
        this.msr_rejection_sysname = msr_rejection_sysname;
    }

    public String getMsr_rejection_name() {
        return msr_rejection_name;
    }

    public void setMsr_rejection_name(String msr_rejection_name) {
        this.msr_rejection_name = msr_rejection_name;
    }

    public String getMsr_reejection_sname() {
        return msr_reejection_sname;
    }

    public void setMsr_reejection_sname(String msr_reejection_sname) {
        this.msr_reejection_sname = msr_reejection_sname;
    }

    public String getMsr_rejection_desc() {
        return msr_rejection_desc;
    }

    public void setMsr_rejection_desc(String msr_rejection_desc) {
        this.msr_rejection_desc = msr_rejection_desc;
    }

    public boolean isMsr_rejection_correct() {
        return msr_rejection_correct;
    }

    public void setMsr_rejection_correct(boolean msr_rejection_correct) {
        this.msr_rejection_correct = msr_rejection_correct;
    }

    public int getMsr_rejection_recommendation_no() {
        return msr_rejection_recommendation_no;
    }

    public void setMsr_rejection_recommendation_no(int msr_rejection_recommendation_no) {
        this.msr_rejection_recommendation_no = msr_rejection_recommendation_no;
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

    public MsrRejectionEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msr_rejection_id;
    private String msr_rejection_code;
    private String msr_type_mask;
    private Long msr_rejection_mask_id;
    private String msr_rejection_sysname;
    private String msr_rejection_name;
    private String msr_reejection_sname;
    private String msr_rejection_desc;
    private boolean msr_rejection_correct;
    private int msr_rejection_recommendation_no;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;

}
