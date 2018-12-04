package com.tutorial.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/")
public class MemberController {

	@RequestMapping("")
	public String home() {
		return "redirect:/member/login";
	}

	@RequestMapping("login")
	public String login() {
		return "member.login";
	}

	@RequestMapping("join")
	public String join() {
		return "member.join";
	}

	@RequestMapping("profile")
	public String profile() {
		return "member.profile";
	}

}
