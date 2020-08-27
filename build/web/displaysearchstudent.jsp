<%-- 
    Document   : displaysearchstudent
    Created on : Aug 22, 2020, 3:49:44 PM
    Author     : W10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        h1{
                text-align: center;
                font-size: 40px;
                font-family: lucinda;
                position:relative;
                margin-top:60px;
                margin-bottom:30px;
            }
            .tab{
                
                font-size: 1.4rem;;
                font-family: lucinda;
                
                
            }    
        button{
	margin-top:20px;
        margin-bottom:20px;
	padding: 2px;
	font-family: sans-serif;
	font-weight: normal;
	font-size: 1rem;
	background-color: transparent;
	border: 2px solid green;
	color:green;
        border-radius:20px;

}
.but{
                font-size:1.5rem;
                
                text-align: center;
        }
    </style>
    <body>
        <h1>LBJ PROJECT :- Case Study 2</h1>
        <div class="tab">
            <center>
        <table border>
            <tr>
                <th colspan="3">
                    Here is the detail information
                </th>
                
            </tr>
            
            <tr>
                <td>
                    1
                </td>
                <td>
                    Student Id
                </td>
                <td>
                    <%=request.getAttribute("studentid")%>
                </td>
            </tr>
            
            <tr>
                <td>
                    2
                </td>
                <td>
                   Student Name
                </td>
                <td>
                    <%=request.getAttribute("studentname")%>
                </td>
            </tr>
            
            <tr>
                <td>
                    3
                </td>
                <td>
                    gender
                </td>
                <td>
                    <%=request.getAttribute("gender")%>
                </td>
            </tr>
            <tr>
                <td>
                    4
                </td>
                <td>
                    birthday
                </td>
                <td>
                    <%=request.getAttribute("birthday")%>
                </td>
            </tr>
            <tr>
                <td>
                    5
                </td>
                <td>
                    city
                </td>
                <td>
                    <%=request.getAttribute("city")%>
                </td>
            </tr>
            <tr>
                <td>
                    6
                </td>
                <td>
                    state
                </td>
                <td>
                    <%=request.getAttribute("state")%>
                </td>
            </tr>
            <tr>
                <td>
                    7
                </td>
                <td>
                    email
                </td>
                <td>
                    <%=request.getAttribute("email")%>
                </td>
            </tr>
            <tr>
                <td>
                    8
                </td>
                <td>
                    qualification
                </td>
                <td>
                    <%=request.getAttribute("qualification")%>
                </td>
            </tr>
            <tr>
                <td>
                    9
                </td>
                <td>
                    stream
                </td>
                <td>
                    <%=request.getAttribute("stream")%>
                </td>
            </tr>
      </table>
                </center>
    </div>
                
       <div class="but">
            <a href="index.html">
                <button><h3> Click to go Back</h3></button>
            </a>
        </div>         
    </body>
</html>
