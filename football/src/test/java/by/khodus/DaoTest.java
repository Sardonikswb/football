package by.khodus;

import by.khodus.Config.HibernateSessionFactoryUtil;
import by.khodus.Dao.PlayerDao;
import by.khodus.Services.ClubsService;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

public class DaoTest {
    Session session;

    @Test
    public void checkConnection() {
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        assert (session != null);
        session.close();
    }

    @Test
    public void checkService() {
        ClubsService clubsService = new ClubsService();
        List clubs = clubsService.getClubList();
        assert (!clubs.isEmpty());
    }

    @Test
    public void searchClubsTest() {
        PlayerDao playerDao = new PlayerDao();
        List clubs = playerDao.searchClubs();
        assert (!clubs.isEmpty());
    }
}
