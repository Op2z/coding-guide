# Break

The break statement causes the code to jump out of a loop

```java
public class Main{
    public static void main(String[] args) {
        int i = 0;
        while (true){
            i++;
            if (i==10){
                break;
                //will leave infinite while loop
                //if i is 10
            }
        }
    }
}
```

# Continue

A continue statement will cause the loop to skip the next iteration
immediately.

```java
public class Main{
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            if (i == 2){
                continue;
                //if number is 2, do not print it out
                //skips code and continues to next iteration
            }
            System.out.println(i);
        }
    }
}
```