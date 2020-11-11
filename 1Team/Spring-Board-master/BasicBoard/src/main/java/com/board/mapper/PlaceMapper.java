package com.board.mapper;

import java.util.List;

import com.board.domain.BlogVO;
import com.board.domain.Criteria;
import com.board.domain.PlaceVO;

public interface PlaceMapper {
	
	public PlaceVO read(Long bno);
	
	public int getTotalCount(Criteria cri);

	// ����¡ ��� ����Ʈ �����ֱ� �޼ҵ� �߰�
	public List<PlaceVO> getList_N();
	
	public List<PlaceVO> getList_S();
	
	public List<BlogVO> getBlog(Long bno);
	
	
}
