package ks44team03.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/")
	public String main(Model model, HttpSession session) {
		session.setAttribute("TESTID", "id001");
		session.setAttribute("TESTNAME", "일동");
		return "main";
	
	}
}
