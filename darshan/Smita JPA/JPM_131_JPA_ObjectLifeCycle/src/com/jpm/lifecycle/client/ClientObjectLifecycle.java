package com.jpm.lifecycle.client;

import javax.persistence.EntityManager;

import com.jpm.lifecycle.entities.Greet;
import com.jpm.lifecycle.util.JPAUtil;

public class ClientObjectLifecycle {

	public static void main(String[] args) {

		// step2 : Obtain EntityManager object
		EntityManager em = JPAUtil.geEntityManager();
		// step3 : begin Transaction
		em.getTransaction().begin();
		// step4 : create the bean object and persist it on the DB
		Greet greet = new Greet(); // Transient/New
		// greet.setMessageId(1001)//throw an exception
		greet.setMessage("Welcome to JPA Session!");
		// step5 : persist bean object in DB
		em.persist(greet); // Managed state
		System.out.println("Adding Greet object on to the DB with unique message id "+greet.getMessageId());
		// step 6 : commit the tx
		greet.setMessage("Object Life Cycle...");
		// Object is in Managed state so the changed message will be reflected
		// in DB
		em.getTransaction().commit(); // Detached State - greet
		// delete operation will remove the object
		// step7 : close em and em factory
		// em.remove(arg0);
		greet.setMessage("Hello...");
		greet.setMessageId(101);
		// Object is in Detached state so the changed message will NOT be
		// reflected in DB
		em.close(); // Detached State

		/*
		 * CREATE TABLE student_master (student_id NUMBER(6) PRIMARY KEY,
		 * student_name VARCHAR2(25));
		 */

	}

}
