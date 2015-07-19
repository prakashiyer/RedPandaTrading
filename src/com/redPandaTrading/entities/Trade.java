package com.redPandaTrading.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Trade")
@XmlAccessorType(XmlAccessType.NONE)
public class Trade {
	
	@XmlElement(name="units")
	private String units;
	@XmlElement(name="commodity")
	private String commodity;
	@XmlElement(name="totalCost")
	private String totalCost;
	@XmlElement(name="unitCost")
	private String unitCost;
	@XmlElement(name="buyer")
	private Trader buyer;
	@XmlElement(name="seller")
	private Trader seller;
	
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}
	public String getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}
	public Trader getBuyer() {
		return buyer;
	}
	public void setBuyer(Trader buyer) {
		this.buyer = buyer;
	}
	public Trader getSeller() {
		return seller;
	}
	public void setSeller(Trader seller) {
		this.seller = seller;
	}
	

}
