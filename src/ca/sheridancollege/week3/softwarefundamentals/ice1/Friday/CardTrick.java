
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
       System.out.println(newCard.getSuit()+newCard.getValue());
       Card card2 = new Card();
       card2.setSuit("Spades");
       card2.setValue(2);
    }
    
}
