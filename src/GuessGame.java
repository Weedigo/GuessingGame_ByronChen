import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        //GET USERNAME
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        //MODE SELECTOR AND NUMBER GENERATOR
        System.out.print("Type 1 for numbers 1-10\n" +
                         "Type 2 for numbers 1-100\n" +
                         "Type 3 for numbers 1-1000\n" +
                         "Type 4 for numbers 1-10000\n");
        int chosen = input.nextInt();;
        int random = 0;
        if(chosen <= 4) {
            if (chosen == 1) {
                random = (int) (Math.random() * 11);
                if (chosen == 2) {
                    random = (int) (Math.random() * 101);
                    if (chosen == 3) {
                        random = (int) (Math.random() * 101);
                        if (chosen == 4) {
                            random = (int) (Math.random() * 10001);
                        }
                    }
                }
            }
        }
        System.out.print("Guess Number");
        int gass = input.nextInt();
        int tries = 0;
        while (gass != random){
            System.out.print("Guess again.");
            tries++;
        }
        if (gass == random){
            System.out.print("Correct, it took " + tries + username);
        }
    }
}
