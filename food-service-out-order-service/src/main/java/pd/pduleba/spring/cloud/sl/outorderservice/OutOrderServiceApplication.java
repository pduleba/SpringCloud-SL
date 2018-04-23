package pd.pduleba.spring.cloud.sl.outorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class OutOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OutOrderServiceApplication.class, args);
	}

	@RequestMapping
	public String outOrder(@RequestHeader("x-location") String location) {
		return "Out order in progress... at " + location;
	}
}
