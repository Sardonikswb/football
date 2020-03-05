package by.khodus.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String log = req.getParameter("login");
        String password = req.getParameter("password");
        if (log.equals("admin") && password.equals("admin")) resp.sendRedirect(req.getContextPath() + "/clubs");
        else resp.sendRedirect(req.getContextPath() + "");
    }
}
