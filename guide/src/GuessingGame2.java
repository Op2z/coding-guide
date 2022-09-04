import java.util.Random;
import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args) {
        Random ran = new Random();
        int computerNumber = ran.nextInt(1000) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 - 1000: ");
        int counter = 0;
        while (true){
            int guess = sc.nextInt();
            if (guess > computerNumber){
                System.out.println("Too High");
            }
            else if (guess < computerNumber) {
                System.out.println("Too Low");
            }
            else {
                System.out.println("You guessed the number in " + counter + " tries.");
                int optimal =  counter - 10;
                if (optimal < 0){
                    optimal = 0;
                }
                System.out.println("You could have guessed the number up to " + optimal + " tries faster if you used the best method.");
                break;
            }
            counter++;
        }
    }
}
