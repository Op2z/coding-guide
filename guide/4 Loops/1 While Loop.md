# Loops

What if we want to run code multiple times? We use a loop. 

### While Loop

Runs code multiple times while a conditional is true. 

Similar to an if statement but it runs the code repeatedly until
the conditional is false. 

The while loop consists of the following structure: 
```java
public class Main{
    public static void main(String[] args) {
        while (true){
            //this is an infinite loop
            //the conditional will always be true
            //in order to leave this loop use the statement break;
            //this will only run once
            break;
        }
        int guessNumber = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("guess a number");
        int guess = sc.nextInt();
        while(guessNumber != guess){
            System.out.println("guess incorrect, try again.");
            guess = sc.nextInt();
        }
        System.out.println("you guessed the number.");
    }
}
```

### Do While Loop

Do while loops are similar to while loops but the code
between the brackets will always run at least once. This is because the 
condition is not evaluated the first time through. 

The conditional is checked after the code is run instead of before. 

```java
public class Main{
    public static void main(String[] args) {
        do {
            //code here will run at least once
        } while (true);
        
        int guessNumber = 5;
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            System.out.println("guess the number");
            guess = sc.nextInt();
        } while (guess != guessNumber);
    }
}
```