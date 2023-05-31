package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class DynamogramEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne
    @JoinColumn(name = "msr_id")
    private MsrEntity msr_id;
    private float stress_min;
    private float stress_max;
    private float l_stroke;
    private float n_frequency;
    private float Cpusk;
    private float Dpl;
    private String dyn_desc;
    private String dyn_conclusion;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "dynamogram_id")
    @JsonIgnore
    private List<DynGraficEntity> dynGraficEntityList;

    public List<DynGraficEntity> getDynGraficEntityList() {
        return dynGraficEntityList;
    }

    public void setDynGraficEntityList(List<DynGraficEntity> dynGraficEntityList) {
        this.dynGraficEntityList = dynGraficEntityList;
    }



    public DynamogramEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MsrEntity getMsr_id() {
        return msr_id;
    }

    public void setMsr_id(MsrEntity msr_id) {
        this.msr_id = msr_id;
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
}
