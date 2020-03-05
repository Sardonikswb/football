package by.khodus.Servlets;

import by.khodus.Dao.PlayerDao;
import by.khodus.Entity.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    Player player;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PlayerDao playerDao = new PlayerDao();
        player = playerDao.findById(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("player", player);
        req.getRequestDispatcher("/jsp/delete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PlayerDao playerDao = new PlayerDao();
        playerDao.deletePlayer(player);
        resp.sendRedirect(req.getContextPath() + "/clubs");
    }
}
