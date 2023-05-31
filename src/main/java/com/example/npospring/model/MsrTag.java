package com.example.npospring.model;

import com.example.npospring.entity.MsrTagEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class MsrTag {
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

    public List<MsrTagLink> getMsrTagLinkList() {
        return msrTagLinkList;
    }

    public void setMsrTagLinkList(List<MsrTagLink> msrTagLinkList) {
        this.msrTagLinkList = msrTagLinkList;
    }

    private List<MsrTagLink> msrTagLinkList;

    public static MsrTag toModel(MsrTagEntity entity){
        MsrTag model  = new MsrTag();

        model.setMsr_tag_id(entity.getMsr_tag_id());
        model.setMsr_tag_name(entity.getMsr_tag_name());
        model.setMsr_tag_sname(entity.getMsr_tag_sname());
        model.setMsrTagLinkList(entity.getMsrTagEntityList().stream().map(MsrTagLink::toModel).collect(Collectors.toList()));

        model.setRow_date_begin(entity.getRow_date_begin());
        model.setRow_date_end(entity.getRow_date_end());
        model.setRow_create_date(entity.getRow_create_date());
        model.setRow_create_user(entity.getRow_create_user());
        model.setRow_modify_date(entity.getRow_modify_date());
        model.setRow_modify_user(entity.getRow_modify_user());
        model.setRow_is_ready(entity.isRow_is_ready());
        return model;
    }

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

    public MsrTag() {
    }
}
