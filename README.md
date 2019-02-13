# jpa-in-10-steps
Learn JPA with Spring Boot and Spring Data in 10 steps

Step 1 : Object Relational Impedence Mismatch - Understanding the problem that JPA solves
Step 2 : World before JPA - JDBC, Spring JDBC and myBatis
Step 3 : Introduction to JPA
Step 4 : Creating a JPA Project using Spring Initializr
Step 5 : Defining a JPA Entity - User
Step 6 : Defining a Service to manage the Entity - UserService and EntityManager
Step 7 : Using a Command Line Runner to save the User to database.
Step 8 : Magic of Spring Boot and In Memory Database H2
Step 9 : Introduction to Spring Data JPA
Step 10 : More JPA Repository : findById and findAll



#To access the H2 DB , please use the following URL once the application is started
http://localhost:8080/h2-console
Note: The port no may change based on the configuration in application.properties

#And the DB URL for H2 which is an in-memory DB - 'jdbc:h2:mem:testdb'

#The restriction of using in-memory DB is that the Data is persisted between restarts