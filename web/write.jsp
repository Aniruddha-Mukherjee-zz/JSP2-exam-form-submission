<%-- 
    Document   : write
    Created on : Apr 14, 2015, 12:55:16 AM
    Author     : ani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="sh" scope="page" class="pojo.student_handler" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
		String name=request.getParameter("Name"); 
                String roll_no=request.getParameter("classroll"); 
                 //int roll_no=Integer.parseInt(s);
             // if(roll_no <=0) throw new RuntimeException("Enter valid roll no");
                String reg_no=request.getParameter("regno") ;
                String email_id=request.getParameter("email_id");
                String payment_id=request.getParameter("payment_id");
                String subjects=request.getParameter("subjects");
                //student_handler sh=new student_handler ();
                String x=sh.insert(name, roll_no, reg_no, email_id, payment_id, subjects) ;
                //String x=sh.test();
              if(x.charAt(0)!='F')
                out.println("Your Exam Roll_no is: ");
                out.println(x);
		//out.println(name+roll_no+reg_no+email_id+payment_id+subjects);
		%> 
    </body>
</html>
