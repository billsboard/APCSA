package assignments.inheritance;

public class GoalieHockeyStatistics extends HockeyStatistics{
    /* Since goalies do not have major or minor points, we use major as the goals scored against
    and minor as total shots.
     */

    @Override
    public int pointsScored(){
        /* Points scored makes no sense for goalies - goalies don't score goals
        This will throw an exception if called, since this function does not apply
         */
        throw new UnsupportedOperationException("Cannot call pointsScored() on GoalieHockeyStatistics");
    }

    void shot(){
        minor++; // This method adds one shot to the player
    }

    void shot(int shots){
        minor += shots; // This is for setting the number of shots;
    }

    int getShots(){
        return getMinor(); // getShots and getMinor do the same thing, but getShots seems more user friendly and understandable
    }

    int getGoalsAllowed(){
        return getMajor(); // This method is the same as calling getMajor, just the name is more true to what is actually does
    }

    double goalsAllowedPerGame(){
        return getGamesPlayed() == 0 ? 0 : (double) getMajor() / getGamesPlayed();
        // Zero check to avoid ArithmeticException. Base case when gamesPlayed = 0 will be 0;
    }

    double savesPerGame(){
        return getGamesPlayed() == 0 ? 0 : (double) (getMinor() - getMajor()) / getGamesPlayed();
        // Zero check to avoid ArithmeticException. Base case when gamesPlayed = 0 will be 0;
    }
}
