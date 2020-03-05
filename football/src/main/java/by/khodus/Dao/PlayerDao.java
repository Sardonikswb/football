package by.khodus.Dao;

import by.khodus.Config.HibernateSessionFactoryUtil;
import by.khodus.Entity.Player;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PlayerDao {

    public PlayerDao() {
    }

    public void addPlayer(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(player);
        tx1.commit();
        session.close();
    }

    public void updatePlayer(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(player);
        tx1.commit();
        session.close();
    }

    public void deletePlayer(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(player);
        tx1.commit();
        session.close();
    }

    public List searchClubs() {
        return (List<String>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createSQLQuery("SELECT DISTINCT club FROM players ORDER BY club").list();
    }

    public List costClub(String club) {
        return (List) HibernateSessionFactoryUtil.getSessionFactory().openSession().createSQLQuery("SELECT SUM(cost) FROM players WHERE club='" + club + "'").list();
    }

    public List forceClub(String club) {
        return (List) HibernateSessionFactoryUtil.getSessionFactory().openSession().createSQLQuery("SELECT AVG(rating) FROM players WHERE club='" + club + "'").list();
    }

    public List amountPlayers(String club) {
        return (List) HibernateSessionFactoryUtil.getSessionFactory().openSession().createSQLQuery("SELECT COUNT(name) FROM players WHERE club='" + club + "'").list();
    }

    public Player findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Player.class, id);

    }

    public List<Player> searchPlayersByClub(String club) {
        return (List<Player>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM Player WHERE club='" + club + "'").list();
    }


}
