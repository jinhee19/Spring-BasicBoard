<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

	</head>

	<body>
		<div class="page-wrap">

			<!-- Nav -->
				<nav id="nav">
					<ul>
						<li><a href="/index" ><span class="icon fa-home"></span></a></li>
						<li><a href="#" class="active"><span class="icon fa-file-text-o"></span></a></li>
						<li><a href="#"><span class="icon fa-camera-retro"></span></a></li>
					</ul>
				</nav>

			<!-- Main -->
				<section id="main">
					<!-- Banner -->
						<section id="banner1">
							<div class="inner">
								<h1>E-riro 플레이스</h1>	
                                              </div>
                                              </section>
						

					<!-- Header -->
						<header id="header">
							<div><h1>#강북</h1></div>
						</header>
            
					<!-- Section -->
	 		    <section>
                    
                        <table>
                            <tr><th> E-riro 플레이스 목록</th></tr>
                            <c:forEach items="${list }" var="placeList">
							<tr><td><a href="/get?bno=${ placeList.bno }">${placeList.title }</a></td></tr>
                           </c:forEach>
 		                 </table>
                   
				</section>
                    
                    <footer>
                    <br><br><br>
                    </footer>
			  
            </section>
		</div>


	</body>
</html>