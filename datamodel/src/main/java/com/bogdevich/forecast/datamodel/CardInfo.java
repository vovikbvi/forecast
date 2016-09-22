package com.bogdevich.forecast.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class CardInfo extends AbstractModel{
	
	@Column
	@Enumerated(value = EnumType.ORDINAL)
	private CardType card_type;
	
	@Column
	private Integer cardNumber;
	
	@Column
	private String cardOvnerFirstname;
	
	@Column
	private String cardOvnerLastname;
	
	@Column
	private Integer expiresYear;
	
	@Column
	private Integer expiresMonth;
	
	@Column
	private Integer securityCode;

	
}
