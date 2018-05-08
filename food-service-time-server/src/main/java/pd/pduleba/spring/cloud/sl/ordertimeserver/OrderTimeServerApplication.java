package pd.pduleba.spring.cloud.sl.ordertimeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderTimeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderTimeServerApplication.class, args);
	}
}
