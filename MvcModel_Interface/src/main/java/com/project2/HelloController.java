package com.project2;

//import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

	@RequestMapping("/hello")
	//public String display(HttpServletRequest req , Model m) {
		//String name = req.getParameter("name");
		//String password = req.getParameter("password");
	public String display(@RequestParam("name")String name,@RequestParam("password")String password , Model m) {
		
		
		if(password.equals("admin")) {
			
			String msg = "Hello " + name;
			m.addAttribute("message", msg);  
            return "viewpage"; 
		}
		else {
			String msg = "Sorry " + name + ". You entered incorrect password.";
			m.addAttribute("message", msg);
			return "errorpage";
		}
		
	}
}
