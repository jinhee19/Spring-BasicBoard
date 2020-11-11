package com.board.domain;

import lombok.Data;

@Data
public class BlogVO {
	private Long blog_bno;
	private String title;
	private String url;
	private String blog_image;
}
