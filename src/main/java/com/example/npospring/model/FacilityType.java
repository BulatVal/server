package com.example.npospring.model;

import com.example.npospring.entity.FacilityTypeEntity;

import java.util.List;
import java.util.stream.Collectors;

public class FacilityType {
    private Long facility_id;
    private String facility_type_name;

    private List<Facility> facilityList;

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }

    public static FacilityType toModel(FacilityTypeEntity entity){
        FacilityType model = new FacilityType();

        model.setFacility_id(entity.getFacility_type_id());
        model.setFacility_type_name(entity.getFacility_type_name());
        model.setFacilityList(entity.getFacilityEntityList().stream().map(Facility::toModel).collect(Collectors.toList()));

        return  model;
    }

    public Long getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(Long facility_id) {
        this.facility_id = facility_id;
    }

    public String getFacility_type_name() {
        return facility_type_name;
    }

    public void setFacility_type_name(String facility_type_name) {
        this.facility_type_name = facility_type_name;
    }

    public FacilityType() {
    }
}
