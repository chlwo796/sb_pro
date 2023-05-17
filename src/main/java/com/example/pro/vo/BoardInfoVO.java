package com.example.pro.vo;

import lombok.Data;

@Data
public class BoardInfoVO {
	private int biNum;
	private String biTitle;
	private String biContent;
	private String biFilePath;
	private String biCredat;
	private String biCretim;
	private int biCnt;
	private int uiNum;
	//페이징
	private int page = 1; // 페이지 수, default값 설정
	private int rows = 10; // 행 수
	private String uiName;
}
