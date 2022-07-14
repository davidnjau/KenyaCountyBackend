package com.dave.kenyacounties.dto;

public class ResultsDto {

    private String details;

    public ResultsDto() {
    }

    public ResultsDto(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
