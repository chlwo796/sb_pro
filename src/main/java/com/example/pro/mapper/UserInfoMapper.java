package com.example.pro.mapper;

import com.example.pro.vo.UserInfoVO;

public interface UserInfoMapper {

	int insertUserInfo(UserInfoVO user); // 회원가입
	int deleteUserInfo(int uiNum); // 회원탈퇴
	UserInfoVO selectUserInfoByUiId(UserInfoVO user); // ID중복검사
	UserInfoVO selectUserInfo(UserInfoVO user);
}
