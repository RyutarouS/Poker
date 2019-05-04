import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Main {
        public static void main(String[] args){

            Card_deck CD = new Card_deck(1);
            Hand M_H = new Hand(CD);
            Hand Y_H = new Hand(CD);


            System.out.println("Deck : " + CD.countDeck());
            System.out.println("\n\n\nmy cards");
            M_H.showHand();
            M_H.Exchange(Game.Exchange(),CD);
            M_H.showHand();

            System.out.println("\n\n\nopponent cards");
            Y_H.showHand();
            Y_H.Exchange(Game.Exchange(),CD);
            Y_H.showHand();


            M_H.showHand();
            Y_H.showHand();

            System.out.println(CD.countDeck());



        }
    }


