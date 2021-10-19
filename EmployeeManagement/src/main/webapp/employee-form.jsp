<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>Employee Management Application</title>
</head>
<body>
 <center>
  <h1>Employee Management</h1>
        <h2>
         <a href="new">Add New Employee</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">List All Employees</a>
         
        </h2>
 </center>
    <div align="center">
  <c:if test="${employee != null}">
   <form action="update" method="post">
        </c:if>
        <c:if test="${employee == null}">
   <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
             <h2>
              <c:if test="${employee != null}">
               Edit Employee
              </c:if>
              <c:if test="${employee == null}">
               Add New Employee
              </c:if>
             </h2>
            </caption>
          <c:if test="${employee != null}">
           <input type="hidden" name="id" value="<c:out value='${employee.id}' />" />
          </c:if>            
            <tr>
                <th>Employee Name: </th>
                <td>
                 <input type="text" name="name" size="45"
                   value="<c:out value='${employee.name}' />"
                  />
                </td>
            </tr>
            <tr>
                <th>Date of Birth: </th>
                <td>
                 <input  type="date" class="datepicker" name="dob"  size="45"
                   value="<c:out value='${employee.dob}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Address: </th>
                <td>
                 <input type="text" name="address" size="45"
                   value="<c:out value='${employee.address}' />"
                 />
                </td>
            </tr>
            <tr>
                <th> Salary: </th>
                <td>
                 <input type="text" name="salary" size="45"
                   value="<c:out value='${employee.salary}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Designation: </th>
                <td>
                 <input type="text" name="designation" size="45"
                   value="<c:out value='${employee.designation}' />"
                 />
                </td>
            </tr>
            <tr>
             <td colspan="2" align="center">
              <input type="submit" value="Save" />
             </td>
            </tr>
        </table>
        </form>
    </div> 
</body>
</html>