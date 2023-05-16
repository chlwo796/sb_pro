package com.example.pro.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.pro.mapper.UserInfoMapper;
import com.example.pro.vo.UserInfoVO;

import lombok.AllArgsConstructor;

@Service // 메모리 생성필요
@AllArgsConstructor
public class UserInfoService {

	private final UserInfoMapper userInfoMapper;

	public boolean join(UserInfoVO user) {

		return userInfoMapper.insertUserInfo(user) == 1;
	}

	public UserInfoVO getUserInfoVOByUiId(UserInfoVO user) {
		return userInfoMapper.selectUserInfoByUiId(user);
	}

	public boolean getUserInfoVO(UserInfoVO user, HttpSession session, Model m) {
		UserInfoVO tempUser = userInfoMapper.selectUserInfo(user);
		m.addAttribute("msg", "아이디나 비밀번호가 잘못되었습니다");
		m.addAttribute("url", "/login");
		if (tempUser != null) {
			session.setAttribute("user", tempUser);
			m.addAttribute("msg", "로그인 성공하였습니다.");
			m.addAttribute("url", "/index");
			return true;
		}
		return false;
	}
}