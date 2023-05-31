package com.example.npospring.model;

import com.example.npospring.entity.DynGraficEntity;
import com.example.npospring.entity.DynamogramEntity;
import com.example.npospring.entity.MsrEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;
import java.util.stream.Collectors;

public class Dynamogram {

    private Long id ;
    private float stress_min;
    private float stress_max;
    private float l_stroke;
    private float n_frequency;
    private float Cpusk;
    private float Dpl;
    private String dyn_desc;
    private String dyn_conclusion;
    private List<DynGrafic> dynGraficEntityList;


    public static Dynamogram toModel(DynamogramEntity entity){
        Dynamogram model =  new Dynamogram();

        model.setId(entity.getId());
        model.setStress_min(entity.getStress_min());
        model.setStress_max(entity.getStress_max());

        model.setL_stroke(entity.getL_stroke());

        model.setN_frequency(entity.getN_frequency());
        model.setCpusk(entity.getCpusk());
        model.setDpl(entity.getDpl());
        model.setDyn_desc(entity.getDyn_desc());
        model.setDyn_conclusion(entity.getDyn_conclusion());

        model.setDynGraficEntityList(entity.getDynGraficEntityList().stream().map(DynGrafic::toModel).collect(Collectors.toList()));

        return model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getStress_min() {
        return stress_min;
    }

    public void setStress_min(float stress_min) {
        this.stress_min = stress_min;
    }

    public float getStress_max() {
        return stress_max;
    }

    public void setStress_max(float stress_max) {
        this.stress_max = stress_max;
    }

    public float getL_stroke() {
        return l_stroke;
    }

    public void setL_stroke(float l_stroke) {
        this.l_stroke = l_stroke;
    }

    public float getN_frequency() {
        return n_frequency;
    }

    public void setN_frequency(float n_frequency) {
        this.n_frequency = n_frequency;
    }

    public float getCpusk() {
        return Cpusk;
    }

    public void setCpusk(float cpusk) {
        Cpusk = cpusk;
    }

    public float getDpl() {
        return Dpl;
    }

    public void setDpl(float dpl) {
        Dpl = dpl;
    }

    public String getDyn_desc() {
        return dyn_desc;
    }

    public void setDyn_desc(String dyn_desc) {
        this.dyn_desc = dyn_desc;
    }

    public String getDyn_conclusion() {
        return dyn_conclusion;
    }

    public void setDyn_conclusion(String dyn_conclusion) {
        this.dyn_conclusion = dyn_conclusion;
    }

    public List<DynGrafic> getDynGraficEntityList() {
        return dynGraficEntityList;
    }

    public void setDynGraficEntityList(List<DynGrafic> dynGraficEntityList) {
        this.dynGraficEntityList = dynGraficEntityList;
    }
}
