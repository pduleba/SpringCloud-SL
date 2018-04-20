package pd.pduleba.spring.cloud.sl.foodconfigclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// Prefix is related to *.properties provided by SpringCloudConfig-SL git
// repository via food-service-config
@ConfigurationProperties(prefix = "some")
public class FoodServiceConfigClientConfiguration {

	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

}
