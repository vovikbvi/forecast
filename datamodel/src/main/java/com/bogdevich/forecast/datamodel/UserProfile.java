package com.bogdevich.forecast.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;


@Entity
public class UserProfile extends AbstractModel{

	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	@Enumerated(value = EnumType.ORDINAL)
	private UserRole userRole;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String phone;
	
	@Column
	private Date dateRegistr;
	
	@ManyToOne(targetEntity = CardInfo.class, fetch = FetchType.LAZY)
	private CardInfo cardInfo;
	
	@Column
	private Boolean aceptRegistr;
	
}
