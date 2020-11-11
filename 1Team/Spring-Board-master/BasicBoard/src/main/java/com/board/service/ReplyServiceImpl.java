package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.domain.ReplyVO;
import com.board.mapper.ReplyMapper;
import lombok.Setter;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	@Setter(onMethod_= {@Autowired})
	private ReplyMapper mapper;
	
	@Override
	public List<ReplyVO> getList(Long bno) {
		return mapper.getReplyList(bno);
	}

	@Override
	public int register(ReplyVO vo) {
		return mapper.insert(vo);
	}
	
	/*
	@Setter(onMethod_= {@Autowired})
	private ReplyMapper mapper;
	
	@Override
	public List<ReplyVO> replyListService() throws Exception{
		return mapper.replyList();
	}
	
	@Override
	public int replyInsertService(ReplyVO reply) throws Exception{
		return mapper.replyInsert(reply);
	}
	
	@Override
	public int replyUpdateService(ReplyVO reply) throws Exception{
		return mapper.replyUpdate(reply);
	}
	
	@Override
	public int replyDeleteService(int rno) throws Exception{
		return mapper.replyDelete(rno);
	}
	*/
}
