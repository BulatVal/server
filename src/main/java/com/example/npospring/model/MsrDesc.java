package com.example.npospring.model;

import com.example.npospring.entity.MsrDescEntity;

public class MsrDesc {
    private Long id ;

    private String msr_desc;

    public static  MsrDesc toModel(MsrDescEntity entity){
        MsrDesc model =  new MsrDesc();

        model.setId(entity.getId());
        model.setMsr_desc(entity.getMsr_desc());

        return model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getMsr_desc() {
        return msr_desc;
    }

    public void setMsr_desc(String msr_desc) {
        this.msr_desc = msr_desc;
    }

    public MsrDesc() {
    }
}
