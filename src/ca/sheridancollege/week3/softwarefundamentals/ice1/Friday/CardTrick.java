
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 * & James Burrows 991541595
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card c1;
        c1 = new Card();
        c1.setSuit("Clubs");
        c1.setValue(6);
          System.out.println("the card c1 is the:"+c1.getSuit()+c1.getValue());
        
       Card c2= new Card();
       c2.setSuit("Clubs");
       c2.setValue(8);
        System.out.println("the card c2 is the:"+c1.getSuit()+c2.getValue());
    }
    
}
