<%@page import="dao.NhanvienDAO"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.7.1/modernizr.min.js"></script>
<script>
yepnope({
  test : (!Modernizr.input.list || (parseInt($.browser.version) > 400)),
  yep : [
      'https://raw2.github.com/CSS-Tricks/Relevant-Dropdowns/master/js/jquery.relevant-dropdown.js',
      'https://raw2.github.com/CSS-Tricks/Relevant-Dropdowns/master/js/load-fallbacks.js'
  ]
});
</script>
</head>
<body>
<form action="XuLyLoc" method="post">
	<input type="text" list="dschuyenMonNhanVien" name="chuyenMon" />
	<button class="btn btn-primary" type="submit">tìm theo chuyên môn</button>
</form>
	<%Set<String> dschuyenMonNhanVien = new NhanvienDAO().getDanhSachTheochuyenMon();%>
	<datalist id="dschuyenMonNhanVien">
	<%for(String a:dschuyenMonNhanVien) {%>
		<option value="<%=a%>"><%=a %></option>
		<%} %>
	</datalist>
</body>
</html>
