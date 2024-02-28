<%@page import="java.util.ArrayList"%>
<%@page import="org.comstudy.myweb.model.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
UserDTO userDTO = null;
if(request.getAttribute("userDTO") != null) {
   // setAttribute()는 모든 객체가 Object로 변한다.
   // 다시 끄집어 내서 사용 하려면 형변환이 필요하다.
   userDTO = (UserDTO)request.getAttribute("userDTO");
}

ArrayList<UserDTO> list = null;
if(request.getAttribute("list") != null) {
   list = (ArrayList<UserDTO>)request.getAttribute("list");
}
%>
<h1>홈 페이지</h1>
<h2>개발자 약력</h2>
<ul>
   <li>NO: <%=userDTO.getNo() %></li>
   <li>성명: <%=userDTO.getName() %></li>
   <li>직업: <%=userDTO.getJob() %></li>
</ul>

<form action="" method="POST">
   No: <input type="text" name="no" value="1005" /><br/>
   성명: <input type="text" name="name" value="비비" /><br/>
   직업: <input type="text" name="job" value="가수" /><br/>
   <input type="submit" value="저장" />
</form>

<table border="1" width="100%">
   <tr>
      <th>NO</th><th>성명</th><th>직업</th>
   </tr>
<%
   for(int i=0; i<list.size(); i++) {
      UserDTO user = list.get(i);
      out.println(user.toString());
   }
%>
</table>


</body>
</html>