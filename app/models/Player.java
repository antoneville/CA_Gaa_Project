package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
public class Player extends Model {
    
    @Id
    private String pid;
    @Constraints.Required
    private int num;
    @Constraints.Required
    private String fname;
    @Constraints.Required
    private String lname;
    @Constraints.Required
    private String pos;
    @Constraints.Required
    private String club;
    @Constraints.Required
    private int age;
    @Constraints.Required
    private int apps;
    @Constraints.Required
    private int points;
    @Constraints.Required
    private int yellows;
    @Constraints.Required
    private int blacks;
    @Constraints.Required
    private int reds;
    @Constraints.Required
    private String tid;
    public Player() {
    }

    public Player(String pid, String fname, String lname, int age, String pos, int apps, String club, int points, int yellows, int blacks, int reds, String tid) {
        this.pid = pid;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.pos = pos;
        this.apps = apps;
        this.club = club;
        this.points = points;
        this.yellows = yellows;
        this.blacks = blacks;
        this.reds = reds;
	this.tid = tid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getApps() {
        return apps;
    }

    public void setApps(int apps) {
        this.apps = apps;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getYellows() {
        return yellows;
    }

    public void setYellows(int yellows) {
        this.yellows = yellows;
    }

    public int getBlacks() {
        return blacks;
    }

    public void setBlacks(int blacks) {
        this.blacks = blacks;
    }

    public int getReds() {
        return reds;
    }

    public void setReds(int reds) {
        this.reds = reds;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
    
    public static Finder<Long,Player> find = new Finder<Long,Player>(Player.class);

    public static List<Player> findAll() {
	return Player.find.all();
}   
}
