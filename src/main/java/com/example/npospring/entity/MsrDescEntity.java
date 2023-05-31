package com.example.npospring.entity;

import jakarta.persistence.*;

@Entity
public class MsrDescEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "msr_id")
    private MsrEntity msr_id;
    private String msr_desc;

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

    public String getMsr_desc() {
        return msr_desc;
    }

    public void setMsr_desc(String msr_desc) {
        this.msr_desc = msr_desc;
    }

    public MsrDescEntity() {
    }
}
