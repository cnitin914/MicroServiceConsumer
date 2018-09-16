package com.microServiceConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callMyMicroService")
public class ConsumeMyMicroServiceController {

	@Autowired
	MyMicroServiceFeignClient myClient;
	
	@RequestMapping(path="/nightCallingPreference", method=RequestMethod.GET)
	public String getCallAtNight() {
		
		System.out.println("**About to call micro service");
		return myClient.getCallAtNight();
	}

}
