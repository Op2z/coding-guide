import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random ran = new Random();
        int guess = ran.nextInt(10)+1;
        int count = 0;
        int[] usedNumbers = new int[10];
        while (true) {
            int counter = 0;
            int lastNumber = 0;
            for (int i = 0; i < usedNumbers.length; i++){
                if (usedNumbers[i]== 0) {
                    lastNumber = usedNumbers[i];
                    counter++;
                }
            }
            if (counter == 1){
                System.out.println("No numbers left, number must be " + lastNumber  + " .");
                break;
            }
            while (true){
                guess = ran.nextInt(10)+1;
                if (usedNumbers[guess - 1] == 0){
                    usedNumbers[guess - 1] = 1;
                    break;
                }
            }
            System.out.println("Is it " + guess + " ? (y/n)");
            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();
            if (ans.equals("y")||(ans.equals("Y"))) {
                break;
            }
            count++;

        }
        System.out.println("The computer guessed your number in " + count + " tries.");

    }
}
