package com.BikkadIT.repositry;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.entity.CountryMasterEntity;

public interface CountryMasterEntityRepositery extends JpaRepository<CountryMasterEntity, Serializable> {

}
