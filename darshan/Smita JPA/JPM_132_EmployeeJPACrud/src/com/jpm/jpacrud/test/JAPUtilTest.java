package com.jpm.jpacrud.test;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import com.jpm.jpacrud.util.JPAUtil;

public class JAPUtilTest {

	@Test
	public void testEntityManager() {
		EntityManager em = JPAUtil.geEntityManager();
		Assert.assertNotNull("Entity Manager is Null ", em);
	}

}
