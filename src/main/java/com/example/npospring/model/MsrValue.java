package com.example.npospring.model;

import com.example.npospring.entity.MsrEntity;
import com.example.npospring.entity.MsrTypeEntity;
import com.example.npospring.entity.MsrValueEntity;
import jakarta.persistence.*;

import java.util.stream.Collectors;

public class MsrValue {

    private Long msr_value_id;
    /*@ManyToOne
    @JoinColumn(name = "msr_id")
    private MsrEntity msr_id;
    @ManyToOne
    @JoinColumn(name = "value_type_id")
    private MsrValueType msr_value_type_id;*/
    private float value;

    public static MsrValue toModel(MsrValueEntity entity){
        MsrValue model = new MsrValue();

        model.setMsr_value_id(entity.getMsr_value_id());

        model.setValue(entity.getValue());

        return model;

    }

    public Long getMsr_value_id() {
        return msr_value_id;
    }

    public void setMsr_value_id(Long msr_value_id) {
        this.msr_value_id = msr_value_id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public MsrValue() {
    }
}
