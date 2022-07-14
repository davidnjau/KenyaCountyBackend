package com.dave.kenyacounties.controller;

import com.dave.kenyacounties.dto.ResultsDto;
import com.dave.kenyacounties.entity.County;
import com.dave.kenyacounties.entity.Subcounty;
import com.dave.kenyacounties.service_impl.CountyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CountyController {

    @Autowired
    private CountyServiceImpl countyService;

    @RequestMapping(value = "counties", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCounties(){

        List<County> usersList = countyService.getCounties();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(usersList,headers, HttpStatus.OK);
    }
    @RequestMapping(value = "county/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getCountyDetail(
            @PathVariable("id") Integer id
    ){

        County county = countyService.getCountyDetail(id);
        if (county != null){
            return new ResponseEntity(county, HttpStatus.OK);

        }else {
            return ResponseEntity.badRequest().body(new ResultsDto("No county has been found"));

        }

    }
    @RequestMapping(value = "subCounty/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getSubCountiesByCountyId(
            @PathVariable("id") Integer id
    ){

        List<Subcounty> subCountyList = countyService.getSubCounties(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(subCountyList,headers, HttpStatus.OK);

    }
    @RequestMapping(value = "wards/{constituencyName}", method = RequestMethod.GET)
    public ResponseEntity<?> getWardByConstituencyName(
            @PathVariable("constituencyName") String constituencyName
    ){

        List<Subcounty> subCountyList = countyService.getWards(constituencyName);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(subCountyList,headers, HttpStatus.OK);

    }

}
