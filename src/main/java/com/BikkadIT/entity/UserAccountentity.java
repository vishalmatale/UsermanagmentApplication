package com.BikkadIT.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="USER_ACCOUNTENTITY")
@Data
@AllArgsConstructor
public class UserAccountentity {
	
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="USER_Id")
	private Integer userId;
	
     @Column(name="FIRST_NAME")
	private String fname;
	
    @Column(name="LAST_NAME")
	private String lname;
	
   @Column(name="USER_EMAIL")
	private String email;
	
    @Column(name="USER_Id")
	private String passward;
	
    @Column(name="USER_PHNO")
	private long phno;
	
   @Column(name="USER_DOB")
	private LocalDate dob;
	
    @Column(name="USER_gender")
	private String gender;
	
   @Column(name="USER_STATEId")
	private Integer StateId;
	
   @Column(name="USER_COUNTRYId")
   private Integer CountryId;
	
	@Column(name="USER_CITYId")
	private Integer cityId;
	
    @Column(name="USER_ACCSTATUS")
	private String accStatus;
	
    @Column(name="USER_CREATEDATE",updatable = false)
	@CreationTimestamp ()
	private LocalDate creatDate;
	
    @Column(name="USER_UPDATEDATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updDate;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
