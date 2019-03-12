<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
 
<body>
 <h3 align="center">CategoryPage</h3>
 <br/>
 <div style="text-align:center" class="container">
 

     <form action="<c:url value="/addCategory"/>" method="post">
 <table align="center">
     <tr>
     <td>CategoryName</td>
     <td><input type="text" id="categoryName" name="categoryName"/></td>
      </tr>
      <tr>
      <td> CategoryDescription</td>
      <td><input type="text" id="categoryDescription" name="categoryDescription"/></td>
      </tr>
     <tr>
     <td colspan="2"><input type="submit" class="btn btn-warning" value="Add Category"/></td>
   </tr>
</table>
   </form>
   
<table class="table table-bordered" style="width:100%">
<tr bgcolor="blue">
   <th>CategoryId</th>
  <th>CategoryName</th>
  <th>CategoryDescription</th>
  <th>Operation</th>
</tr>

<c:forEach items="${datalist}" var="category">
<tr>
   <td>${category.categoryId}</td>
   <td>${category.categoryName}</td>
   <td>${category.categorydescription}</td>
  <td> 
     <a class="btn btn-success" href="<c:url value="/editCategory/${category.categoryId}"/>">Edit</a>
     <a class="btn btn-danger" href="<c:url value="/deleteCategory/${category.categoryId}"/>">Delete</a>
   </td>    
 </tr>
</c:forEach>

</table>
</div>
</body>
