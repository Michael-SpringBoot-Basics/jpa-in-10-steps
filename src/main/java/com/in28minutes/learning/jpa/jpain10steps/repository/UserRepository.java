/**
 * 
 */
package com.in28minutes.learning.jpa.jpain10steps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

/**
 * @author 109726
 * JpaRepository<User.calss, Long> can be defined JpaRepository<User, Long> as well
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
