package io.onlineform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OnlineFormApplication {

	public static void main(String[] args) {

		System.out.println("HEllo one more ");
		SpringApplication.run(OnlineFormApplication.class, args);
	}

}
