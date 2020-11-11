package com.board.mapper;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyMapper {
	
		// insert, update, delete를 할 때 성공한 row의 개수를 반환한다.
		public int insert(ReplyVO replyVO);
		// public ReplyVO read(Long rno);
		public List<ReplyVO> getReplyList(Long bno); 
	
	/*
	// 댓글 개수
	public int replyCount() throws Exception;
	
	// 댓글 목록
	public List<ReplyVO> replyList() throws Exception;
	
	// 댓글 작성
	public int replyInsert(ReplyVO reply) throws Exception;
	
	// 댓글 수정
	public int replyUpdate(ReplyVO reply) throws Exception;
	
	// 댓글 삭제
	public int replyDelete(int rno) throws Exception;
	*/
}
