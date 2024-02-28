# Webkit640Eclipse<br><br>

day04에는 MVC구조를 가지고 있다.<br>
jsp와 servlet을 이용한 공부이다.<br>
M->DTO 만든 것<br>
V->views파일에 있는 jsp파일들과 index.jsp파일이다.<br>
C->servlet으로 만든 컨트롤러이다.<br>

jsp와 servlet은 web.xml에서 서로 매핑과정을 통해 묶어준다.<br><br>

servlet에는 doGet과 doPost가 있는데, <br>
doPost는 jsp의 form에서 POST를 보내면 받는 것이다.<br>
data를 doPost에서 사용하기 위해서는 req를 통해 파라미터값을 가져온다.<br>

doGet은 페이지 이동 역할을 맡으며 setAttribute를 통해서 jsp파일에다가 data를 넘겨줄 수 있다.<br>
jsp파일에서는 getAttribute를 이용해서 data를 받으며 Object형태로 data가 오기 때문에 형변환을 무조건 해줘야한다.<br>
