package pd.pduleba.spring.cloud.sl.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pd.pduleba.spring.cloud.sl.gatewayserver.filters.AddRequestHeaderFilter;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@Configuration
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}

	@Bean
	public AddRequestHeaderFilter addRequestHeaderFilter() {
		return new AddRequestHeaderFilter();
	}
}
