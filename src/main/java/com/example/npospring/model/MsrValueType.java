package com.example.npospring.model;

import com.example.npospring.entity.MsrValueTypeEntity;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class MsrValueType {
    private Long value_type_id;
    private String value_type_sysname;
    private String value_type_name;
    private String value_type_sname;
    private double min_value;
    private double max_value;
    private int unit_id;
    private Time value_type_default_duration;
    private boolean value_type_has_cross = false;
    private String value_data_type ;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    private boolean row_is_ready = false;
    private List<MsrValue> msrValueList;

    public List<MsrValue> getMsrValueList() {
        return msrValueList;
    }

    public void setMsrValueList(List<MsrValue> msrValueList) {
        this.msrValueList = msrValueList;
    }

    public boolean isRow_is_ready() {
        return row_is_ready;
    }

    public void setRow_is_ready(boolean row_is_ready) {
        this.row_is_ready = row_is_ready;
    }

    public static  MsrValueType toModel(MsrValueTypeEntity entity){
        MsrValueType model =  new MsrValueType();

        model.setValue_type_id(entity.getValue_type_id());
        model.setValue_type_sysname(entity.getValue_type_sysname());
        model.setValue_type_name(entity.getValue_type_name());
        model.setValue_type_sname(entity.getValue_type_sname());
        model.setUnit_id(entity.getUnit_id());
        model.setValue_type_default_duration(entity.getValue_type_default_duration());
        model.setValue_type_has_cross(entity.isValue_type_has_cross());
        model.setValue_data_type(entity.getValue_data_type());
        model.setMin_value(entity.getMin_value());
        model.setMax_value(entity.getMax_value());
        model.setMsrValueList(entity.getMsrValueEntityList().stream().map(MsrValue::toModel).collect(Collectors.toList()));




        model.setRow_date_begin(entity.getRow_date_begin());
        model.setRow_date_end(entity.getRow_date_end());
        model.setRow_create_date(entity.getRow_create_date());
        model.setRow_create_user(entity.getRow_create_user());
        model.setRow_modify_date(entity.getRow_modify_date());
        model.setRow_modify_user(entity.getRow_modify_user());
        model.setRow_is_ready(entity.isRow_is_ready());
        return model;
    }

    public Long getValue_type_id() {
        return value_type_id;
    }

    public void setValue_type_id(Long value_type_id) {
        this.value_type_id = value_type_id;
    }

    public String getValue_type_sysname() {
        return value_type_sysname;
    }

    public void setValue_type_sysname(String value_type_sysname) {
        this.value_type_sysname = value_type_sysname;
    }

    public String getValue_type_name() {
        return value_type_name;
    }

    public void setValue_type_name(String value_type_name) {
        this.value_type_name = value_type_name;
    }

    public String getValue_type_sname() {
        return value_type_sname;
    }

    public void setValue_type_sname(String value_type_sname) {
        this.value_type_sname = value_type_sname;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public Time getValue_type_default_duration() {
        return value_type_default_duration;
    }

    public void setValue_type_default_duration(Time value_type_default_duration) {
        this.value_type_default_duration = value_type_default_duration;
    }

    public boolean isValue_type_has_cross() {
        return value_type_has_cross;
    }

    public void setValue_type_has_cross(boolean value_type_has_cross) {
        this.value_type_has_cross = value_type_has_cross;
    }

    public String getValue_data_type() {
        return value_data_type;
    }

    public void setValue_data_type(String value_data_type) {
        this.value_data_type = value_data_type;
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

    public double getMin_value() {
        return min_value;
    }

    public void setMin_value(double min_value) {
        this.min_value = min_value;
    }

    public double getMax_value() {
        return max_value;
    }

    public void setMax_value(double max_value) {
        this.max_value = max_value;
    }

    public MsrValueType() {
    }
}
