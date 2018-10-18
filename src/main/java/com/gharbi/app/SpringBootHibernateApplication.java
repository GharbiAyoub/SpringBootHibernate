package com.gharbi.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gharbi.app.dao.ClientDaoImpl;
import com.gharbi.app.model.Address;
import com.gharbi.app.model.Client;
import com.gharbi.app.model.ClientDetails;
import com.gharbi.app.model.Tache;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner {

	@Autowired
	private ClientDaoImpl impl;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
		System.out.println("*** Start Main ***");
		System.out.println("*** Hello Gharbi ***");
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	Client clt =new Client(0, "Gharbi");
		ClientDetails cltd = new ClientDetails();
		cltd.setDescription("ce ci de test");
		Address adrs = new Address("Sidi El Hani");
		Address adrs1 = new Address("Sousse");
		Tache tache1 = new Tache("Conception");
		Tache tache2 = new Tache("Developpement");
		clt.setCltdetail(cltd);
		clt.getAddresses().add(adrs);
		clt.getAddresses().add(adrs1);

		clt.getTaches().add(tache1);
		clt.getTaches().add(tache2);
		 
		impl.createclient(clt, adrs);
		
		
		List<Client> clients = new ArrayList<Client>();
		
		 clients= impl.getAll();
		 
		 for(Client cd : clients) {
			 //impl.DeleteClient(cd);
			 System.out.println(cd.toString());
		 }
		 
		 
		 /*for(Client c : clients) {
			 if(c.getCltdetail()==null)
			 {
				 System.out.println(c.getId()+"------------> NULL");
			 }
			 System.err.println(c.toString());
		 }
		 System.out.println("*********** "+clients.size());*/
	}
}
