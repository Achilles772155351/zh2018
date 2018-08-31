package javalearn.ssh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SshApplication {
	
	private final static Logger logger = LoggerFactory.getLogger(SshApplication.class);
    @RequestMapping("/")
    @ResponseBody
    public String index() {
    	logger.info("---7777777777777777666666666666666666666666666666666666666666666666666");
    	logger.debug("---7777777777777777666666666666666666666666666666666666666666666666666");
        return "Hello Spring Boot";
    }

    @RequestMapping("/haha")
    public String index2() {
        return "NewFile2.html";
    }
    
    @RequestMapping("/haha2")
    public String index3() {
    	logger.info("---7777777777777777666666666666666666666666666666666666666666666666666");
    	logger.debug("---6666666666666666666666666666666666666666666666666666666666666666");
        return "NewFile";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(SshApplication.class, args);
	}
}
