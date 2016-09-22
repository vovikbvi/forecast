package com.bogdevich.forecast.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Payment extends AbstractModel{
	
	@ManyToOne(targetEntity = CardInfo.class, fetch = FetchType.LAZY)
	private UserProfile userProfile;
	
	@Column
	@Enumerated(value = EnumType.ORDINAL)
	private PaymentMethod paymentMethod;
	
	@Column
	private Integer amount;
	
	@Column
	private Date dateBought;

	@Column
	private Date dateEndBought;
	
	
}
