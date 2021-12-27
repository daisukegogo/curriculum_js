import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SelectServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        // 問① select.htmlから渡された値(パラメータ)を受け取るために下記を修正しましょう。
        String value = request.getParameter("month");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 問② エビデンスと同じ表示になるように修正しましょう。
        out.println("今は"+ value + "月です。");
    }
}
