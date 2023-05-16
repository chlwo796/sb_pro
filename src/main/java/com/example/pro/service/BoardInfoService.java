package com.example.pro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pro.mapper.BoardInfoMapper;
import com.example.pro.vo.BoardInfoVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardInfoService {

	private final BoardInfoMapper boardInfoMapper;

	public PageInfo<BoardInfoVO> getBoardInfos(BoardInfoVO board) {
		PageHelper.startPage(1, 10); // 1페이지 10개 게시물
//		List<BoardInfoVO> boards = boardInfoMapper.selectBoardInfos(board);
//		PageInfo<BoardInfoVO> pageInfo = new PageInfo<>(boards); 
		// 맵과 비슷한 PageInfo타입으로 페이징한다
		
		return new PageInfo<>(boardInfoMapper.selectBoardInfos(board));
	}
}