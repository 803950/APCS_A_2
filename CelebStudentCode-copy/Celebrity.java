/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */


public class Celebrity{
    
    private String clue;
    private String answer;
    private String type;
    
      /**
     * Creates a Celebrity instance without parameters
     *
     */
    public Celebrity()
    {
        answer = "";
        clue = "";
        type = "";
    }
    
    /**
     * Creates a Celebrity instance with the supplied answer and clue
     * @param answer
     * @param clue
     */
    public Celebrity(String answer, String clue, String type)
    {
        this.answer = answer;
        this.clue = clue;
        this.type = type;
    }

    /**
     * Supplies the clue for the celebrity
     * @return
     */
    public String getClue()
    {
        return clue;
    }

    /**
     * Supplies the answer for the celebrity.
     * @return
     */
    public String getAnswer()
    {
        return answer;
    }

    /**
     * Updates the clue to the provided String.
     * @param clue The new clue.
     */
    public void setClue(String clue)
    {
        this.clue = clue;
    }

    /**
     * Updates the answer to the provided String.
     * @param answer The new answer.
     */
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    /**
     * Provides a String representation of the Celebrity.
     */
    @Override
    public String toString()
    {
        return ("The answer to \"" + clue + "\" is " + answer);
    }

}
