package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class FacilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facility_id;
    private String facility_name;
    @ManyToOne
    @JoinColumn(name = "facility_type_id")
    private FacilityTypeEntity facility_type_id;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "facility_id")
    @JsonIgnore
    private List<MsrEntity> msrEntityList;

    public List<MsrEntity> getMsrEntityList() {
        return msrEntityList;
    }

    public void setMsrEntityList(List<MsrEntity> msrEntityList) {
        this.msrEntityList = msrEntityList;
    }

    public FacilityEntity() {
    }

    public Long getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(Long facility_id) {
        this.facility_id = facility_id;
    }

    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

    public FacilityTypeEntity getFacility_type_id() {
        return facility_type_id;
    }

    public void setFacility_type_id(FacilityTypeEntity facility_type_id) {
        this.facility_type_id = facility_type_id;
    }
}
