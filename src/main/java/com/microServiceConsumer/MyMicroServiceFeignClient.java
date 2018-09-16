package com.microServiceConsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("MYMICROSERVICE")
public interface MyMicroServiceFeignClient {
	
	@RequestMapping(method= RequestMethod.GET,
				value="/myPreferences/callAtNight",
				consumes="application/json")
	String getCallAtNight();

}
