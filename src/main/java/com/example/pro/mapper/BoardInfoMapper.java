package com.example.pro.mapper;

import java.util.List;

import com.example.pro.vo.BoardInfoVO;

public interface BoardInfoMapper {
	
	List<BoardInfoVO> selectBoardInfos(BoardInfoVO board);
	
}