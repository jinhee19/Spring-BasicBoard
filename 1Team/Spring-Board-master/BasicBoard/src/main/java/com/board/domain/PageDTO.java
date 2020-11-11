package com.board.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageDTO {

	// ���� ���� �������� ������ �������� ������ ����
	// ex) startPage�� 1�̶�� endPage�� 10
	private int startPage;
	private int endPage;

	// ���� ����ڰ� �Խñ��� ��� ��ġ�� ó������ ���������� ����
	private boolean prev, next;

	// ��ü ���� ����
	private int total;

	// �� �������� ��� �����͸� ������ �������� �����ϴ� Criteria
	private Criteria cri;

	public PageDTO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;

		// ���� �����ִ� ���������� ������ ������ ��ȣ ���ϱ�
		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;

		// ���� ���� �ִ� ���������� ���� ù ��° ������ ��ȣ ���ϱ�
		this.startPage = this.endPage - 9;

		// ������ �������� ����� ���� ����
		int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));

		// endPage�� * 10�� �ȴ�.
		// �׷��� ������ 11���� ���� �ִ��� ������ endPage�� 20���� ��������.
		if (realEnd < this.endPage) {
			this.endPage = realEnd;
		}

		// �����ΰ��� ��ư�� �����ַ��� startPage�� ������ 1���� Ŀ���Ѵ�.
		this.prev = this.startPage > 1;

		// �ڷΰ��� ��ư�� �����ַ��� endPage�� realEnd���� �۾ƾ� �Ѵ�.
		this.next = this.endPage < realEnd;

	}

}