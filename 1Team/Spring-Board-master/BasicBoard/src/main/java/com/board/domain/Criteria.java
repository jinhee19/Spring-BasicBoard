package com.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	//Criteria Ŭ���� : �˻��� ������ �ǹ��ϴ� Ŭ����
	private int pageNum;
	private int amount;
	
	private int start;
	private int end;
	
	//�˻� ���� �߰�
	private String type;
	//�˻���
	private String keyword;
	
		
	public Criteria() {
		this(1, 10);	//�⺻���� ������ 1�������� �����ֵ��� �� ����
	}
	
	public Criteria(int pageNum, int amount) {
		
		this.pageNum = pageNum;
		this.amount  = amount;

		this.start = (pageNum-1) * amount;
		this.end   = pageNum * amount;
	}
	
	//������ �˻� ���� ���ϱ� - TCW
	public String[] getTypeArr() {
		//Ÿ���� ������ ����ִ� ���ڿ� �迭�� ����
		//Ÿ���� ������ ���ڿ��� �ϳ��� �ɰ��� �迭ȭ ��Ű�� ����
		return type == null ? new String[] {} : type.split("");
	}
}