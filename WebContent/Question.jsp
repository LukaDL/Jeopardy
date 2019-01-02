<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="game.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">\
<link rel="stylesheet" href="styles/main.css" type="text/css">
<title>Question</title>
</head>
<body>
	<%
	int value = (int)session.getAttribute("value");
	int qNo = (int)session.getAttribute("qNo");
	
	// Changing value to wager if it's a daily double
	boolean isDailyDouble = (boolean)session.getAttribute("dailydouble");
	if (isDailyDouble) {
		value = Integer.parseInt(request.getParameter("wager"));
		session.setAttribute("dailydouble", false);
	}
	
	// Getting access to all questions and their attributes.
	LoadQuestions lQ = new LoadQuestions();
	Question[] q = lQ.load();
		
	%>
	<div class="question">
		<%=q[qNo].getQuestion()%><br>
		<a href="AnswerSelect?userAnswer=<%=q[qNo].getAns1()%>&value=<%=value%>&qNo=<%=qNo%>"><%=q[qNo].getAns1()%><br></a>
		<a href="AnswerSelect?userAnswer=<%=q[qNo].getAns2()%>&value=<%=value%>&qNo=<%=qNo%>"><%=q[qNo].getAns2()%><br></a>
		<a href="AnswerSelect?userAnswer=<%=q[qNo].getAns3()%>&value=<%=value%>&qNo=<%=qNo%>"><%=q[qNo].getAns3()%><br></a>
		<a href="AnswerSelect?userAnswer=<%=q[qNo].getAns4()%>&value=<%=value%>&qNo=<%=qNo%>"><%=q[qNo].getAns4()%><br></a>
		<a href="AnswerSelect?userAnswer=skip&value=<%=value%>&qNo=<%=qNo%>">SKIP</a>
		
	</div>
</body>
</html>