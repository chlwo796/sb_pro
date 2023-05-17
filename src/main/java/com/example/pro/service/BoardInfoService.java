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
		PageHelper.startPage(board.getPage(), board.getRows());
		// (default페이지개수, default게시물행수)
//		List<BoardInfoVO> boards = boardInfoMapper.selectBoardInfos(board);
//		PageInfo<BoardInfoVO> pageInfo = new PageInfo<>(boards); 
		// 맵과 비슷한 PageInfo타입으로 페이징한다

		return new PageInfo<>(boardInfoMapper.selectBoardInfos(board));
	}

	public BoardInfoVO selectBoardInfo(BoardInfoVO board) {
		BoardInfoVO boardInfo = boardInfoMapper.selectBoardInfo(board);
		if (boardInfo != null) {
			boardInfoMapper.updateBoardInfoCnt(boardInfo);
		}
		return boardInfo;
	}
}