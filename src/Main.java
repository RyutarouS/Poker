import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

       Card_deck CD = new Card_deck(1);
       System.out.println(CD.countDeck());
       CD.showCardLeft();

       Hand M_H = new Hand(CD);
       M_H.showHand();
       M_H.Exchange(Game.Exchange(),CD);
       M_H.showHand();
       System.out.println(CD.countDeck());



    }
}
