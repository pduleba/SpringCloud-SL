package pd.pduleba.spring.cloud.sl.foodconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FoodConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodConfigClientApplication.class, args);
	}
}
