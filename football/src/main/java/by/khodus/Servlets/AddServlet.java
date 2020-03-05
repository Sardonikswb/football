package by.khodus.Servlets;

import by.khodus.Dao.PlayerDao;
import by.khodus.Entity.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int rating = Integer.parseInt(req.getParameter("rating"));
        String position = req.getParameter("position");
        int cost = Integer.parseInt(req.getParameter("cost"));
        String club = req.getParameter("club");
        Player player = new Player(name, rating, position, cost, club);
        new PlayerDao().addPlayer(player);

        resp.sendRedirect(req.getContextPath() + "/add");
    }
}
