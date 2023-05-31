package com.example.npospring.entity;

import jakarta.persistence.*;

@Entity
public class DynGraficEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dyn_grafic_id;
    @ManyToOne
    @JoinColumn(name = "dynamogram_id")
    private DynamogramEntity dynamogram_id ;
    private double x;
    private double y;

    public DynGraficEntity() {
    }

    public Long getDyn_grafic_id() {
        return dyn_grafic_id;
    }

    public void setDyn_grafic_id(Long dyn_grafic_id) {
        this.dyn_grafic_id = dyn_grafic_id;
    }

    public DynamogramEntity getDynamogram_id() {
        return dynamogram_id;
    }

    public void setDynamogram_id(DynamogramEntity dynamogram_id) {
        this.dynamogram_id = dynamogram_id;
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
