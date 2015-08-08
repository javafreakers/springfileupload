<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload Form</title>
</head>
<body>

<form method="post" enctype="multipart/form-data" action="saveproduct.html" >
<table align="center">
<tr><td>
<label for="productNameStr">Product Name</label></td><td>
<input id="productNameStr" name="productNameStr" type="text"></td>
</tr>
<tr><td>
<label for="manufacturerStr">Manufacturer</label></td><td>
<input id="manufacturerStr" name="manufacturerStr" type="text"></td>
</tr><tr><td>
<label for="documentLinkStr" >Upload Picture</label></td><td>
<input type="file" name="file"  id="documentLinkStr" ></td>
</tr><tr><td>
<input type="submit" value="Add Product"></td>
</tr>
</table>
</form>

</body>
</html>