package com.codeheist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("17")
	private int plotNo;
	@Value("bazar Road")
	private String streetName;
	@Value("441108")
	private String pincode;
	@Value("Mumbai")
	private String city;
	public int getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", streetName=" + streetName + ", pincode=" + pincode + ", city=" + city
				+ "]";
	}
	
	
}
