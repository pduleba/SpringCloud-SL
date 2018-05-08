package pd.pduleba.spring.cloud.sl.foodserviceweatherserver.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.servo.jsr166e.ThreadLocalRandom;

@RestController
public class WeatherService {

	private String[] weather = new String[] { "sunny", "cloudy", "rainy", "windy" };

	@GetMapping("/weather") // nice shortcut
	public String getTime() {
		int index = ThreadLocalRandom.current().nextInt(0, weather.length);
		return weather[index];
	}

}
