<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>  
  
        <h1>Edit Employee</h1>  
       <form:form method="POST" action="/HelloWeb/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="unitId" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Experience :</td>    
          <td><form:input path="exp" /></td>  
         </tr>   
         <tr>    
          <td>Brave Burst Level :</td>    
          <td><form:input path="bblvl" /></td>  
         </tr>   
         <tr>    
          <td>Unit Type :</td>    
          <td><form:input path="type" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>