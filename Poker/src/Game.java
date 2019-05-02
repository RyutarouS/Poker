import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static List<Integer> Exchange() {
        List<Integer> change_nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Which cards will you change ? If you end, type \"end\" :");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                return change_nums;
            }

            try {
                Integer num = Integer.parseInt(input);
                if (change_nums.contains(num-1)) {
                    System.out.println("You've already chosen this card");
                    System.out.print("else : ");
                    continue;
                }
                if(num > 5){
                    System.out.println("You can input the number no more than 5");
                }
                change_nums.add(num -1);
                System.out.print("else? :");
            }catch (NumberFormatException e){
                System.out.println("You can input the NUMBER or \"end\"");
                System.out.print("else : ");
                continue;
            }


        }


    }
}
