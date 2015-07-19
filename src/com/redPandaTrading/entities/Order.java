package com.redPandaTrading.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Order")
@XmlAccessorType(XmlAccessType.NONE)
public class Order {
	
	@XmlElement(name="id")
	private int id;
	@XmlElement(name="units")
	private int units;
	@XmlElement(name="commodity")
	private String commodity;
	@XmlElement(name="totalCost")
	private String totalCost;
	@XmlElement(name="unitCost")
	private String unitCost;
	@XmlElement(name="trader")
	private Trader trader;
	@XmlElement(name="status")
	private String status;
	@XmlElement(name="orderType")
	private String orderType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
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
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
