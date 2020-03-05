package by.khodus.Servlets;

import by.khodus.Dao.PlayerDao;
import by.khodus.Entity.Player;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    Player player;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PlayerDao playerDao = new PlayerDao();
        player = playerDao.findById(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("player", player);

        req.getRequestDispatcher("jsp//update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        int rating = Integer.parseInt(req.getParameter("rating"));
        String position = req.getParameter("position");
        int cost = Integer.parseInt(req.getParameter("cost"));
        String club = req.getParameter("club");

        PlayerDao playerDao = new PlayerDao();
        playerDao.updatePlayer(new Player(player.getId(), name, rating, position, cost, club));
        resp.sendRedirect(req.getContextPath() + "/clubs");
    }
}
