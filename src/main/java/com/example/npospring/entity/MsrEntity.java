package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class MsrEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msr_id;
    @ManyToOne
    @JoinColumn(name = "msr_type_id")
    private MsrTypeEntity msr_type_id;
    private int msr_parent_id = 1;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",shape=JsonFormat.Shape.STRING)
    private Date msr_date = new Date();
    @ManyToOne
    @JoinColumn(name = "source_id")
    private SourceEntity source_id;
    @ManyToOne
    @JoinColumn(name = "msr_state_id")
    private MsrStateEntity msr_state_id;
    @ManyToOne
    @JoinColumn(name = "facility_id")

    private FacilityEntity facility_id;
    private boolean msr_control = false;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",shape=JsonFormat.Shape.STRING)
    private Date rejection_date = new Date() ;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_id")
    @JsonIgnore
    private List<MsrDescEntity> msrDescEntityList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_id")
    @JsonIgnore
    private List<DynamogramEntity> dynamogramEntityList;

    private int msr_number;
    private String msr_desc;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_id")
    @JsonIgnore
    private List<MsrValueEntity> msrValueEntityList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "msr_id")
    @JsonIgnore
    private List<MsrFail2Entity> msrFail2EntityList;

    public String getMsr_desc() {
        return msr_desc;
    }

    public void setMsr_desc(String msr_desc) {
        this.msr_desc = msr_desc;
    }

    public FacilityEntity getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(FacilityEntity facility_id) {
        this.facility_id = facility_id;
    }

    public List<MsrFail2Entity> getMsrFail2EntityList() {
        return msrFail2EntityList;
    }

    public void setMsrFail2EntityList(List<MsrFail2Entity> msrFail2EntityList) {
        this.msrFail2EntityList = msrFail2EntityList;
    }

    public List<MsrValueEntity> getMsrValueEntityList() {
        return msrValueEntityList;
    }

    public void setMsrValueEntityList(List<MsrValueEntity> msrValueEntityList) {
        this.msrValueEntityList = msrValueEntityList;
    }

    public List<MsrDescEntity> getMsrDescEntityList() {
        return msrDescEntityList;
    }

    public void setMsrDescEntityList(List<MsrDescEntity> msrDescEntityList) {
        this.msrDescEntityList = msrDescEntityList;
    }

    public Long getMsr_id() {
        return msr_id;
    }

    public void setMsr_id(Long msr_id) {
        this.msr_id = msr_id;
    }

    public MsrTypeEntity getMsr_type_id() {
        return msr_type_id;
    }

    public void setMsr_type_id(MsrTypeEntity msr_type_id) {
        this.msr_type_id = msr_type_id;
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

    public SourceEntity getSource_id() {
        return source_id;
    }

    public void setSource_id(SourceEntity source_id) {
        this.source_id = source_id;
    }

    public MsrStateEntity getMsr_state_id() {
        return msr_state_id;
    }

    public void setMsr_state_id(MsrStateEntity msr_state_id) {
        this.msr_state_id = msr_state_id;
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

    public MsrEntity() {
    }

    public List<DynamogramEntity> getDynamogramEntityList() {
        return dynamogramEntityList;
    }

    public void setDynamogramEntityList(List<DynamogramEntity> dynamogramEntityList) {
        this.dynamogramEntityList = dynamogramEntityList;
    }
}
