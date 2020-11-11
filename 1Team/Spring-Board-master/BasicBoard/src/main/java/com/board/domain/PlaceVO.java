package com.board.domain;

import lombok.Data;

@Data
public class PlaceVO {

	private Long bno;
	private Long division;
	private String image;
	private String title;
	private String tel;
	private String address;
	private String usetime;
	private String fee_kind;
	private String fee;
}
