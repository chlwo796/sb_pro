package com.example.pro.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.pro.service.BoardInfoService;
import com.example.pro.vo.BoardInfoVO;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardInfoController {

	private final BoardInfoService boardInfoService;

	@GetMapping("/boards")
	public String getBoards(@ModelAttribute BoardInfoVO boardInfoVO, Model m) {
//		List<BoardInfoVO> boards = boardInfoService.getBoardInfos(boardInfoVO);
//		m.addAttribute("boards", boards);
		// 서비스 페이징 구현 후 수정

		m.addAttribute("page", boardInfoService.getBoardInfos(boardInfoVO));
		return "board/board-list";
	}
}