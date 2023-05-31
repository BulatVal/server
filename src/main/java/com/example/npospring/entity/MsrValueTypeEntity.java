package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MsrValueTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long value_type_id;
    private String value_type_sysname;
    private String value_type_name;
    private String value_type_sname;
    private int unit_id;
    private double min_value;
    private double max_value;
    private Time value_type_default_duration;
    private boolean value_type_has_cross = false;
    private String value_data_type ;
    private LocalDateTime row_date_begin = LocalDateTime.now();
    private LocalDateTime row_date_end = LocalDateTime.now();
    private LocalDateTime row_create_date = LocalDateTime.now();
    private String row_create_user;
    private LocalDateTime row_modify_date = LocalDateTime.now();
    private String row_modify_user;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_value_type_id")
    @JsonIgnore
    private List<MsrValueEntity> msrValueEntityList;

    public List<MsrValueEntity> getMsrValueEntityList() {
        return msrValueEntityList;
    }

    public void setMsrValueEntityList(List<MsrValueEntity> msrValueEntityList) {
        this.msrValueEntityList = msrValueEntityList;
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

    public boolean isRow_is_ready() {
        return row_is_ready;
    }

    public void setRow_is_ready(boolean row_is_ready) {
        this.row_is_ready = row_is_ready;
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

    public MsrValueTypeEntity() {
    }

    private boolean row_is_ready = false;
}
