package com.dave.kenyacounties.dto;

public class CountyDto {

    private Integer id;
    private String countyName;

    public CountyDto(Integer id, String countyName) {
        this.id = id;
        this.countyName = countyName;
    }

    public CountyDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
