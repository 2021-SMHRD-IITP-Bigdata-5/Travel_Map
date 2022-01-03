<%@page import="com.snsDAO.tm_snsDAO"%>
<%@page import="com.memberDTO.tm_memberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./assets/css/N4_mypage_login_3myinfo.css" />
<title>N4_mypage_login_3myinfo</title>
</head>

<body>
	<%
		tm_memberDTO memberdto = (tm_memberDTO) session.getAttribute("dto");
	tm_snsDAO dao = new tm_snsDAO();
	int snsCount = dao.snsCount(memberdto.getMb_id());
	%>
	<div id="side_bar">
		<b>My Real Travel in GwangJu </b>
		<button onClick="location.href='Join.jsp'">회원가입</button>
		<button onClick="location.href='Login.jsp'">로그인</button>
	</div>
	<div id="side_all">
		<div id="side_one">
			<nav>
				<ul class="side_menu">
					<!-- onClick="window.location.reload()" -->
					<li><button class="side_button"
							onClick="location.href='N1_main.jsp'">
							<a href="#">검색</a>
						</button></li>
					<li><button class="side_button"
							onClick="location.href='N2_travelplan1.jsp'">
							<a href="#">여행계획</a>
						</button></li>
					<li><button class="side_button"
							onClick="location.href='N3_mypage_login_1bookmark1.jsp'">
							<a href="#">My</a>
						</button></li>
					<li><button class="side_button"
							onClick="location.href='N4_mypage_sns.jsp'">
							<a href="#">SNS</a>
						</button></li>
				</ul>
			</nav>
		</div>
		<div id="side_two">
			<ul>
				<li><button class="side_button"
						onClick="location.href='N3_mypage_login_1bookmark1.jsp'">내계획</button></li>
				<li><button class="side_button"
						onClick="location.href='N3_mypage_login_2mynews.jsp'">내소식</button></li>
				<li><button class="side_button"
						onClick="location.href='N3_mypage_login_3myinfo.jsp'">내정보</button></li>
			</ul>
		</div>
		<div id="side_three">
			<div id="profile_img">
				<div>
					<img src="./img/aron_ch.PNG">
				</div>
				<a href="#">프로필 이미지 변경</a>
			</div>
			<div id="profile_info">
				<table>
					<colgroup>
						<col style="width: 40%;">
					</colgroup>
					<tr>
						<td>닉네임</td>
						<td><b><%=memberdto.getMb_nickname()%></b></td>
					</tr>
					<tr>
						<td>게시물</td>
						<td><b><%=snsCount%></b></td>
					</tr>
					<tr>
						<td>팔로워</td>
						<td><b><%=memberdto.getMb_follower()%></b></td>
					</tr>
					<tr>
						<td>팔로우</td>
						<td><b><%=memberdto.getMb_follow()%> </b></td>
					</tr>
				</table>
			</div>

		</div>
		<div id="side_for"></div>
		<div id="side_five"></div>

	</div>

	<!-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
	<div id="map" style="width: 73.3%; height: 100vh; float: right;"></div>


	<script src="./assets/js/jquery-3.6.0.min.js"></script>
	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=31e189d0d305a85663770a625b11688d&libraries=services"></script>
	<script type="text/javascript">
		var mapContainer = document.getElementById('map'); // 지도를 표시할 div 
		mapOption = {
			center : new kakao.maps.LatLng(35.11070531999631,
					126.87780481325912), // 지도의 중심좌표 - 스마트인재개발원
			level : 3
		// 지도의 확대 레벨
		};
		// 지도를 생성합니다    
		var map = new kakao.maps.Map(mapContainer, mapOption);
	</script>


</body>

</html>