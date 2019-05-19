package org.catapult.genericapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping(value = "/index")
	public String index(Model model) {
        model.addAttribute("title", "see me");
		return "index";
	}
}
