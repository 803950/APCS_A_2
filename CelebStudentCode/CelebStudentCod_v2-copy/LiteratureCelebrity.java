
/**
 * Write a description of class LiteratureCelebrity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LiteratureCelebrity extends Celebrity
{
    private String book;
    public LiteratureCelebrity(String NAME, String CLUE, String book)
    {
        super(NAME, CLUE); // CHECK CARTOON CELEBRITY EXAMPLE
        this.book = book;
    }

    public String getClue(Celebrity celeb){
        if(Math.random()<0.2)
            return "Wrote " + book;
        return super.getClue();
    }
}
