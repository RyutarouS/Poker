import java.util.*;

public class Hand {
    private List<String> hand = new ArrayList<>();



    public Hand(Card_deck CD){
        for(int i = 0; i < 5; i++){
            this.hand.add(CD.distribute());
        }
    }

    /*
    *手札交換
    * @pram　交換する手札の番号リスト　＜LIST＞
     */
    public void Exchange(List<Integer> nums, Card_deck CD){
        Collections.sort(nums);
        System.out.println("Change cards");
        for (Integer num : nums){
            System.out.println("number:"+(num+1));
        }

        //リスト番号が変わらないように大きい順にリムーブする
        Collections.reverse(nums);
        for(Integer num : nums) {
            int rm_num = num;
            CD.addDropCards(hand.get(rm_num));
            this.hand.remove(rm_num);

        }

        //捨てた枚数カードを引く
        for(int i = 0; i < nums.size(); i++){
            this.hand.add(CD.distribute());
        }

        System.out.println("Done");
    }

    /*
    *手札を公開
    * Hand_utilクラスを参照
     */
    public void showHand(){
        Hand_Util.show_hand(this.hand);
    }

    public List<String> getHand() {
        return hand;
    }


}
