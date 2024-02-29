package org.comstudy.myweb.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
   
   // JdbcUtil.getConnection()
   public static Connection getConnection() {
      // 먼저 프로젝트에 라이브러리가 준비되어야 한다.
      // /WEB-INF/lib에 .jar 파일을 복사한다. -> 
      
      try {
         // JDBC 드라이버 찾기
         Class.forName("org.h2.Driver");
         // 드라이버를 이용한 DB접속
         String url = "jdbc:h2:tcp://localhost/~/test";
         String user = "sa";
         String password = "";
         Connection conn = DriverManager.getConnection(url, user, password);
         return conn;
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 검색 실패!");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("접속 실패!");
         e.printStackTrace();
      }
      return null;
   }

   public static void close(Connection conn, Statement stmt, ResultSet rs) {
      try {
         if(rs != null) {rs.close();}
         if(stmt != null) {stmt.close();}
         if(conn != null) {conn.close();}
      } catch (SQLException e) {}
   }
}