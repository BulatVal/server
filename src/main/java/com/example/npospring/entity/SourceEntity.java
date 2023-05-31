package com.example.npospring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class SourceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long source_id;
    private String source_name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "source_id")
    @JsonIgnore
    private List<MsrEntity> msrEntityList;

    public List<MsrEntity> getMsrEntityList() {
        return msrEntityList;
    }

    public void setMsrEntityList(List<MsrEntity> msrEntityList) {
        this.msrEntityList = msrEntityList;
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

    public SourceEntity() {
    }
}
