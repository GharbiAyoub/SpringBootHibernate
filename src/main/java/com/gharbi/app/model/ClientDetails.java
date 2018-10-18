package com.gharbi.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class ClientDetails {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String description;
	
	@OneToOne(mappedBy = "cltdetail", cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY, optional = false)
	private Client client;


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		if (client == null) {
            if (this.client != null) {
                this.client.setCltdetail(null);
            }
        }
        else {
            client.setCltdetail(this);
        }
        this.client = client;
	}

	public ClientDetails() {

	}

	public ClientDetails(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ClientDetails [id=" + id + ", description=" + description + "]";
	}

}
