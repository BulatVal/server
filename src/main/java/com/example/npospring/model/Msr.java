package com.example.npospring.model;

import com.example.npospring.entity.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Msr {
    private Long msr_id;


    private int msr_parent_id;
    private Date msr_date;

    private boolean msr_control;
    private Date rejection_date;
    private int msr_number;

    private String msr_desc;
    private List<MsrDesc> msrDescList;
    private List<MsrValue> msrValueList;
    private List<MsrFail2> msrFail2List;

    public String getMsr_desc() {
        return msr_desc;
    }

    public void setMsr_desc(String msr_desc) {
        this.msr_desc = msr_desc;
    }

    public List<MsrFail2> getMsrFail2List() {
        return msrFail2List;
    }

    public void setMsrFail2List(List<MsrFail2> msrFail2List) {
        this.msrFail2List = msrFail2List;
    }

    public List<MsrValue> getMsrValueList() {
        return msrValueList;
    }

    public void setMsrValueList(List<MsrValue> msrValueList) {
        this.msrValueList = msrValueList;
    }

    public List<MsrDesc> getMsrDescList() {
        return msrDescList;
    }

    public void setMsrDescList(List<MsrDesc> msrDescList) {
        this.msrDescList = msrDescList;
    }

    public static Msr toModel(MsrEntity entity){
        Msr model =  new Msr();


        model.setMsr_id(entity.getMsr_id());
        model.setMsr_parent_id(entity.getMsr_parent_id());
        model.setMsrDescList(entity.getMsrDescEntityList().stream().map(MsrDesc::toModel).collect(Collectors.toList()));
        model.setMsrValueList(entity.getMsrValueEntityList().stream().map(MsrValue::toModel).collect(Collectors.toList()));
        model.setMsrFail2List(entity.getMsrFail2EntityList().stream().map(MsrFail2::toModel).collect(Collectors.toList()));
        model.setMsr_desc(entity.getMsr_desc());

        model.setMsr_date(entity.getMsr_date());
        model.setRejection_date(entity.getRejection_date());
        model.setMsr_control(entity.isMsr_control());
        model.setRejection_date(entity.getRejection_date());
        model.setMsr_number(entity.getMsr_number());

        return model;
    }

    public Long getMsr_id() {
        return msr_id;
    }

    public void setMsr_id(Long msr_id) {
        this.msr_id = msr_id;
    }

    public int getMsr_parent_id() {
        return msr_parent_id;
    }

    public void setMsr_parent_id(int msr_parent_id) {
        this.msr_parent_id = msr_parent_id;
    }

    public Date getMsr_date() {
        return msr_date;
    }

    public void setMsr_date(Date msr_date) {
        this.msr_date = msr_date;
    }

    public boolean isMsr_control() {
        return msr_control;
    }

    public void setMsr_control(boolean msr_control) {
        this.msr_control = msr_control;
    }

    public Date getRejection_date() {
        return rejection_date;
    }

    public void setRejection_date(Date rejection_date) {
        this.rejection_date = rejection_date;
    }

    public int getMsr_number() {
        return msr_number;
    }

    public void setMsr_number(int msr_number) {
        this.msr_number = msr_number;
    }
}
