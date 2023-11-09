package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    private UserService service = UserService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password");

        boolean isError = false;
        if(username.length() < 5) {
            isError = true;
            request.setAttribute("errorUsername", "Username must be least 5 character");
        }
        if(password.isEmpty()) {
            isError = true;
            request.setAttribute("errorPass", "Password is required");
        }
        if (isError)
            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        User user = service.login(username, password);
        if(user != null) {
            request.getSession().setAttribute("auth", user);
            response.sendRedirect("index.jsp");
        }
        else {
            request.setAttribute("wrongUser", "Username or Password is wrong");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }
}