package com.example.npospring.entity;

import com.example.npospring.model.MsrValueType;
import jakarta.persistence.*;

@Entity
public class MsrValueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msr_value_id;
    @ManyToOne
    @JoinColumn(name = "msr_id")
    private MsrEntity msr_id;
    @ManyToOne
    @JoinColumn(name = "value_type_id")
    private MsrValueTypeEntity msr_value_type_id;
    private float value;

    public Long getMsr_value_id() {
        return msr_value_id;
    }

    public void setMsr_value_id(Long msr_value_id) {
        this.msr_value_id = msr_value_id;
    }

    public MsrEntity getMsr_id() {
        return msr_id;
    }

    public void setMsr_id(MsrEntity msr_id) {
        this.msr_id = msr_id;
    }

    public MsrValueTypeEntity getMsr_value_type_id() {
        return msr_value_type_id;
    }

    public void setMsr_value_type_id(MsrValueTypeEntity msr_value_type_id) {
        this.msr_value_type_id = msr_value_type_id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public MsrValueEntity() {
    }
}
