import java.util.Scanner;

public class GuessGame {
    public static void GuessingGame(int difficulty) {
        Scanner name = new.Scanner(System.in);
        String username = name.nextLine();
        System.out.print("Type 1 for numbers 1-10\n" +
                         "Type 2 for numbers 1-100\n" +
                         "Type 3 for numbers 1-1000\n" +
                         "Type 4 for numbers 1-10000\n");
        Scanner chose = new Scanner(System.in);
        int chosen = chose.nextInt();
        if(chosen == 1){
            double random = Math.random()
            if(chosen == 2){
                if(chosen == 3) {
                    if(chosen == 4){
                    } else {
                        System.out.print("Choose the difficulty from 1-4.");
                    }
                }
            }
        }

    }
}
