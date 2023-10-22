package pro.fessional.wings.issue142;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.fessional.wings.issue142.config.Configuration1;
import pro.fessional.wings.issue142.config.Configuration2;

@SpringBootApplication
@ImportAutoConfiguration({Configuration1.class, Configuration2.class})
public class Case1Application {

	public static void main(String[] args) {
		SpringApplication.run(Case1Application.class, args);
	}

}
