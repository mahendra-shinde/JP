package com.jp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static{ 
		
		//statci block to iniy only static variables
		//invoked before obj creation i.e before constructor
		
		factory = Persistence
				.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager(){
		
		if (entityManager==null || !entityManager.isOpen()){
			
			entityManager = factory.createEntityManager();
			
		}
		
		return entityManager;
	}
	
	public static void closeEntityManagerFactory(){
		
		if (factory!=null || factory.isOpen()){
						
			factory.close();
		}
	}
}
