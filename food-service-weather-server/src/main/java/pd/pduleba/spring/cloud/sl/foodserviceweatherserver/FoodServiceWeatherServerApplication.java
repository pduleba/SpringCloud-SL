package pd.pduleba.spring.cloud.sl.foodserviceweatherserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FoodServiceWeatherServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceWeatherServerApplication.class, args);
	}
}
