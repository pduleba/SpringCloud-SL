package pd.pduleba.spring.cloud.sl.food.servive.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class FoodServiceClientController {

	@Autowired
	private EurekaClient client;

	@Autowired
	private RestTemplateBuilder builder;

	@RequestMapping("/callForFood")
	public String callForFood() {
		// Ask Discovery Server for available instance details of FoodService
		InstanceInfo instanceInfo = client.getNextServerFromEureka("food-service", false);

		RestTemplate restTemplate = builder.build();
		String baseUrl = instanceInfo.getHomePageUrl();
		ResponseEntity<String> response = restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class);

		return response.getBody();
	}

}
