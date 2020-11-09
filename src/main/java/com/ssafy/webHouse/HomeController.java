package com.ssafy.webHouse;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.dto.User;
import com.ssafy.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private LoginService loginSvc;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	  @RequestMapping(value = "/", method = RequestMethod.GET) 
	  public String home(Locale locale, Model model) {
		  logger.info("Welcome home! The client locale is {}.", locale);
		  
		  Date date = new Date(); DateFormat dateFormat =
		  DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		  
		  String formattedDate = dateFormat.format(date);
		  
		  model.addAttribute("serverTime", formattedDate );
		  
		 return "index";
	}
	 

	
	@GetMapping("/signin")
	public String toSignIn() {
		return "signin";
	}
	  
	@GetMapping("/signup")
	public String toSignUp() {
		return "signup";
	}
	@GetMapping("/userhandler")
	public String toUserhandler() {
		return "userhandler";
	}
	@GetMapping("/changeUser")
	public String toChangeUser() {
		return "changeUser";
	}
	
	
	@GetMapping("/userList")
	public String toSearchUser(Model m){
		List<User> users = loginSvc.searchAll();
		m.addAttribute("users", users);
		return "userList";
	}
	@GetMapping("/deleteUser")
	public String toDeleteUser() {
		return "deleteUser";
	}
	
	@PostMapping("/signup")
	public String signup(User user) {
		loginSvc.add(user);
		return "index";
	}
	@PostMapping("/changeUser")
	public String changeUser(User user) {
		loginSvc.update(user);
		return "index";
	}
	@PostMapping("/deleteUser")
	public String deleteUser(String id) {
		loginSvc.delete(id);
		return "index";
	}
	
	@PostMapping("/signin")
	public String login(User user,
			Model m,HttpSession hs){
		String name=loginSvc.login(user);		
		if(name == null) {
			hs.setAttribute("user", name);
		}else{
			m.addAttribute("msg", "아이디 또는 패스워드를 확인하세요!");
		}
		return "index";
	}
}
