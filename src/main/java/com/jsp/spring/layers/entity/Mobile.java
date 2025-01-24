package com.jsp.spring.layers.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Mobile {
	@Id
	private int mobileid;
	private String mobileModel;
	private String mobileBrand;
	private int mobilePrice;
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	@Override
	public String toString() {
		return "Mobile [mobileid=" + mobileid + ", mobileModel=" + mobileModel + ", mobileBrand=" + mobileBrand
				+ ", mobilePrice=" + mobilePrice + "]";
	}


}