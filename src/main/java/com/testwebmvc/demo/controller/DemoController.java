package com.testwebmvc.demo.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Copyright: Copyright (c) 2020</p>
 * <p>succez</p>
 *
 * @author lijuny
 * @date 2021/1/21
 */
@RestController
public class DemoController {

	final StringRedisTemplate template;

	public DemoController(StringRedisTemplate template) {
		this.template = template;
	}

	@GetMapping("/get")
	private boolean get() {
		template.convertAndSend("chat", "Hello from Redis!");
		return true;
	}
}
