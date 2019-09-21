package com.xworkz.basic.component;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SpringMVC extends HttpServlet {

	public SpringMVC() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked do-Post from SpringMVC");
		String msg = req.getParameter("message");
		System.out.println("Message From Client :  " + msg);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(msg);
	}
}
