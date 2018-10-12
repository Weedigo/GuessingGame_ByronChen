import java.util.Scanner;

public class GuessGameAI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = (int) (Math.random() * 101);
        int oldguess = 0;
        System.out.print(guess);
        String you = input.nextLine();
        while(!you.equals("correct")){
            oldguess = guess;
            //
            if(you.equals("lower")){
                guess = (int) (Math.random() * 101);
                while(guess > oldguess){
                    guess = (int) (Math.random() * 101);
                }
                System.out.print(guess);
            }
            if(you.equals("higher")){
                guess = (int) (Math.random() * 101);
                while(guess < oldguess){
                    guess = (int) (Math.random() * 101);
                }
                System.out.print(guess);
            }
            //
            you = input.nextLine();
        }
        System.out.print("Correct, the answer is "+guess);
    }
}
