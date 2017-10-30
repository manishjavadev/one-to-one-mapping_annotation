package com.manish.javadev.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ADHAR_CARD")
public class AdharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADHAR_ID")
	private long id;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ADHAR_NUMBER")
	private String adharNumber;
	@OneToOne(mappedBy="adharCard", cascade = CascadeType.ALL)
	private UserDetail userDetail;

	public AdharCard() {
	}

	public AdharCard(String city, String state, String adharNumber) {
		super();
		this.city = city;
		this.state = state;
		this.adharNumber = adharNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public String toString() {
		return "AdharCard [id=" + id + ", city=" + city + ", state=" + state + ", adharNumber=" + adharNumber + "]";
	}

}
