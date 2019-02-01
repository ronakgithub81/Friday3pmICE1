
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Chungsup Lim 991515450
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card limCard = new Card();
        limCard.setValue(11);
        limCard.setSuit(Spades);
        System.out.println(limCard.getValue());
        System.out.println(limCard.getSuit());
    }
    
}
