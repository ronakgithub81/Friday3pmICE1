package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 * Name: Shinnosuke Noda
 * Student ID: 991527227
 */
public class CardTrick {
    public static void main(String[] args)
    {
        Card card1 = new Card();
        
        card1.setValue(7);
        
        card1.setSuit("Spades");
        
        System.out.println("suit: " + card1.getSuit() + " value: " + card1.getValue());
    }
    
}
