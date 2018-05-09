package pd.pduleba.spring.cloud.sl.foodservicehystrixdashboardturbineaggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class FoodServiceHystrixDashboardTurbineAggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceHystrixDashboardTurbineAggregatorApplication.class, args);
	}
}
