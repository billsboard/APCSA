package assignments.casestudy;

/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 * 		Uses advanced search for keywords
 *</li><li>
 * 		Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */
public class Magpie4
{

    /* Q1
    * This structure does not work well due to if ladder priority.
    * For example, "I want the thing you are holding" will respond with
    * "Why do you want the thing me?". However, inverting the if will cause
    * "I want to kill you" to be met with "Why do you want to kill you?". Both are
    * not ideal. More conditions and special cases would need to be coded
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

        // This method was copy-pasted from Magpie3 and then rewritten

        if(statement.isEmpty() || statement.trim().isEmpty()){
            response = "Say something, please.";
        }
        else if (findKeyword(statement, "no") >= 0)
        {
            response = "No means yes!";
        }
        else if(findKeyword(statement, "Lu") >= 0){
            response = "You      don't\nmatter   give up";
        }
        else if(findKeyword(statement, "father") >= 0){
            response = "You have one of those? Mine went to get milk a few years back.";
        }
        else if(findKeyword(statement, "mother") >= 0){
            response = "Are you a man of woman born?";
        }
        else if (
                findKeyword(statement, "brother") >= 0
                        || findKeyword(statement, "sister") >= 0)
        {
            response = "Tell me more about your family.";
        }

        else if(transformStatement("I", "you", statement)){
            response = transformIYouStatement(statement);
            // This must go here since "I want to kill you" should respond with "why do you want to kill me"
            // and not "why do you want to kill you"
        }
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }

        // This function MUST be below the I want to one to stop triggering on the other statement
        else if(findKeyword(statement, "I want") >= 0){
            response = transformIWantStatement(statement);
            // Check user-defined func;
        }
        else if(transformStatement("you", "me", statement)){
            response = transformYouMeStatement(statement);
        }
        else
            response = getRandomResponse();


        return response;
    }

    // My method
    boolean transformStatement(String a, String b, String statement){
        int psn = findKeyword(statement, a);
        int p2 = findKeyword(statement, b, psn + a.length());
        return psn >= 0 && p2 >= 0;
    }

    /**
     * Take a statement with "I want to <something>." and transform it into
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }



    /**
     * Take a statement with "you <something> me" and transform it into
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }

        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }

    // This function was added
    private String transformIWantStatement(String statement){
        statement = statement.trim();
        char lastChar = statement.charAt(statement
                .length() - 1);
        if (lastChar == '.')
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }

        int psn = findKeyword (statement, "I want", 0);
        String restOfStatement = statement.substring(psn + "I want".length()).trim();
        return "Why do you want " + restOfStatement + "?";
    }

    private String transformIYouStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        char lastChar = statement.charAt(statement
                .length() - 1);
        if (lastChar == '.')
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }

        int pI = findKeyword (statement, "I", 0);
        int pYou = findKeyword (statement, "you", pI + "I".length());

        String restOfStatement = statement.substring(pI + "I".length(), pYou).trim();
        return "Why do you " + restOfStatement + " me?";
    }





    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        //  Refinement--make sure the goal isn't part of a word
        while (psn >= 0)
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }

            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }

            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
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
