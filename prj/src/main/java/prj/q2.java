package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/aaa")
public class q2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=utf-8");		//서버가 보내는 데이터의 형식 html 형식임을 알려줌
		response.setCharacterEncoding("utf-8"); 	//서버가 보내는것이 utf-8형식으로 보낸다는 의미
    	PrintWriter out = response.getWriter();
    	
    	 
    	out.println("<html>");
    	out.println("<body>");
    	out.println("<h2>구구단 3단</h2>");
        for (int i = 1; i <= 9; i++) {
            int result = 3 * i;
            out.println("3 x " + i + " = " + result);
            out.println("<br>");
        }
        
        out.println("</body>");
        out.println("</html>");
        		
    }
}
