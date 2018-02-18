package com.frenzi.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Index", urlPatterns = {""})
public class Index extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getRequestURI());
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println(("<html>" +
                "<head>" +
                "<title>Servlet Index</title>" +
                "</head>" +
                "<body bgcolor='#aaccff'>" +
                "<form>" +
                "<h1> Привет клиенту!!!</h1>" +
                "<form>" +
                "<input type=\"button\" value=\"Dictionary\" onclick=\"window.location.href='dictionary/'\" />" +
                "</form>"+
                "</form>" +
                "</body>" +
                "</html>"));
    }
}
