
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card c1 = new Card();
       
       c1.setSuit("Hearts");
       c1.setValue(12);
       
       System.out.println(c1.getSuit());
        System.out.println(c1.getValue());
    }
    
}
