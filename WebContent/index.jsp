<%@page import="java.time.Period"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eduardo Castillo</title>
</head>
<body>

	<h1>Hola Mundo desde mi primer Servlet</h1>

	<%
		String nombre = "Eduardo Castillo Mendoza";

		LocalDate nacimiento = LocalDate.of(1990, 9, 10);
		LocalDate actual = LocalDate.now();
		Period tiempoVida = Period.between(nacimiento, actual);

		out.println("Hola: " + nombre + "  Han transcurrido: " + tiempoVida.getYears() + " años y "
				+ tiempoVida.getMonths() + " Meses y " + tiempoVida.getDays() + " dias, desde " + nacimiento
				+ " hasta " + actual);
	%>
	<br />
	<a href="holaMundo">Llamando a mi primer Servlet</a>

</body>
</html>