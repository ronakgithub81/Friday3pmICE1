
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 * Student number: 991533228
 * @author Berat Sen
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
     
        Card cardObject = new Card();
        cardObject.setSuit("Hearts");
        cardObject.setValue(5);
        
        System.out.println(cardObject.getValue() + " of " + cardObject.getSuit());
        
        Card card2 = new Card();
        card2.setSuit("Diamonds");
        card2.setValue(10);
        
        System.out.println(card2.getValue() + " of " + card2.getSuit() );
    }
    
}
