package com.dzkj2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dzkj2.pojo.User;

@Controller
public class ShowController {
	@RequestMapping("show")
	public String showAll(Model model) {
	User user1 = new User("罗涛", "123");
	User user2 = new User("罗涛2", "123");
	User user4 = new User("罗涛3", "123");
	
	List<User> data = new ArrayList<User>();
	data.add(user1);
	data.add(user2);
	data.add(user4);
	model.addAttribute("data", data);
	return "list";
	
	}
	@RequestMapping("show2")
	public String show2() {
		return "index";
	}
	@RequestMapping("show3")
	public String show3(Model model) {
		User user1 = new User("罗涛", "123");
		User user2 = new User("罗涛2", "123");
		User user4 = new User("罗涛3", "123");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", user1);
		map.put("2", user2);
		map.put("4", user4);
		return "list2";
	}
	@RequestMapping("show4")
	public String show4() {
		return "index2";
	}
	
}
