package pd.pduleba.spring.cloud.sl.inorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class InOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InOrderServiceApplication.class, args);
	}

	@RequestMapping
	public String inOrder() {
		return "In order in progress...";
	}
}
