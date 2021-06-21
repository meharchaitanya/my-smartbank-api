package com.axess.smartbankapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CCUser {
	
	@Id
	private long ccNumber;
	private String ccName;
	private String userName;
	private String userId;
	private String password;
	private double availableRedeemPoints;
	private double totalRewardsGained;
	
	
	
}
