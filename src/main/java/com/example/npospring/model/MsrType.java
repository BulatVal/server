package com.example.npospring.model;

import com.example.npospring.entity.MsrFailTypeEntity;
import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.entity.MsrTypeEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class MsrType {
    private Long msr_type_id;
    private String msr_type_code;
    private String msr_type_sysname;
    private String msr_type_name;
    private String msr_type_sname;
    private String msr_type_desc;
    private boolean msr_type_auto_process;
    private boolean msr_type_need_check;
    private boolean msr_type_need_calc;
    private boolean msr_type_need_reject;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;



    private List<MsrTagLink> msrTagLinkList;
    private List<Msr> msrList;




    public List<Msr> getMsrList() {
        return msrList;
    }

    public void setMsrList(List<Msr> msrList) {
        this.msrList = msrList;
    }

    public List<MsrTagLink> getMsrTagLinkList() {
        return msrTagLinkList;
    }

    public void setMsrTagLinkList(List<MsrTagLink> msrTagLinkList) {
        this.msrTagLinkList = msrTagLinkList;
    }



    public static  MsrType toModel(MsrTypeEntity entity){
        MsrType model = new MsrType();

        model.setMsr_type_id(entity.getMsr_type_id());
        model.setMsr_type_code(entity.getMsr_type_code());
        model.setMsr_type_sysname(entity.getMsr_type_sysname());
        model.setMsr_type_name(entity.getMsr_type_name());
        model.setMsr_type_sname(entity.getMsr_type_sname());
        model.setMsr_type_desc(entity.getMsr_type_desc());
        model.setMsr_type_auto_process(entity.isMsr_type_auto_process());
        model.setMsr_type_need_check(entity.isMsr_type_need_check());
        model.setMsr_type_need_calc(entity.isMsr_type_need_calc());
        model.setMsr_type_need_reject(entity.isMsr_type_need_reject());
        model.setMsrTagLinkList(entity.getMsrTagLinkEntityList().stream().map(MsrTagLink::toModel).collect(Collectors.toList()));
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

    public Long getMsr_type_id() {
        return msr_type_id;
    }

    public void setMsr_type_id(Long msr_type_id) {
        this.msr_type_id = msr_type_id;
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

    public MsrType() {
    }
}
