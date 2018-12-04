package com.tutorial.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@RequestMapping("")
	public String home() {
		return "redirect:/board/list";
	}

	@RequestMapping("list")
	public String list() {
		return "board.list";
	}

	@RequestMapping("detail")
	public String detail() {
		return "board.detail";
	}

	@RequestMapping("reg")
	public String reg() {
		return "board.reg";
	}

	@RequestMapping("edit")
	public String edit() {
		return "board.edit";
	}

}
