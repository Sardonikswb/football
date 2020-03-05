package by.khodus.Servlets;

import by.khodus.Dao.PlayerDao;
import by.khodus.Entity.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/playerslist")
public class PlayersListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String club = req.getParameter("club");
        PlayerDao playerDao = new PlayerDao();
        List<Player> playerList = playerDao.searchPlayersByClub(club);
        req.setAttribute("players", playerList);
        req.getRequestDispatcher("jsp/playerslist.jsp").forward(req, resp);
    }
}
