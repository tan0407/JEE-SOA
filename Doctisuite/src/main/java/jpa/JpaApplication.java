package jpa;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {
	
	private static final Logger log = LoggerFactory.getLogger(JpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(RdvRepository rdvRepo,PatientRepository patientRepo) {
		return (args) -> {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date date = dateFormat.parse("31-12-2019");
			log.info(date.toString());
			
			Patient jean = new Patient(1,"0666531252","Jean");
			Rdv rdv1 = new Rdv(1,date,jean);
		//	Rdv rdv2 = new Rdv(2,dateFormat.parse())
		//	Rent rent = new Rent("myRent", dateBegin, dateEnd, jean, car);
		//	jean.addRent(rent);
		//	car.addRent(rent);
		//	System.out.println(car.toString());


			rdvRepo.save(rdv1);
			patientRepo.save(jean);
		//	repository.save(rdv2);
			System.out.print(date);
		
			
		};
	}

}
