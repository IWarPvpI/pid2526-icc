package be.icc.pid2526.reservations_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReservationsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationsSpringApplication.class, args);
	}
    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}
