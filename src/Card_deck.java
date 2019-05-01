
import java.util.*;

public class Card_deck {
    private List<String> deck = new ArrayList<>();
    private List<String> drop_cards = new ArrayList<>();
    private List<String> card_marks = new ArrayList<>(Arrays.asList("spade","club","heart","diamond"));

    /*
    * @Card_deck instance
    *
     */
    public Card_deck(int num){

        List<String> trump = new ArrayList();
        String[] marks_list = {"s","c","h","d"};
        for(int h = 0; h < num; h++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= 13; j++) {
                    trump.add(marks_list[i] + "," + j);
                }
            }
        }
        this.deck = trump;
    }

    public String distribute(){
        if(this.deck.size() == 0){
            deck.addAll(drop_cards);
        }

        Random rm = new Random();
        int rm_num = rm.nextInt(this.deck.size());

        String card = deck.get(rm_num);
        this.deck.remove(rm_num);

        return card;
    }

    public void addDropCards(String card){
        this.drop_cards.add(card);
    }

    public int countDeck(){
        return this.deck.size();
    }

    public void showCardLeft(){
        List<Integer> spade = new ArrayList<>();
        List<Integer> club = new ArrayList<>();
        List<Integer> heart = new ArrayList<>();
        List<Integer> diamond = new ArrayList<>();
        List<List> marks = new ArrayList<>(Arrays.asList(spade,club,heart,diamond));

        for(String card : this.deck){
            String[] card_splt = card.split(",");
            if(card_splt[0].equals("s")) spade.add(Integer.parseInt(card_splt[1]));
            if(card_splt[0].equals("c")) club.add(Integer.parseInt(card_splt[1]));
            if(card_splt[0].equals("h")) heart.add(Integer.parseInt(card_splt[1]));
            if(card_splt[0].equals("d")) diamond.add(Integer.parseInt(card_splt[1]));
        }
        for(int i = 0, j = 0; i < 4 ; i++,j++ ){
            System.out.println(this.card_marks.get(i));
            Collections.sort(marks.get(j));
            System.out.println(marks.get(j));
        }

    }

}
