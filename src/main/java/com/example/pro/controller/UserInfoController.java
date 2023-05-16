package com.example.pro.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.pro.service.UserInfoService;
import com.example.pro.vo.UserInfoVO;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@AllArgsConstructor // 생성자 방식 롬복지원
public class UserInfoController {

	private final UserInfoService userInfoService;
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	@GetMapping("/join")
	public String goJoin() {
		return "user/join";
	}
//	@PostMapping("/join")
//	public String join(@RequestParam Map<String, String> user) {
//		// vo없이 map형태로 받을 수는 있지만 데이터타입을 알 수가 없고
//		// 키값이 달라도 null이라는 형태로 만들어져 잘 사용하지 않는다.
//		log.info("user=>{}", user);
//		return "";
//	}

	@PostMapping("/join")
	public String join(@ModelAttribute UserInfoVO user, Model m) {
		// 날짜형식 "-" 에서 ""빈문자로 교체
		user.setUiBirth(user.getUiBirth().replace("-", ""));
		m.addAttribute("msg", "회원가입에 실패하였습니다.");
		m.addAttribute("url", "/join");
		log.info("user=>{}", user);
		if (userInfoService.getUserInfoVOByUiId(user) != null) {
			// 아이디중복검사 후
			m.addAttribute("msg", "이미 등록된 아이디입니다.");
			m.addAttribute("url", "/join");
		} else if (userInfoService.join(user)) {
			m.addAttribute("msg", "회원가입이 성공하였습니다.");
			m.addAttribute("url", "/login");
		}
		return "common/msg";
	}

	@GetMapping("/login")
	public String goLogin() {
		return "user/login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute UserInfoVO user, HttpSession session, Model m) {
		
		if (userInfoService.getUserInfoVO(user, session, m)) {
			return "common/msg";
		}
		return "common/msg";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "user/login";
	}
	@GetMapping("/profile")
	public String profile(@ModelAttribute UserInfoVO user, HttpSession session, Model m) {
		
		return "user/profile";
	}
}