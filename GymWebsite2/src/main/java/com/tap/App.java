package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class App
 */
@WebServlet("/App")
public class App extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		long phone = Long.parseLong(request.getParameter("phone"));
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		
		Gym g = new Gym(name, email, phone, age, gender);
		GymBo bo = new GymBo();
		
		int i = bo.save(g);
		PrintWriter out = response.getWriter();
		
		if(i==1) {
			response.sendRedirect("saved.html");;
		}
		else {
			response.sendRedirect("unsaved.html");;
		}
		
		
//		out.print(name+email+phone+age+gender);
//		System.out.println("ready");
	}

}
