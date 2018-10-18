package com.gharbi.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gharbi.app.model.Address;
import com.gharbi.app.model.Client;
import com.gharbi.app.model.ClientDetails;

@Repository
public class ClientDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createclient(Client client, Address adrs){
		Session session= null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Integer id =(Integer) session.save(client);
			System.out.println("Client is created With Id::"+id);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void DeleteClient(Client clt) {		
		Session session= null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Client c = (Client) session.get(Client.class, clt.getId());
			System.err.println("*************************");
			System.err.println(c);
			 session.delete(c);
			System.out.println("Client is deleted With Id::"+clt.getId());
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public List<Client> getAll(){
		Session session= null;
		session = sessionFactory.openSession();
		session.beginTransaction();

		List<Client> result = session.createCriteria(Client.class).list();
		
		return result;
		
	}
	
	public List<ClientDetails> getDetails() {
		Session session= null;
		session = sessionFactory.openSession();
		session.beginTransaction();

		List<ClientDetails> result = session.createCriteria(ClientDetails.class).list();
		
		return result;
	}
	
	
}
