package com.servlet.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//프로젝트명 경로
		response.getWriter().println(request.getContextPath());
		
		//프로젝트명/파일경로
		response.getWriter().println(request.getRequestURI());

		//전체경로
		response.getWriter().println(request.getRequestURL());
		
		//파일명만
		response.getWriter().println(request.getServletPath());
		
		//서버나 로컬 웹애플리케이션 절대경로
		response.getWriter().println(request.getRealPath("/"));

		//getrealpath는 원래 webapp폴더까지
		response.getWriter().println(request.getSession().getServletContext().getRealPath("/"));
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
