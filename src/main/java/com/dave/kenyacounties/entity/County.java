package com.dave.kenyacounties.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "counties")
public class County {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "county_name", nullable = false)
    private String countyName;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}