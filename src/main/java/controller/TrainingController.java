package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TrainingController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getRequestURI());
		String[] uris=request.getRequestURI().substring(1).split("/");
		System.out.println(uris.length);
		System.out.println("uris[0]:"+uris[0]);
		String context="/training/";
		String page="main.jsp";
		if(uris[0].equals("") || uris[0].equals("index")) {
		context="/training/";
		page="main.jsp";

		}else {
			context="/"+uris[0]+"/";
			if(uris[0].equals("hangboard")) {
				page="hangboard.jsp";
			}else if(uris[0].equals("kilterboard")) {
				page="kilterboard.jsp";
			}else if(uris[0].equals("moonboard")) {
				page="moonboard.jsp";
			}else if(uris[0].equals("climbinghold")) {
				page="climbinghold.jsp";
			}
		}
	}
}