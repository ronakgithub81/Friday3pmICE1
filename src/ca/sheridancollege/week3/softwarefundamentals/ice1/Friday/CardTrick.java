package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Rishabh
 * 991532818
 */
public class CardTrick {

    public static void main(String[] args) {
        Card C = new Card();
        C.setSuit("clubs");
        C.setValue(2);
        System.out.println(C.getSuit());
        System.out.println(C.getValue());
    }

}
