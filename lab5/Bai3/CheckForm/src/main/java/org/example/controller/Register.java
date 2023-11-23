package org.example.controller;

import org.example.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {
    private UserService service = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        String path;
        if(service.register(username, pass)) {
            request.setAttribute("registerSuccess", "Register success, please login !");
            path = "/login.jsp";
        }else {
            request.setAttribute("registerError", "Username was exists, please again !");
            path = "/register.jsp";
        }
        request.getRequestDispatcher(path).forward(request,response);
    }
}
