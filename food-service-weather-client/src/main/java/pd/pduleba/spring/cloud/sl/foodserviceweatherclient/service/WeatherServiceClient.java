package pd.pduleba.spring.cloud.sl.foodserviceweatherclient.service;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherServiceClient {

	@Inject
	private WeatherService weatherService;

	@GetMapping("/current/weather") // nice shortcut
	public String getWeather() {
		return "The current weather is " + weatherService.getWeather();
	}

}
