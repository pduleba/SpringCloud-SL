package pd.pduleba.spring.cloud.sl.foodserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FoodServiceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceConfigApplication.class, args);
	}
}
