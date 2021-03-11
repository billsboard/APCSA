package assignments.casestudy;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{

    /* Answer to questions:
    * Q1: The program will detect the keyword and enter a branch of the if ladder it was not supposed to.
    * It will select the wrong response and return a non-fitting sentence
    * */

    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";

        // Here we add more responses. The keywords we pick are: "no", "father" and "mother"

        if(statement.isEmpty() || statement.trim().isEmpty()){
            response = "Say something, please.";
        }
        else if (statement.indexOf("no") >= 0)
        {
            response = "No means yes!";
        }
        else if(statement.contains("Lu")){
            response = "You      don't\nmatter   give up";
        }
        else if(statement.contains("father")){
            response = "You have one of those? Mine went to get milk a few years back.";
        }
        else if(statement.contains("mother")){
            response = "Are you a man of woman born?";
        }
        else if (
                statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}
