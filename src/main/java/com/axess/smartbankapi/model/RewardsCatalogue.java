package com.axess.smartbankapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class RewardsCatalogue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String item;
	private double redeemptionPoint;
	private double redeemptionAmount;
	

}
