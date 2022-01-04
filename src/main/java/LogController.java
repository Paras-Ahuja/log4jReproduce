import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	
	
	public static final Logger logger = LogManager.getLogger(LogController.class);
	
	@GetMapping("/troll")
	public String getUserId(@RequestParam("userID") String id) {
		logger.info("user id :: "+id);
		return "Welcome my friend, welcome to my world!!";
	}
	

}
