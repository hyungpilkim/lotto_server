package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="lo_user")  
@Getter
@Setter
public class EntityUser{
	
	@Id
	@Column(name = "device_token")
	private String deviceToken;
	
	@Column(name = "device_type")
	private String deviceType;
	
	@Column(name = "agree_yn")
	private String agreeYn;
	
	@Column(name = "reg_dt")
	private LocalDateTime regDt;
}