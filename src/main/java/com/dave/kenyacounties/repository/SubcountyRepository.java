package com.dave.kenyacounties.repository;

import com.dave.kenyacounties.entity.Subcounty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubcountyRepository extends JpaRepository<Subcounty, Integer> {

    List<Subcounty> findAllByCountyId(Integer countyId);
    List<Subcounty> findAllByConstituencyName(String constituencyName);

}