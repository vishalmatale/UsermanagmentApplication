package com.BikkadIT.repositry;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.entity.StateMasterEntity;
@Repository
public interface StateMasterEntityRepositery extends JpaRepository<StateMasterEntity, Serializable>{

}
