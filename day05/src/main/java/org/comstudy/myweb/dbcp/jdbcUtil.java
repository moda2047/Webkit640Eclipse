package org.comstudy.myweb.dbcp;

public class jdbcUtil {
   
   public static void main(String[] args) {
      // 먼저 프로젝트에 라이브러리가 준비되어야 한다.
      // /WEB-INF/lib에 .jar 파일을 복사한다. -> 
      
      // JDBC 드라이버 찾기
      try {
         Class.forName("org.h2.Driver");
         System.out.println("드라이버 검색 성공!");
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 검색 실패!");
         e.printStackTrace();
      }
   }
}