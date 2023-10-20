package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/check")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String services = request.getParameter("services");
        String message = request.getParameter("message");

        boolean isError = false;
        if(name.isEmpty()) {
            request.setAttribute("nameError", "Vui long nhap ten cua ban!");
            isError = true;
        }
        if(email.isEmpty()) {
            request.setAttribute("emailError", "Vui long nhap email cua ban!");
            isError = true;
        }
        if(phoneNumber.isEmpty()) {
            request.setAttribute("phoneNumberError", "Vui long nhap SDT cua ban!");
            isError = true;
        }
        if(services.isEmpty()) {
            request.setAttribute("serviceError", "Vui long chon dich vu!");
            isError = true;
        }
        if(message.isEmpty()) {
            request.setAttribute("messageError", "Vui long nhap tin nhan!");
            isError = true;
        }
        if(isError)
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        else System.out.println("success");
    }
}