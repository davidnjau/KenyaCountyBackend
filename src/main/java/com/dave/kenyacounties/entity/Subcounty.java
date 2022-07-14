package com.dave.kenyacounties.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcounties")
public class Subcounty {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "county_id", nullable = false)
    private Integer countyId;

    @Column(name = "constituency_name", nullable = false, length = 50)
    private String constituencyName;

    @Column(name = "ward", nullable = false, length = 50)
    private String ward;

    @Column(name = "alias", nullable = false, length = 100)
    private String alias;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getConstituencyName() {
        return constituencyName;
    }

    public void setConstituencyName(String constituencyName) {
        this.constituencyName = constituencyName;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}