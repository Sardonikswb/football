package by.khodus.Servlets;

import by.khodus.Services.ClubsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/clubs")
public class ClubsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClubsService clubsService = new ClubsService();
        req.setAttribute("clubs", clubsService.getClubList());
        req.getRequestDispatcher("/jsp/clubs.jsp").forward(req, resp);
    }

}
