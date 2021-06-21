package com.axess.smartbankapi.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class UserRedeemptionHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToOne
	private RewardsCatalogue catalogue;
	private int quantity;
	@OneToOne
	private CCUser ccUser;
	private LocalDate orderdate;

}
