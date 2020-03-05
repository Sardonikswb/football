package by.khodus.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "players")
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_id")
    @SequenceGenerator(name = "gen_id", sequenceName = "players_id_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private int rating;

    @Column(name = "position")
    private String position;

    @Column(name = "cost")
    private int cost;

    @Column(name = "club")
    private String club;

    public Player(String name, int rating, String position, int cost, String club) {
        this.name = name;
        this.rating = rating;
        this.position = position;
        this.cost = cost;
        this.club = club;
    }

    public Player(int id, String name, int rating, String position, int cost, String club) {
        this.name = name;
        this.rating = rating;
        this.position = position;
        this.cost = cost;
        this.club = club;
        this.id = id;
    }

    public Player() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id &&
                rating == player.rating &&
                cost == player.cost &&
                Objects.equals(name, player.name) &&
                Objects.equals(position, player.position) &&
                Objects.equals(club, player.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rating, position, cost, club);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", position='" + position + '\'' +
                ", cost=" + cost +
                ", club='" + club + '\'' +
                '}';
    }
}
