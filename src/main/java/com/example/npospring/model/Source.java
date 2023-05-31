package com.example.npospring.model;

import com.example.npospring.entity.SourceEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Source {
    private Long source_id;
    private String source_name;

    public List<Msr> getMsrList() {
        return msrList;
    }

    public void setMsrList(List<Msr> msrList) {
        this.msrList = msrList;
    }

    private List<Msr> msrList;


    public static Source toModel(SourceEntity entity){
        Source model =new Source();

        model.setSource_id(entity.getSource_id());
        model.setSource_name(entity.getSource_name());
        model.setMsrList(entity.getMsrEntityList().stream().map(Msr::toModel).collect(Collectors.toList()));
        return model;
    }

    public Long getSource_id() {
        return source_id;
    }

    public void setSource_id(Long source_id) {
        this.source_id = source_id;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public Source() {
    }
}
