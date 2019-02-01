
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @modifier Mohammad Shoeb
 * Student Number- 991549938
 */
public class CardTrick {
    public static void main(String[] args)
    {
        Card card1 = new Card();
        
        card1.setSuit("Diamond");
        card1.setValue(5);
        
        System.out.println("Suit: "+ card1.getSuit());
        System.out.println("Value: "+ card1.getValue());
       
    }
    
}
