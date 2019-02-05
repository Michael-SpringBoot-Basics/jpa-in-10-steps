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
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User retrived with given id '1' is : " + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		log.info("All users retrived are  : " + users);

	}

}
