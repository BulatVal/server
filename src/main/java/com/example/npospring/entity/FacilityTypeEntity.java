package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class FacilityTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facility_type_id;
    private String facility_type_name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "facility_type_id",fetch = FetchType.EAGER )
    @JsonIgnore
    private List<FacilityEntity> facilityEntityList;

    public List<FacilityEntity> getFacilityEntityList() {
        return facilityEntityList;
    }

    public void setFacilityEntityList(List<FacilityEntity> facilityEntityList) {
        this.facilityEntityList = facilityEntityList;
    }

    public Long getFacility_type_id() {
        return facility_type_id;
    }

    public void setFacility_type_id(Long facility_type_id) {
        this.facility_type_id = facility_type_id;
    }

    public String getFacility_type_name() {
        return facility_type_name;
    }

    public void setFacility_type_name(String facility_type_name) {
        this.facility_type_name = facility_type_name;
    }

    public FacilityTypeEntity() {
    }
}
