package com.dave.kenyacounties.service_impl;

import com.dave.kenyacounties.dto.CountyDto;
import com.dave.kenyacounties.entity.County;
import com.dave.kenyacounties.entity.Subcounty;
import com.dave.kenyacounties.repository.CountyRepository;
import com.dave.kenyacounties.repository.SubcountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountyServiceImpl {

    @Autowired
    private CountyRepository countyRepository;

    @Autowired
    private SubcountyRepository subcountyRepository;

    public List<County> getCounties(){
        return countyRepository.findAll();
    }

    public County getCountyDetail(Integer id){

        Optional<County> optionalCounty = countyRepository.findById(id);
        return optionalCounty.orElse(null);

    }

    public List<Subcounty> getSubCounties(Integer countyId){

        return subcountyRepository.findAllByCountyId(countyId);

    }

    public List<Subcounty> getWards(String constituencyName){
        return subcountyRepository.findAllByConstituencyName(constituencyName);
    }

}
