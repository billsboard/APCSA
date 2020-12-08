package assignments.inheritance;

public class SportsStatisitcs {
    int major = 0, minor = 0, gamesPlayed = 0;

    public SportsStatisitcs(){}

    public SportsStatisitcs(int major, int minor) {
        this.major = major;
        this.minor = minor;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public int pointsScored(){
        return major + minor;
    }

    public int getGamesPlayed() {
        return gamesPlayed; // GamePlayed exists as a variable but is never actually updated. It will forever be zero
    }
}
