/**
 * 
 */
package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

/**
 * @author 109726
 *
 */
@Repository
@Transactional // This is an interface for Declarative transaction management
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user){
		// This will persist the user details to table 
		// And then maintain a copy of the persistent object in persistence context with auto generated id value
		// And also the persistent object will be monitored by PersistenceContext
		entityManager.persist(user); 
		return user.getId();
	}

}

/*
public class SomeEntityDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(SomeEntity someEntity){
		entityManager.persist(someEntity);
		return someEntity.getId();
	}

}
*/