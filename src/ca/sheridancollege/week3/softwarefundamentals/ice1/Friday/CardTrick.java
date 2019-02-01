
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 * Uddip Amin
 * 991518202
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card = new Card();
       Card card2 = new Card();
       
       card.setSuit("Hearts");
       card.setValue(3);
       
       
       System.out.println(card.getSuit() + " " + card.getValue());
    }
    
}
