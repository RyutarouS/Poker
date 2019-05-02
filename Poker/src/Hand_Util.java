import java.util.*;

public class Hand_Util {
    static Map<String,String> marks = new HashMap<>(){
        {
            put("s","spade  ");
            put("c","club   ");
            put("h","heart  ");
            put("d","diamond");
        }
    };

    public static void show_hand(List<String> cards){
        for(int i = 0; i < cards.size(); i++){
            String[] card = cards.get(i).split(",");
            System.out.println((i+1) + ": "
                    + marks.get(card[0])
                    + " " +card[1]);
        }
    }








}
