package com.bogdevich.forecast.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class MainTable extends AbstractModel {

	@Column
	private String pairName;
	
	@Column
	private String pict_patch;
	
	@Column
	private Date date;

	public String getPairName() {
		return pairName;
	}

	public void setPairName(String pairName) {
		this.pairName = pairName;
	}

	public String getPict_patch() {
		return pict_patch;
	}

	public void setPict_patch(String pict_patch) {
		this.pict_patch = pict_patch;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
