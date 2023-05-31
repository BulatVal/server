package com.example.npospring.model;

import com.example.npospring.entity.DynGraficEntity;
import com.example.npospring.entity.DynamogramEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;
import java.util.stream.Collectors;

public class DynGrafic {
    private Long dyn_grafic_id;

    private double x;
    private double y;


    public static DynGrafic toModel(DynGraficEntity entity){
        DynGrafic model =  new DynGrafic();

        model.setDyn_grafic_id(entity.getDyn_grafic_id());
        model.setX(entity.getX());
        model.setY(entity.getY());




        return model;
    }


    public DynGrafic() {
    }


    public Long getDyn_grafic_id() {
        return dyn_grafic_id;
    }

    public void setDyn_grafic_id(Long dyn_grafic_id) {
        this.dyn_grafic_id = dyn_grafic_id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
