<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="game.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styles/main.css" type="text/css">
<title>Daily Double</title>
</head>
<body>
	<%
		session.setAttribute("dailydouble", true);
		Player player = (Player)session.getAttribute("player");
		int score = player.getScore();
		int maxWager = 1000;
		if (score > maxWager) {
			maxWager = score;
		}
	%>
	<audio autoplay><source src="audio/dailydouble.mp3" type="audio/mp3"></audio>
	<div class="question">
		<h3>Daily Double</h3>
		<h3>Enter your wager</h3>
		<table>
			<form action="Question.jsp">
				<tr>
					<td class="enterWager">
						<input type="number" name="wager" min="5" max="<%=maxWager%>" required>
					</td>
				</tr>
				<tr class="bigbutton">
					<td>
						<input type="submit" value="Wager">
					</td>
				</tr>
			</form>
		</table>
	</div>
</body>
</html>