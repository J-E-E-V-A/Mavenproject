package com.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpdetailsGetter {
	@RequestMapping("/getemp")
	public String getempdet() {
		return "empdet";
	}
}
