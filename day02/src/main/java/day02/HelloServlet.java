package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.jasper.runtime.HttpJspBase;

// web.xml에 매핑 하는 대신 어노테이션 사용.
// web.xml과 오노테이션을 함께 사용 가능하나 혼란스러울수 있으므로 한가지만 사용 권장.
@WebServlet("/toget")
public class HelloServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("Hello Servlet GET 방식 호출"); // 콘솔출력
      // 한글 인코딩 설정
      resp.setContentType("text/html; charset=UTF-8");
      
      // 화면 출력을 위해 PrintWriter 객체 사용.
      PrintWriter out = resp.getWriter();
      out.println("<html>");
      out.println("  <body>");
      out.println("    <h1>Hello 서블렛</h1>");
      out.println("  </body>");
      out.println("</html>");
      out.close();
      
      // 실제 Servlet파일은 아래 경로에 만들어 집니다. 
      // 워크스페이스의 .metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\day02\org\apache\jsp
   }
}