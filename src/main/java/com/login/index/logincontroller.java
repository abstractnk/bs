package com.login.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class logincontroller {

	@RequestMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	
}
