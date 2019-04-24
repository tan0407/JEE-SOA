package jpa;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {
	
	private static final Logger log = LoggerFactory.getLogger(JpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(RdvRepository repository) {
		return (args) -> {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = dateFormat.parse("2018-10-09");
			log.info(date.toString());
			
			Patient jean = new Patient(1,"0666531252","Jean");
			Rdv rdv1 = new Rdv(1,date,jean);
		//	Rent rent = new Rent("myRent", dateBegin, dateEnd, jean, car);
		//	jean.addRent(rent);
		//	car.addRent(rent);
		//	System.out.println(car.toString());


		//	repository.save(rent);
			
		
			
		};
	}

}
