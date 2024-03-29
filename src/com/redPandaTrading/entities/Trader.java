package com.redPandaTrading.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Trader")
@XmlAccessorType(XmlAccessType.NONE)
public class Trader {
	
		@XmlElement(name="id")
		private int id;
		@XmlElement(name="name")
		private String name;
		@XmlElement(name="address")
		private String address;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
}
