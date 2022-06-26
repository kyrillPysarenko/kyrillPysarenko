package porg2_ss22.ha6kyrillPysarenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@EnableScheduling
public class Ha6KyrillPysarenkoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ha6KyrillPysarenkoApplication.class, args);
	}

}
