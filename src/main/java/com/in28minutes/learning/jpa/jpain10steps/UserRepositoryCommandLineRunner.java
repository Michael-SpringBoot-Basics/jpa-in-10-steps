/**
 * 
 */
package com.in28minutes.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.repository.UserRepository;

/**
 * @author 109726
 *
 */
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Michael", "Admin");
		
		userRepository.save(user);
		
		log.info("New User is created : " + user);
		
		Optional<User> userWithIdTwo = userRepository.findById(2L);
		log.info("User retrived with given id '2' is : " + userWithIdTwo);
		
		// The reason for wrapping User with optional is that it will provide empty instead of null 
		// In case of the row is not available in the DB table for the given id 
		Optional<User> userWithIdThree = userRepository.findById(3L);
		log.info("User retrived with given id '3' is : " + userWithIdThree);
		
		List<User> users = userRepository.findAll();
		log.info("All users retrived are  : " + users);

	}

}
