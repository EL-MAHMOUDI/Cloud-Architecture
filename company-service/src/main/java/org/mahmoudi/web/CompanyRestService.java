package org.mahmoudi.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CompanyRestService {
	@Value("${xParam}")
	private int xParam;
	@Value("${yParam}")
	private int yParam;
	@Value("${me}")
	private String me;
	@Value("${password}")
	private String password;
	@GetMapping("/config")
	public Map<String, Object> getMyConfig(){
		Map<String, Object> config = new HashMap<String, Object>();
		config.put("xParam", xParam);
		config.put("yParam", yParam);
		config.put("me", me);
		config.put("password", password);
		config.put("threadName",Thread.currentThread().getName());
		return config;
	}
}
