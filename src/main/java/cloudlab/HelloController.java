package cloudlab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello() {
		return "Welcome to my first spring boot page.";
	}
//	@RequestMapping(value="/hello",method=RequestMethod.POST)
//	public String hello(int i) {
//		return "Welcome to my first spring boot page1111.";
//	}

}
