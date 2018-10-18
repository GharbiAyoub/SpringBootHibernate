package com.gharbi.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinTable;

@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column
	private String name;

	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private ClientDetails cltdetail;

	@OneToMany(
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	@JoinColumn(name = "client_id")
	private List<Address> addresses = new ArrayList<Address>();
	
	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    })
    @JoinTable(name = "clt_tache",
        joinColumns = @JoinColumn(name = "id_clt"),
        inverseJoinColumns = @JoinColumn(name = "tag_tache")
    )
	
	private List<Tache> taches = new ArrayList<Tache>();
	
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

	public Client(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Client() {

	}

	public ClientDetails getCltdetail() {
		return cltdetail;
	}

	public void setCltdetail(ClientDetails cltdetail) {
		this.cltdetail = cltdetail;
	}

	

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", cltdetail=" + cltdetail + ", addresses=" + addresses
				+ ", taches=" + taches + "]";
	}

	
}
