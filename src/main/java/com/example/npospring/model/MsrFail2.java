package com.example.npospring.model;

import com.example.npospring.entity.MsrEntity;
import com.example.npospring.entity.MsrFail2Entity;
import com.example.npospring.entity.MsrFailEntity;
import com.example.npospring.entity.MsrFailTypeEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MsrFail2 {
    private Long msr_fail_id;
    /*@ManyToOne
    @JoinColumn(name = "msr_id")
    private MsrEntity msr_id;
    @ManyToOne
    @JoinColumn(name = "msr_fail_type_id")
    private MsrFailTypeEntity msr_fail_type_id;*/
    private String msr_desc;

    public static MsrFail2 toModel(MsrFail2Entity entity){
        MsrFail2 model =  new MsrFail2();

        model.setMsr_fail_id(entity.getMsr_fail_id());
        model.setMsr_desc(entity.getMsr_desc());

        return model;
    }

    public Long getMsr_fail_id() {
        return msr_fail_id;
    }

    public void setMsr_fail_id(Long msr_fail_id) {
        this.msr_fail_id = msr_fail_id;
    }

    public String getMsr_desc() {
        return msr_desc;
    }

    public void setMsr_desc(String msr_desc) {
        this.msr_desc = msr_desc;
    }

    public MsrFail2() {
    }
}
