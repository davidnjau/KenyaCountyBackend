package com.dave.kenyacounties.repository;

import com.dave.kenyacounties.entity.County;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountyRepository extends JpaRepository<County, Integer> {
}