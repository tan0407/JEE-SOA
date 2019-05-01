package jpa;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
//		EntityManager em = emf.createEntityManager();
//		
//		EntityTransaction et = em.getTransaction();
//		try {
//			et.begin();
//			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//			Date date = dateFormat.parse("31-12-2019");
//			log.info(date.toString());
//			
//			Patient jean = new Patient(1,"0666531252","Jean");
//			Rdv rdv1 = new Rdv(1,date,jean);
//			em.persist(rdv1);
//			em.persist(jean);
//			et.commit();
//
//		}
//		catch(Exception e){
//			e.printStackTrace();
//			et.rollback();
//		}
	}
	
	@Bean
	public CommandLineRunner demo(RdvRepository rdvRepo,PatientRepository patientRepo) {
		return (args) -> {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date date = dateFormat.parse("31-12-2019");
			log.info(date.toString());
			
			Patient jean = new Patient("0666531252","Jean");
			Rdv rdv1 = new Rdv(date,jean);
//			Rdv rdv2 = new Rdv(2,dateFormat.parse())
//			Rent rent = new Rent("myRent", dateBegin, dateEnd, jean, car);
//			jean.addRent(rent);
//			car.addRent(rent);
//			System.out.println(car.toString());


			rdvRepo.save(rdv1);
			patientRepo.save(jean);
		//	repository.save(rdv2);
			System.out.print(date);
			
		};
	}

}
