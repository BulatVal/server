package com.example.npospring.model;

import com.example.npospring.entity.FacilityEntity;
import com.example.npospring.entity.FacilityTypeEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;
import java.util.stream.Collectors;

public class Facility {
    private Long facility_id;
    private String facility_name;

    private List<Msr> msrList;

    public List<Msr> getMsrList() {
        return msrList;
    }

    public void setMsrList(List<Msr> msrList) {
        this.msrList = msrList;
    }

    public static Facility toModel(FacilityEntity entity){
        Facility model =  new Facility();

        model.setFacility_id(entity.getFacility_id());
        model.setFacility_name(entity.getFacility_name());
        model.setMsrList(entity.getMsrEntityList().stream().map(Msr::toModel).collect(Collectors.toList()));


        return model;
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

    public Facility() {
    }
}
