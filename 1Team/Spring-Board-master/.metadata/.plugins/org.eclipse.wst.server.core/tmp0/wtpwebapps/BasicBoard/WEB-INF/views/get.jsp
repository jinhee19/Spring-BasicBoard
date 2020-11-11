<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="reply.jsp" %>
<!DOCTYPE HTML>
<!--
	Snapshot by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>E-riro</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="/resources/assets/css/main.css" />
		
		<!--  
		 <script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
			
		<script>
			const regReply = () => {
				
				const replyData = {
					bno: $("#hidden-bno-field").val(),
					replyer: $("#reply-writer").val(),
					reply: $("#reply").val()
				};
				
				$.ajax({
					type: "post",
					url: "/reply/new",
					data: JSON.stringify(replyData),	// 자바스크립트의 객체를 JSON 문자열화 시켜주는 함수
					contentType: "application/json; charset=utf-8", 	// contentType : 클라이언트가 서버에게 파라미터를 넘기면서 이건 json 이야~ 라고 알려주는 것
					success: function(item){
						const template = '<div class="reply-wrapper">'+
						'<p class="replyer">'+item['replyer']+'<span class="reply-regdate">'+item['replyDate']+'</span>'+
						'<p class="reply">'+item['reply']+'</p></div>';
					
				
						$(".reply-container").append(template);				
					}
				});
				
			};
		</script>
		-->
	</head>
	<body>
		<div class="page-wrap">

			<!-- Nav -->
				<nav id="nav">
					<ul>
						<li><a href="/index"><span class="icon fa-home"></span></a></li>
						<li><a href="#"><span class="icon fa-file-text-o"></span></a></li>						
						<li><a href="#" class="active"><span class="icon fa-camera-retro"></span></a></li>

					</ul>
				</nav>

			<!-- Main -->
				<section id="main">

					<!-- Header -->
						<header id="header">
						<div><h3><font face='배달의민족 한나는 열한살'>${place.title}</font></h3></div>
                            
						</header>

					<!-- Gallery -->
						<section id="galleries">

							<!-- Photo Galleries -->
								<div class="gallery">
									<!-- Filters -->
										<header>
											<h2>Information</h2>
                                            <div id="pic">
											<img src="/resources/images/${place.image}" width=50% height=50%/>
									<div class="social column">
									<table>
									<c:if test="${not empty place.title}">
									<tr>
										<th>${place.title }</th>
									</tr>
									</c:if>
									<c:if test="${not empty place.tel}">
									<tr>
										<td>${place.tel }</td>
									</tr>
									</c:if>
									<c:if test="${not empty place.address}">
									<tr>
										<td>${place.address }</td>
									</tr>
									</c:if>
									<c:if test="${not empty place.usetime}">
									<tr>
										<td>${place.usetime }</td>
									</tr>
									</c:if>
									<c:if test="${not empty place.fee}">
									<tr>
										<td>${place.fee_kind } ${place.fee} </td>
									</tr>
									</c:if>
									
									</table>
									
									<br>
									<br>
									<!-- Reply -->
									
									<div class="container">
							        <label for="reply">comment</label>
							        <form name="replyInsertForm">
							            <div class="input-group">
							               <input type="hidden" name="bno" value="${place.bno}"/>
							               <input type="text" class="form-control" id="reply" name="reply" placeholder="내용을 입력하세요.">
							               <span class="input-group-btn">
							                    <button class="btn btn-default" type="button" name="replyInsertBtn">등록</button>
							               </span>
							              </div>
							        </form>
								    </div>
								    
								    <div class="container">
								        <div class="replyList"></div>
								    </div>
									

									<!--  
									<div class="reply-input-container">
										<div class="reply-header">
											<input type="text" id="reply-writer" placeholder="작성자"/>
											<button id="btn-reply-reg" onclick="regReply()">댓글 등록</button>
										</div>
										<br>
										<p>
											<textarea style="resize: none" id="reply"
												placeholder="댓글 내용을 입력해  주세요"></textarea>
										</p>
									</div>
									
									
									<div class="reply-container">

										<div class="reply-wrapper">
											<p class="replyer">
												작성자이름 <span class="reply-regdate">2020-07-31</span>
											</p>
											<p class="reply">내용</p>
										</div>
						
									</div>
									
									<input type="hidden" value="${ board.bno }" id="hidden-bno-field" />
									-->
									
									<!-- Blog -->
										<c:if test="${not empty blog}">
										<div class="content">
										<c:forEach items="${blog }" var="blogList">
											<div class="media">
												<a href="${blogList.url }"><img src="/resources/images/banner.jpg" alt="" /></a>
												<h5>${blogList.title }</h5>
											</div>
										</c:forEach>
										</c:if>
									</div>
									</div>
									</div>
								</header>
									
								</div>
							
						</section>

					<!-- Contact -->
					
						<section id="contact">
							<div></div>
							<div class="feed">
	                            <table>
	                            	<tbody>
		                               
	                                </tbody>
	                            </table>
                        	</div>
						</section>
				</section>
		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.poptrox.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
	
	<!--  
	<script>
		const reqBno = $("#hidden-bno-field").val();
		$.ajax({
			url : "/reply/"+reqBno,
			success : function(response) {
				
				const replyList = response;
				const replyContainer = $(".reply-container");
				
				replyContainer.empty();
				
				replyList.forEach((item) => {
					
					const template = '<div class="reply-wrapper">'+
							'<p class="replyer">'+item['replyer']+'<span class="reply-regdate">'+item['replyDate']+'</span>'+
							'<p class="reply">'+item['reply']+'</p></div>';
						
					
					replyContainer.append(template);
				})
				
			}
		});
	</script>
	-->
</html>
	