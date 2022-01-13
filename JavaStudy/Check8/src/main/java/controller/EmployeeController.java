package controller;

import java.io.IOException;

import bean.EmployeeBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.EmployeeService;

//Controller:ユーザ要求を受取り、処理実行をModelに、結果表示をViewに依頼(全体の仲介役)
public class EmployeeController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// 問① index.htmlから送信されたIDとPassWordの値を取得できるように修正しましょう。
			//パラメータの取得
			String id = request.getParameter("id");
			String password = request.getParameter("pass");

			/*
			 * IDとPassWordと元に、社員情報を検索する関数の呼び出し、結果をJSPに渡す処理 ※
			 * EmployeeBeanとEmployeeServiceをimportするのを忘れないでください。
			 */
			
			// 問② EmployeeServiceクラスをインスタンス化する。
			EmployeeService eps = new EmployeeService();
			// ★問③ EmployeeBeanに、EmployeeServiceよりsearch関数を呼び出し、返り値を格納する。
			EmployeeBean EmployeeBean = new EmployeeBean();
			//searchメソッド の戻り値「employeeData (SQLの結果が格納されている変数)」をEmployeeBeanに格納。
			EmployeeBean = eps.search(id,password);
			// 問④ nullの部分に適切な引数をセットする。
			//リクエストスコープに格納("キー",値)
			request.setAttribute("EmployeeBean",EmployeeBean);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//検索結果をjspに渡す
			ServletContext context = this.getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		}
	}
}
