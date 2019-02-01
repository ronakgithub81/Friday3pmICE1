
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak @modifier Essa Tahir 991524953
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card myCard = new Card();
        myCard.setSuit("Diamond");
        myCard.setValue(2);
        System.out.println(myCard.getSuit());
        System.out.println(myCard.getValue());
    }
    
}
