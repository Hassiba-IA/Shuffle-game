import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleGameMain {
    public static void main(String[] args) {
        String replay, pick,play;
        int index;
        System.out.println("----------------------------------welcome to shuffle game-------------------------------");
        System.out.println("guess where the 0 is?");
        Scanner sc= new Scanner(System.in);
        Integer[] myArray = {1, 1, 0};
        List<Integer> intList = Arrays.asList(myArray);

        do{
            System.out.println("are you ready to play? y/n");
            play = sc.nextLine();

            while(!(play.equalsIgnoreCase("y")) && !(play.equalsIgnoreCase("n"))) {
                System.out.println("Bad value please enter y or n");
                play = sc.nextLine();
            }

            if( play.equalsIgnoreCase("y")){
                Collections.shuffle(intList);

            }else{
                break;
            }
            System.out.println("pick 1, 2, or 3!");
            pick = sc.nextLine();
            while (!(pick.equalsIgnoreCase("1")) && !(pick.equalsIgnoreCase("2"))&& !(pick.equalsIgnoreCase("3"))){
                System.out.println("invalid entry, please enter 1 or 2 or 3");
                pick = sc.nextLine();
            }
            index =Integer.parseInt(pick) - 1;
            if (myArray[index] == 0) {
                System.out.println("good guess!");

            } else {
                System.out.println("sorry!!! wrong guess");
            }
            System.out.println("do you want to try again? y/n");
            replay=sc.nextLine();
            while (!(replay.equalsIgnoreCase("y")) && !(replay.equalsIgnoreCase("n"))){
                System.out.println("invalid entry, please enter y or n");
                replay = sc.nextLine();
            }
       }while(replay.equalsIgnoreCase("y"));
            System.out.println("see you next time!");
    }
}
