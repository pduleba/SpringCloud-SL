package pd.pduleba.spring.cloud.sl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope // Override default scope
public class FoodServiceConfigClientApplication {

	@Autowired
	private FoodServiceConfigClientConfiguration configuration;

	@Value("${some.other.property}")
	private String someOtherProperty;

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceConfigClientApplication.class, args);
	}

	@RequestMapping(path = "printConfig", method = RequestMethod.GET)
	public String printConfig() {
		StringBuffer response = new StringBuffer();
		response.append(configuration.getProperty());
		response.append(" || ");
		response.append(someOtherProperty);

		return response.toString();
	}
}
