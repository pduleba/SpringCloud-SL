package pd.pduleba.spring.cloud.sl.ordertimeribbonclient.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TimeService {

	@Inject
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "unknown") // on Fallback unknown method is called!
	public String getTime() {
		// here we are using logical identified on service stored in Eureka Discovery Service
		// under location is is mapped in TimeService.java on food-service-time-server
		return restTemplate.getForEntity("http://food-service-time-server", String.class).getBody();
	}

	public String unknown() {
		return "unknown";
	}

}
