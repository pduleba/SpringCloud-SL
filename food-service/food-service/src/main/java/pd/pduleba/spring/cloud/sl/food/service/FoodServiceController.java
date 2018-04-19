package pd.pduleba.spring.cloud.sl.food.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodServiceController {

	@Value("${food.service.instance.name}")
	private String instanceName;

	@RequestMapping("/")
	public String food() {
		return "food from " + instanceName;
	}

}
