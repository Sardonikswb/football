package by.khodus.Services;

import by.khodus.Dao.PlayerDao;
import by.khodus.Entity.Club;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ClubsService {

    public ClubsService(){
    }


    public List<Club> getClubList() {
        Logger logger = Logger.getLogger(ClubsService.class);
        DOMConfigurator.configure("src/main/resources/log4j.xml");
        logger.warn("try to get club list");


        List<Club> clubList = new ArrayList<Club>();
        List clubs = new PlayerDao().searchClubs();

        for (int i = 0; i < clubs.size(); i++) {
            Club club = new Club();
            String nameClub = (String) clubs.get(i);
            int costClub = ((BigInteger) new PlayerDao().costClub(nameClub).get(0)).intValue();
            int forceClub = ((BigDecimal) new PlayerDao().forceClub(nameClub).get(0)).intValue();
            int amountClub = ((BigInteger) new PlayerDao().amountPlayers(nameClub).get(0)).intValue();

            club.setNameClub(nameClub);
            club.setCostClub(costClub);
            club.setForceClub(forceClub);
            club.setAmountPlayers(amountClub);
            clubList.add(club);
        }
        logger.warn("successfully completed");
        return clubList;
    }
  }
