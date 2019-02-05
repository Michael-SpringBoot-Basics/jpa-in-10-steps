/**
 * 
 */
package com.in28minutes.learning.jpa.jpain10steps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

/**
 * @author 109726
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
