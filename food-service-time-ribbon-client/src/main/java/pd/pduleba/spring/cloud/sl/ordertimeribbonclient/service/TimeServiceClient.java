package pd.pduleba.spring.cloud.sl.ordertimeribbonclient.service;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeServiceClient {

	@Inject
	private TimeService timeService;

	@GetMapping("/current/time") // nice shortcut
	public String getTime() {
		// here we are using logical identified on service stored in Eureka Discovery Service
		// under location is is mapped in TimeService.java
		return timeService.getTime();
	}

}
