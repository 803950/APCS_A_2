
/**
 * Write a description of class LiteratureCelebrity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LiteratureCelebrity extends Celebrity
{
    //+++++Instance Variables +++++ 
    private String clue;
    private String answer;
    private String type;
    //+++++Instance Variables +++++ 

    // Constructor
    public LiteratureCelebrity(){
        answer = "";
        clue = "";
        type = "Literature";
    }
    
    public LiteratureCelebrity(String answer, String clue, String type)
    {
        this.answer = answer;
        this.clue = clue;
        this.type = type;
    }
    
    public LiteratureCelebrity(String answer, String clue)
    {
        this.answer = answer;
        this.clue = clue;
        this.type = type;
    }
    
    @Override
    public String toString()
    {
        return ("The literature celebrity who is " + clue + " is " + answer);
    }
}
