package pd.pduleba.spring.cloud.sl.foodserviceweatherclient.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WeatherService {

	@Inject
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "unknown") // on Fallback unknown method is called!
	public String getWeather() {
		// here we are using logical identified on service stored in Eureka Discovery Service
		// under location is is mapped in WeatherServerService.java
		return restTemplate.getForEntity("http://food-service-weather-server/weather", String.class).getBody();
	}

	public String unknown() {
		return "unknown";
	}

}
