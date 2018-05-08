package pd.pduleba.spring.cloud.sl.ordertimeserver.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeService {

	private static DateFormat FORMAT = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

	@Value("${server.port}")
	private int port;

	@GetMapping // nice shortcut
	public String getTime() {
		return FORMAT.format(new Date()) + " running on " + port;
	}

}
