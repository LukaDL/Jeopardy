<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<%@ page import="game.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jeopardy Welcome Page</title>
<link rel="stylesheet" href="styles/main.css" type="text/css">
</head>
<body>
	<%
	HttpSession session = request.getSession();
	Player p1 = (Player)session.getAttribute("player");
	boolean loadBoard = (boolean)session.getAttribute("loadBoard");
	int isCorrect = (int)session.getAttribute("isCorrect");
	ArrayList<Integer> selected = (ArrayList<Integer>)session.getAttribute("selected");
	
	if (loadBoard) {
		response.getWriter().append("<audio autoplay><source src=\"audio/GameLoad.mp3\" type=\"audio/mp3\"></audio>");
	} else if (isCorrect == 1) {
		response.getWriter().append("<audio autoplay><source src=\"audio/right.mp3\" type=\"audio/mp3\"></audio>");
	} else if (isCorrect == 2) {
		response.getWriter().append("<audio autoplay><source src=\"audio/wrong.mp3\" type=\"audio/mp3\"></audio>");
	} else {
		response.getWriter().append("<audio autoplay><source src=\"audio/skip.mp3\" type=\"audio/mp3\"></audio>");
	}
	%>
	
	<div class="gameboard">
		<table>
			<tr class="gameboardHeadings">
				<td>Looney Tunes</td>
				<td>NBA</td>
				<td>Canada</td>
				<td>Music</td>
				<td>Movies</td>
			</tr>
			<tr class="gameboardValues">
				<td id="0"><a href="PickQuestion?qNo=0&value=100&category=LooneyToons">$100</a></td>
				<td id="1"><a href="PickQuestion?qNo=1&value=100&category=NBA">$100</a></td>
				<td id="2"><a href="PickQuestion?qNo=2&value=100&category=Canada">$100</a></td>
				<td id="3"><a href="PickQuestion?qNo=3&value=100&category=Music">$100</a></td>
				<td id="4"><a href="PickQuestion?qNo=4&value=100&category=Movies">$100</a></td>
			</tr>
			<tr class="gameboardValues">
				<td id="5"><a href="PickQuestion?qNo=5&value=200&category=LooneyToons">$200</a></td>
				<td id="6"><a href="PickQuestion?qNo=6&value=200&category=NBA">$200</a></td>
				<td id="7"><a href="PickQuestion?qNo=7&value=200&category=Canada">$200</a></td>
				<td id="8"><a href="PickQuestion?qNo=8&value=200&category=Music">$200</a></td>
				<td id="9"><a href="PickQuestion?qNo=9&value=200&category=Movies">$200</a></td>
			</tr>
			<tr class="gameboardValues">
				<td id="10"><a href="PickQuestion?qNo=10&value=300&category=LooneyToons">$300</a></td>
				<td id="11"><a href="PickQuestion?qNo=11&value=300&category=NBA">$300</a></td>
				<td id="12"><a href="PickQuestion?qNo=12&value=300&category=Canada">$300</a></td>
				<td id="13"><a href="PickQuestion?qNo=13&value=300&category=Music">$300</a></td>
				<td id="14"><a href="PickQuestion?qNo=14&value=300&category=Movies">$300</a></td>
			</tr>
			<tr class="gameboardValues">
				<td id="15"><a href="PickQuestion?qNo=15&value=400&category=LooneyToons">$400</a></td>
				<td id="16"><a href="PickQuestion?qNo=16&value=400&category=NBA">$400</a></td>
				<td id="17"><a href="PickQuestion?qNo=17&value=400&category=Canada">$400</a></td>
				<td id="18"><a href="PickQuestion?qNo=18&value=400&category=Music">$400</a></td>
				<td id="19"><a href="PickQuestion?qNo=19&value=400&category=Movies">$400</a></td>
			</tr>
			<tr class="gameboardValues">
				<td id="20"><a href="PickQuestion?qNo=20&value=500&category=LooneyToons">$500</a></td>
				<td id="21"><a href="PickQuestion?qNo=21&value=500&category=NBA">$500</a></td>
				<td id="22"><a href="PickQuestion?qNo=22&value=500&category=Canada">$500</a></td>
				<td id="23"><a href="PickQuestion?qNo=23&value=500&category=Music">$500</a></td>
				<td id="24"><a href="PickQuestion?qNo=24&value=500&category=Movies">$500</a></td>
			</tr>
			<tr class="gameboardHeadings">
				<td colspan="2"><%=p1.getName()%></td>
				<td colspan="3">$<%=p1.getScore() %></td>
			</tr>
			<tr class="bigbutton">
				<td colspan="5"><form action="LoginPage.html"><input type="submit" value="New Game"></form></td>
			</tr>
		</table>
	</div>
	<script>
		<%
		for (int i=0; i<selected.size(); i++) {
			out.print("document.getElementById(\"" + selected.get(i) + "\").innerHTML=\"\";");
		}
		%>
	</script>
</body>
</html>