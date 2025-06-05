package sample.controller;

import sample.model.GreetModel;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class GreetServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String message = req.getParameter("message");

        GreetModel model = new GreetModel();
        String output = model.createMessage(username, message);

        req.setAttribute("method", "POSTメソッドで受信しました。");
        req.setAttribute("result", output);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/result.jsp");
        dispatcher.forward(req, res);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String message = req.getParameter("message");

        GreetModel model = new GreetModel();
        String output = model.createMessage(username, message);

        req.setAttribute("method", "GETメソッドで受信しました（URLにデータが含まれています）。");
        req.setAttribute("result", output);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/result.jsp");
        dispatcher.forward(req, res);
    }
}
