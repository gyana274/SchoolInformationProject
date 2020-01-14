<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.nt.model.*,com.nt.controller.*"%>
<jsp:useBean id="dto" class="com.nt.model.Faculty" scope="request"/>
 
 <jsp:setProperty property="*" name="dto"/>
 
<%
  	TeacherRegistration src=new TeacherRegistration();
 	src.addFaculty(dto);
%>
 Faculty id:<jsp:getProperty property="facultyid" name="dto"/><br>
 Faculty name:<jsp:getProperty property="facultyname" name="dto"/><br>
 Subject name:<jsp:getProperty property="subjectname" name="dto"/><br>
 
 <a href="home.htm">Home</a>