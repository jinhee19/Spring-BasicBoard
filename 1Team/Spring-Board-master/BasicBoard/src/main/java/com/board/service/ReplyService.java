package com.board.service;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyService {
	
	public int register(ReplyVO vo);

	public List<ReplyVO> getList(Long bno);
	
	/*
	public List<ReplyVO> replyListService() throws Exception;
	
	public int replyInsertService(ReplyVO reply) throws Exception;
	
	public int replyUpdateService(ReplyVO reply) throws Exception;
	
	public int replyDeleteService(int rno) throws Exception;
	*/
}
