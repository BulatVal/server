package com.example.npospring.entity;

import jakarta.persistence.*;

@Entity
public class MsrFail2Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long msr_fail_id;
    @ManyToOne
    @JoinColumn(name = "msr_id")
    private MsrEntity msr_id;
    @ManyToOne
    @JoinColumn(name = "msr_fail_type_id")
    private MsrFailTypeEntity msr_fail_type_id;
    private String msr_desc;

    public Long getMsr_fail_id() {
        return msr_fail_id;
    }

    public void setMsr_fail_id(Long msr_fail_id) {
        this.msr_fail_id = msr_fail_id;
    }

    public MsrEntity getMsr_id() {
        return msr_id;
    }

    public void setMsr_id(MsrEntity msr_id) {
        this.msr_id = msr_id;
    }

    public MsrFailTypeEntity getMsr_fail_type_id() {
        return msr_fail_type_id;
    }

    public void setMsr_fail_type_id(MsrFailTypeEntity msr_fail_type_id) {
        this.msr_fail_type_id = msr_fail_type_id;
    }

    public String getMsr_desc() {
        return msr_desc;
    }

    public void setMsr_desc(String msr_desc) {
        this.msr_desc = msr_desc;
    }

    public MsrFail2Entity() {
    }
}
