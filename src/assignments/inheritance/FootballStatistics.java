package assignments.inheritance;

public class FootballStatistics extends SportsStatisitcs {
    @Override
    public int pointsScored() {
        return major * 7 + minor * 3;
    }

    double pointsPerGame(){
        return getGamesPlayed() == 0 ? 0 : (double) pointsScored() / getGamesPlayed();
        // We use a check to see if any of the games have actually been played. If it is zero, we say
        // that this person has scored zero points
    }
}
