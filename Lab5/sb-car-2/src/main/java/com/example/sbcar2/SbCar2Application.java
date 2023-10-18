package com.example.sbcar2;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbCar2Application implements CommandLineRunner{
	private static final Logger logger=
	LoggerFactory.getLogger(SbCar2Application.class);
	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository orepository;
	
	@Autowired
	private UserRepository urepository ;
	public static void main(String[] args) {
		SpringApplication.run(SbCar2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Owner o1=new Owner("Seydina Mouhamadou", "NDIAYE"),
		o2=new Owner("Awa", "GNIGUE"),
		o3=new Owner("Ousmane", "NDIAYE"),
		o4=new Owner("Fallou", "NDIAYE"),
		o5=new Owner("Mama Babou", "NDIAYE");
				
		orepository.saveAll(Arrays.asList(o1,o2,o3,o4,o5));

		Car car1 =new Car("Ford","Mustang","Red",
		"ADF-1121",2021,59000,o1);
		Car car2 =new Car("Nissan","Leaf","Grenn",
		"SSJ-1121",2023,89000,o3);
		Car car3 =new Car("Toyota","Prius","Blue",
		"KKO-1121",2020,90000,o2);
		repository.saveAll(Arrays.asList(car1,car2,car3));
		
		// for (Car car : repository.findAll()) {
		// 	logger.info(car.getBrand()+" "+car.getModel());
			
		// }
		// for (Owner o : orepository.findAll()) {
		// 	logger.info(o.getFirstname()+" "+o.getLastname());
		// }
		urepository.save(new User("user", "$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue","USER"));

		urepository.save(new User("admin", "$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW", "ADMIN"));
		
	}

}
