
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Juntong Hou 991509952
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card newCard = new Card();
       newCard.setSuit("Hearts");
       newCard.setValue(1);
        //print the card suit and value
       System.out.println(newCard.getSuit+newCard.getValue);
    }
    
}
