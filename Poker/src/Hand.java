import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
    private List<String> hand = new ArrayList<>();



    public Hand(Card_deck CD){
        for(int i = 0; i < 5; i++){
            this.hand.add(CD.distribute());
        }
    }

    public void Exchange(List<Integer> nums, Card_deck CD){
        for(Integer num : nums) {
            System.out.println("number:"+num);
            int rm_num = num;
            CD.addDropCards(hand.get(rm_num));
            this.hand.remove(rm_num);

        }

        for(int i = 0; i < nums.size(); i++){
            this.hand.add(CD.distribute());
        }
    }

    public void showHand(){
        Hand_Util.show_hand(this.hand);
    }

    public List<String> getHand() {
        return hand;
    }
}
