package com.debu.ms.app2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="app1")
public interface app1Proxy {
	@GetMapping("/")
	public app1Response getApp1Response();
}
