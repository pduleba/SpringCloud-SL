package pd.pduleba.spring.cloud.sl.ordertimeribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderTimeRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderTimeRibbonClientApplication.class, args);
	}
}
