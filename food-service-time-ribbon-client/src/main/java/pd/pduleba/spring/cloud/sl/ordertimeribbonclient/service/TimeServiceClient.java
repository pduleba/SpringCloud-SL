package pd.pduleba.spring.cloud.sl.ordertimeribbonclient.service;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TimeServiceClient {

	@Inject
	private RestTemplate restTemplate;

	@GetMapping // nice shortcut
	public String getTime() {
		// here we are using logical identified on service stored in Eureka Discovery Service
		// under location is is mapped in TimeService.java
		return restTemplate.getForEntity("http://food-service-time-server", String.class).getBody();
	}

}
