package com.gharbi.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tache")
public class Tache {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String descTache;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescTache() {
		return descTache;
	}

	public void setDescTache(String descTache) {
		this.descTache = descTache;
	}

	@Override
	public String toString() {
		return "Tache [id=" + id + ", descTache=" + descTache + "]";
	}
	
	
	public Tache(String descTache) {
		this.descTache = descTache;
	}
	
	public Tache() {
		// TODO Auto-generated constructor stub
	}

}
