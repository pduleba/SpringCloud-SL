package pd.pduleba.spring.cloud.sl.foodconfigclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pd.pduleba.spring.cloud.sl.foodconfigclient.FoodServiceConfigClientConfiguration;

@RestController
public class FoodServiceConfigClientController {

	private FoodServiceConfigClientConfiguration configuration;

	@Value("${some.other.property}")
	private String someOtherProperty;

	@RequestMapping
	public String printConfig() {
		StringBuffer response = new StringBuffer();
		response.append(" fromBean = ");
		response.append(configuration.getProperty());
		response.append(" || ");
		response.append(" fromController = ");
		response.append(someOtherProperty);

		return response.toString();
	}
}
