<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"

%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hopper's Receipt</title>
</head>
<body>
	<h1>Customer Name: <c:out value="${customerName}"></c:out></h1>
	
	<h2>Item Name: <c:out value="${itemName }"></c:out></h2>
	
	<h2>Item Price: $<c:out value="${itemPrice }"></c:out></h2>
	<h2>Item Description: <c:out value="${itemDescription }"></c:out></h2>
	<h2>Vendor Name: <c:out value="${vendorName }"></c:out></h2>
	
	
	<%-- <% for (int i = 0; i < 5; i++) { %>
		<h2> <%=i %> </h2>
	<% } %> --%>
	
	<%-- <h3> This time is: <%= new Date() %></h3>
	
	<h1>Two plus two is: </h1>
	<h2><c:out value="${2+2}"/></h2> --%>
	
	
	
</body>
</html>