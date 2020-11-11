package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.domain.BlogVO;
import com.board.domain.Criteria;
import com.board.domain.PlaceVO;
import com.board.mapper.PlaceMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
public class PlaceServiceImpl implements PlaceService{
	
	
	@Setter(onMethod_= {@Autowired})
	private PlaceMapper mapper;
	
	@Override
	public PlaceVO get(Long bno) {
		return mapper.read(bno);		
	}

	@Override
	public List<PlaceVO> getList_N() {
		log.info("get List..............");

		return mapper.getList_N();
	}
	
	@Override
	public List<PlaceVO> getList_S() {
		log.info("get List..............");

		return mapper.getList_S();
	}
	
	@Override
	public int getTotal(Criteria cri) {

		log.info("get total count");
		return mapper.getTotalCount(cri);
	}
	
	@Override
	public List<BlogVO> getBlog(Long bno){
		log.info("get Blog..............");

		return mapper.getBlog(bno);
	}
	
	
	

}
