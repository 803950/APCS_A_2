import java.util.*;

/**
 * The framework for the Celebrity Game project
 * 
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
    private Celebrity gameCelebrity;
    private ArrayList<Celebrity> celebGameList = new ArrayList<Celebrity>();
    private CelebrityFrame gameWindow;
    /**
     * Builds the game and starts the GUI
     */
    public CelebrityGame()
    {
        gameCelebrity = new Celebrity("Justin Trudeau", "Prime minister of Canada", "Regular");
        celebGameList.add(gameCelebrity);
        gameWindow = new CelebrityFrame(this);
    }

    /**
     * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
     */
    public void prepareGame(){
        celebGameList = new ArrayList<Celebrity>();
        gameWindow.replaceScreen("START");
    }

    /**
     * Determines if the supplied guess is correct.
     * 
     * @param guess
     *            The supplied String
     * @return Whether it matches regardless of case or extraneous external
     *         spaces.
     */
    public boolean processGuess(String guess)
    {
        boolean win = false;
        if(guess.trim().toLowerCase().equals(gameCelebrity.getAnswer().trim().toLowerCase())){
            win = true;
            celebGameList.remove(0);
            if (celebGameList.size() > 0){
                gameCelebrity = celebGameList.get(0);
            }
        }
        return win;
    }

    /**
     * Asserts that the list is initialized and contains at least one Celebrity.
     * Sets the current celebrity as the first item in the list. Opens the game
     * play screen.
     */
    public void play()
    {
        if (celebGameList != null && celebGameList.size() > 0){
            this.gameCelebrity = celebGameList.get(0);
            gameWindow.replaceScreen("GAME");
        }
    }

    /**
     * Adds a Celebrity of specified type to the game list
     * 
     * @param name
     *            The name of the celebrity
     * @param guess
     *            The clue(s) for the celebrity
     * @param type
     *            What type of celebrity
     */
    public void addCelebrity(String name, String guess, String type)
    {
        Celebrity celeb = new Celebrity(name, guess, type);
        celebGameList.add(celeb);
        Celebrity currentCelebrity;
        if (type.equals("Literature")){
            currentCelebrity = new LiteratureCelebrity(name, guess, "Literature");
        }else if (type.equals("Celebrity")){
            currentCelebrity = new LiteratureCelebrity(name, guess);
        }
    }

    /**
     * Validates the name of the celebrity. It must have at least 4 characters.
     * @param name The name of the Celebrity
     * @return If the supplied Celebrity is valid
     */
    public boolean validateCelebrity(String name)
    {
        boolean validator = false;
        if(name.trim().toLowerCase().equals(gameCelebrity.getAnswer().trim().toLowerCase())){
            validator = true;
        }
        return validator;
    }

    /**
     * Checks that the supplied clue has at least 10 characters or is a series of clues
     * This method would be expanded based on your subclass of Celebrity.
     * @param clue The text of the clue(s)
     * @param type Supports a subclass of Celebrity 
     * @return If the clue is valid.
     */
    public boolean validateClue(String clue, String type)
    {
        boolean validator = false;
        if(clue.trim().toLowerCase().length() >= 10){
            validator = true;
            if (type.equalsIgnoreCase("Literature")){
                String[] temp = clue.split(",");
                if (temp.length > 1){
                    validator = true;
                }else{
                    validator = false;
                }
            }
        }
        return validator;
    }

    /**
     * Accessor method for the current size of the list of celebrities
     * 
     * @return Remaining number of celebrities
     */
    public int getCelebrityGameSize()
    {
        return celebGameList.size();
    }

    /**
     * Accessor method for the games clue to maintain low coupling between
     * classes
     * 
     * @return The String clue from the current celebrity.
     */
    public String sendClue()
    {
        return this.gameCelebrity.getClue();
    }

    /**
     * Accessor method for the games answer to maintain low coupling between
     * classes
     * 
     * @return The String answer from the current celebrity.
     */
    public String sendAnswer()
    {
        return null;
    }
}
