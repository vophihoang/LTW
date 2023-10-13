package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/check")
public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password");

        if(username.length() < 5)
            request.setAttribute("errorUsername", "Username must be least 5 character");
        if(password.isEmpty())
            request.setAttribute("errorPass", "Password is required");
        if(username.equals("abcdef") && password.equals("a"))
            System.out.println("login success");
        else
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}