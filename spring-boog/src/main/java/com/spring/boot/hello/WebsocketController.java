package com.spring.boot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/websocket")
public class WebsocketController {

	@RequestMapping("/index")
	public String index() {
		return "webSocketServer";
	}
	
}
