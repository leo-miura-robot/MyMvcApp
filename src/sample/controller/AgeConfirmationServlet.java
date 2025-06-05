package sample.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AgeConfirmationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String ageParam = request.getParameter("age");
        String result;

        try {
            int age = Integer.parseInt(ageParam);
            result = (age >= 18) ? "成人" : "未成年";
        } catch (NumberFormatException e) {
            result = "年齢が不正です";
        }

        request.setAttribute("ageResult", result);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/ageConfResult.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            RequestDispatcher dispatcher = request.getRequestDispatcher("view/ageConf.jsp");
            dispatcher.forward(request, response);
    }

}