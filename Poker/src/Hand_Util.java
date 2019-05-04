import java.util.*;

public class Hand_Util {
    static Map<String,String> mark = new HashMap<>(){
        {
            put("s"," spade ");
            put("c"," club  ");
            put("h"," heart ");
            put("d","diamond");
        }
    };

    static Map<Integer,String> number = new HashMap<>(){
        {
            put(1,"   A   ");
            put(2,"   2   ");
            put(3,"   3   ");
            put(4,"   4   ");
            put(5,"   5   ");
            put(6,"   6   ");
            put(7,"   7   ");
            put(8,"   8   ");
            put(9,"   9   ");
            put(10,"   10  ");
            put(11,"   J   ");
            put(12,"   Q   ");
            put(13,"   K   ");
        }
    };

    public static void show_hand(List<String> cards){

        System.out.println("\n");

        List<String> marks = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for(String card : cards) {
            String[] mark_and_num = card.split(",");
            marks.add(mark.get(mark_and_num[0]));
            nums.add(Integer.parseInt(mark_and_num[1]));
        }
        for(int i = 0; i < marks.size(); i++){
            System.out.print(marks.get(i) + " ");
        }
        System.out.println("");
        for(int i = 0; i < nums.size(); i++){
            System.out.print(number.get(nums.get(i))+ " ");

        }
        System.out.println("\n");
    }








}
