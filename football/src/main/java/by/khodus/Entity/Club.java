package by.khodus.Entity;

public class Club {

    private String nameClub;
    private int costClub;
    private int forceClub;
    private int amountPlayers;

    public Club() {
    }

    public Club(String nameClub, int costClub, int forceClub, int amountPlayers) {
        this.nameClub = nameClub;
        this.costClub = costClub;
        this.forceClub = forceClub;
        this.amountPlayers = amountPlayers;
    }

    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }

    public int getCostClub() {
        return costClub;
    }

    public void setCostClub(int costClub) {
        this.costClub = costClub;
    }

    public int getForceClub() {
        return forceClub;
    }

    public void setForceClub(int forceClub) {
        this.forceClub = forceClub;
    }

    public int getAmountPlayers() {
        return amountPlayers;
    }

    public void setAmountPlayers(int amountPlayers) {
        this.amountPlayers = amountPlayers;
    }
}
