<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.nt.model.*,com.nt.controller.*"%>
 
 <jsp:useBean id="dto" class="com.nt.model.Student" scope="request"/>
 
 <jsp:setProperty property="*" name="dto"/>
 
<%
  	StudentRegistrationController src=new StudentRegistrationController();
 	src.submitData(dto);
%>
 admission number:<jsp:getProperty property="adno" name="dto"/><br>
 first name:<jsp:getProperty property="fname" name="dto"/><br>
 last name:<jsp:getProperty property="lname" name="dto"/><br>
 father name:<jsp:getProperty property="fathername" name="dto"/><br>
 mother name:<jsp:getProperty property="mothername" name="dto"/><br>
 class:<jsp:getProperty property="classname" name="dto"/><br>
 roll no:<jsp:getProperty property="rollno" name="dto"/><br>
 section:<jsp:getProperty property="section" name="dto"/><br>
 address:<jsp:getProperty property="address" name="dto"/><br>
 
 <a href="home.htm">Home</a>