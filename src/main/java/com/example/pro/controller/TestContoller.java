package com.example.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContoller {
	
	@GetMapping("/test")
	@ResponseBody // 최근개발형식
	public String hi() {
		// json 형태로 출력 후 자바스크립트로 화면을 그리는 방식
		return "hi";
	}
}