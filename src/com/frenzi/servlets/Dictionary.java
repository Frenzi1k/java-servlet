package com.frenzi.servlets;

import com.frenzi.utils.Word;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Dictionary")
public class Dictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String word = request.getParameter("txt");
        request.setAttribute("word", word);
        request.setAttribute("translate", new Word().getWord(word));
        request.getRequestDispatcher("/dictionary.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/dictionary.jsp").forward(request,response);
    }

}
