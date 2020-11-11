package com.board.service;

import java.util.List;

import com.board.domain.BlogVO;
import com.board.domain.Criteria;
import com.board.domain.PlaceVO;

public interface PlaceService {
	public PlaceVO get(Long bno);
	
	public List<PlaceVO> getList_N();
	
	public List<PlaceVO> getList_S();

	public int getTotal(Criteria cri);
	
	public List<BlogVO> getBlog(Long bno);
	
}
