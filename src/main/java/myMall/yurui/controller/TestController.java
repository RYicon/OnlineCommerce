package myMall.yurui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import myMall.yurui.entity.User;
import myMall.yurui.service.TestService;

@Controller
@RequestMapping(value = "")
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/")
	public String index() {
		List<User>list= testService.findAll();
		System.out.println(list.toString());
		return "test/index";
	}
}
