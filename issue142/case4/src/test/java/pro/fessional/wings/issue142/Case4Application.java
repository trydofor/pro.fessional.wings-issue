package pro.fessional.wings.issue142;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.fessional.wings.issue142.config.Configuration1;
import pro.fessional.wings.issue142.config.Configuration2;

@SpringBootApplication
@ImportAutoConfiguration({Configuration1.class, Configuration2.class})
public class Case4Application {

	public static void main(String[] args) {
		SpringApplication.run(Case4Application.class, args);
	}

}
