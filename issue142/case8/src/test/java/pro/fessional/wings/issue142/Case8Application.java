package pro.fessional.wings.issue142;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import pro.fessional.wings.issue142.config.Configuration1;
import pro.fessional.wings.issue142.config.Configuration2;

@SpringBootApplication
@Import({Configuration1.class, Configuration2.class})
public class Case8Application {

    public static void main(String[] args) {
        SpringApplication.run(Case8Application.class, args);
    }

}
