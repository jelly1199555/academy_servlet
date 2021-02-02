package com.kgit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hakjum
 */
@WebServlet("/Hakjum")
public class Hakjum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hakjum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    doPost(request, response); //post로 가랏
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */                                     //이게인자, 이름,점수받을때는 request.getparameter
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//여기서 kaja()메소드 호출및작성도가능
		
		//business logic
		//만일 business logic이 크면 service logic이 요구됨
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=EUC-KR");
		
		String irum = request.getParameter("irum");
		String jum1 = request.getParameter("jum");
		int jum = Integer.parseInt(jum1);
		
		/*MVC2방식*/
		String kaja = null;
		if(jum>=90) {
			kaja="A.jsp";
		}else if(jum>=80) {
			kaja="B.jsp";
		}else if(jum>=70) {
			kaja="C.jsp";
		}else {
			kaja="F.jsp";
		}
		
		RequestDispatcher rd1
		= request.getRequestDispatcher("./jspview/"+kaja);
		rd1.forward(request, response);
		/*이건 체인형태로 줄여서 쓰는 방식(위에서 rd1객체생략하면됨)
	request.getRequestDispatcher(...).forward(request, response);*/
		}

}
