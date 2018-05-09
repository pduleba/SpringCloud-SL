package pd.pduleba.spring.cloud.sl.foodservicehystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class FoodServiceHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceHystrixDashboardApplication.class, args);
	}
}
