package com.axess.smartbankapi.dto;

import java.util.List;

import com.axess.smartbankapi.model.RewardsCatalogue;

import lombok.Data;

@Data
public class UserRedeemptionHistoryDto {
	
	
	private List<RewardsCatalogue> itemsRedeemed;
	private int quantity;
	private long ccNumber;
	private double totalPointsRedeemed;
	private double totalAmountGained;

}
