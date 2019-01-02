<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="game.*" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styles/main.css" type="text/css">
<title>You Win!</title>
</head>
<body>
	<%
	Player player = (Player)session.getAttribute("player");
	String name = player.getName();
	int score = player.getScore();
	String winLose = "";
	
	if ((boolean)session.getAttribute("winner")) {
		out.print("<audio autoplay><source src=\"audio/winner.mp3\" type=\"audio/mp3\"></audio>");
		winLose = "Winner!";
	} else {
		out.print("<audio autoplay><source src=\"audio/loser.mp3\" type=\"audio/mp3\"></audio>");
		winLose = "Loser";
	}
	%>
	<div class="question">
		<table>
			<tr>
				<td><h3><%=name%> is a <%=winLose%></h3></td>
			</tr>
			<tr>
				<td><h3>Score: $<%=score%></h3></td>
			</tr>
			<tr class="bigbutton">
				<td><form action="LoginPage.html"><input type="submit" value="New Game"></form></td>
			</tr>
		</table>
	</div>
</body>
</html>