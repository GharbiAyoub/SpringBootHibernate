package com.gharbi.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String adrs;
	
	
	public Address() {
		
	}
	
	public Address(String adrs) {
		super();
		this.adrs = adrs;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdrs() {
		return adrs;
	}
	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", adrs=" + adrs + ",]";
	}
	

}
