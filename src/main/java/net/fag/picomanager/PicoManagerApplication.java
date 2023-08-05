package net.fag.picomanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "net.fag.picomanager")
public class PicoManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicoManagerApplication.class, args);
	}

}
