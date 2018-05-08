package pd.pduleba.spring.cloud.sl.ordertimeribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import pd.pduleba.spring.cloud.sl.ordertimeribbonclient.service.FoodServiceTimeRibbonClientConfig;

@RibbonClient(name = "food-service-time-server", configuration = FoodServiceTimeRibbonClientConfig.class)
@SpringBootApplication
public class OrderTimeRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderTimeRibbonClientApplication.class, args);
	}
}
