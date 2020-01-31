/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("Jack", "Hearts", 11);
        Card card2 = new Card("Two", "Clubs", 2);
        Card card3 = new Card("Ace", "Spades", 1);
        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());
    }
}
