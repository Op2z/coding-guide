# For Loops

A for loop contains three statements that allows the code to run a specific 
amount of times.

Generally a for loop will create an integer that will either increase or decrease
after the loop is run and will have a conditional that will only cause the code
to run if the integer is either greater than or less than another number.

The three statements are:

1. Declaration of a new integer `int i = 0;`
2. Conditional comparing integer `i < 10;`
3. Increment typically increasing the integer `i++`

```java
public class Main{
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            //will print 0-9
            //runs 10 times
        }
    }
}
```

### For Loop Challenge Example

user types in a number, code prints pyramid of numbers up to user number

e.g. 6:
```aidl
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
```

```java
import java.util.Scanner;

public class LoopsChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

```

### For Each Loops

Loops through a java array or collection like a list. This is if you
do not want to bother with indices and only want the item
at each position in the collection.

For each loops are written similarly to for loops except instead of 3 
statements it consists of creating an item, a colon, and then the collection
or array.

`for(int item: array) {}`

```java
public class Main{
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 4};
        for(int item: arr){
            System.out.println(item);
        }
    }
}
```