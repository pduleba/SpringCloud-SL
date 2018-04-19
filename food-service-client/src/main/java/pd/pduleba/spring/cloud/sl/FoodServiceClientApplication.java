package pd.pduleba.spring.cloud.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FoodServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceClientApplication.class, args);
	}
}
