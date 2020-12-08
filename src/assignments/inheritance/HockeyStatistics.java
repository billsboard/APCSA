package assignments.inheritance;

public class HockeyStatistics extends SportsStatisitcs {
    /* Override for pointsScored() was not necessary. The description for pointsScored() said to total up
    major and minor. This means that a major point is worth the same as a minor point - One point. Therefore we
    don't even have to override anything, the superclass suffices.
     */

    double pointsPerGame(){
        return getGamesPlayed() == 0 ? 0 : (double) pointsScored() / getGamesPlayed();
        // We use a check to see if any of the games have actually been played. If it is zero, we say
        // that this person has scored zero points
    }
}
