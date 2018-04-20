package pd.pduleba.spring.cloud.sl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope
public class FoodServiceConfigClientApplication {

	@Autowired
	private FoodServiceConfigClientConfiguration configuration;

	@Value("${some.other.property}")
	private String someOtherProperty;

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceConfigClientApplication.class, args);
	}

	@RequestMapping("/")
	public String printConfig() {
		StringBuffer response = new StringBuffer();
		response.append(" some.property = ");
		response.append(configuration.getProperty());
		response.append(" some.other.property = ");
		response.append(someOtherProperty);

		return response.toString();
	}
}
