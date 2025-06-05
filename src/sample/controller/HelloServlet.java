//  src/sample/controller/HelloServlet.java
package sample.controller;

// import sample.model.MessageModel;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // MessageModel model = new MessageModel();
        String message = "Hello Java by Tomcat! (from Model)";

        req.setAttribute("message", message);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/hello.jsp");
        dispatcher.forward(req, res);
    }
}