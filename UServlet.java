package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import database.UserDB;

/**
 * Servlet implementation class UServlet
 */
@WebServlet("/register")
public class UServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @SuppressWarnings("unused")
	private UserDB dao;
	public void init() {
		dao = new UserDB();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
