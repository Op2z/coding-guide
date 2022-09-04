import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Guessing Game");
        System.out.println("Think of a number (1-1000). ");
        System.out.println("The computer will guess your number using an approximation of binary search.");
        System.out.println("that i tried to do by myself so it might not be the most efficient");
        int number = 500;
        int difference = 0;
        int prevNumber = 500;
        int prevNumber2 = 0;
        int count = 0;

      /*  for (int i = 1; i <= 1000; i++) {
            while (true) {
                if (number > i) {
                    difference = Math.abs(prevNumber - prevNumber2) / 2;
                    number = number - difference;
                    //System.out.println(prevNumber);
                    //System.out.println(prevNumber2);
                    if (number == prevNumber) {
                        number--;
                    }
                    count++;
                } else if (number < i) {
                    difference = Math.abs(prevNumber - prevNumber2) / 2;
                    number = number + difference;
                    //System.out.println(prevNumber);
                    //System.out.println(prevNumber2);
                    if (number == prevNumber) {
                        number++;
                    }
                    count++;
                } else if (number == i) {
                    System.out.println("system guessed " + i);
                    break;
                } else {
                    //System.out.println("the code can't recognize that input, try again");
                }
                prevNumber2 = prevNumber;
                prevNumber = number;
            }
        }
        System.out.println("done");*/


        while (true) {
            System.out.print("Is it " + number + " ? (higher/lower/yes): ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            System.out.println("You typed \"" + answer + "\".");
            if (answer.equals("lower")) {
                difference = Math.abs(prevNumber - prevNumber2) / 2;
                number = number - difference;
                //System.out.println(prevNumber);
                //System.out.println(prevNumber2);
                if (number == prevNumber) {
                    number--;
                }
                count++;
            } else if (answer.equals("higher")) {
                difference = Math.abs(prevNumber - prevNumber2) / 2;
                number = number + difference;
                //System.out.println(prevNumber);
                //System.out.println(prevNumber2);
                if (number == prevNumber) {
                    number++;
                }
                count++;
            } else if (answer.equals("yes")) {
                System.out.println("the computer guessed your number in " + count + " tries.");
                break;
            } else {
                System.out.println("the code can't recognize that input, try again");
            }
            prevNumber2 = prevNumber;
            prevNumber = number;


        }

    }
}
