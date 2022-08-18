# If Statements

What if we want to run code under a true or false condition?

We would use if statements.

### Conditional

A condition of either being true or false. 

### If Statement

Runs code if the conditional is true.

```java
public class Main{
    public static void main(String[] args) {
        if(true){
            System.out.println("this code will run");
        }
        if(false){
            System.out.println("this code willnot run");
        }
        
        int i = 5;
        if(i > 0){
            System.out.println("i is greater than 0");
        }
        
    }
}
```

### Else Statement

If the conditional in the initial if statement is not true 
the else statement is run. 
Requires if statement before it. 

```java
public class Main{
    public static void main(String[] args) {
        int grade = 95;
        if(grade > 90){
            System.out.println("grade is above an a");
        }
        else{
            System.out.println("grade is below an a");
        }
    }
}
```

### Else If Statement

if the if statement conditional is not true, the else if statement can be called after, which will 
run code based on another conditional. 

Else if statements must follow other else if statements or if statements. Else statements cannot go in front of
else if statements.

```java
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade > 90) {
            System.out.println("grade is A");
        }
        else if (grade > 80) {
            System.out.println("grade is B");
        }
        else if (grade > 70) {
            System.out.println("grade is C");
        }
        else{
            System.out.println("grade is fail");
        }
    }
}
```

### Single Line If Statements

If you only want to run one line of code after your if statement
you do not need to define a scope using curly brackets. 

```java
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade > 90) System.out.println("grade is A");
        else if (grade > 80) System.out.println("grade is B");
        else if (grade > 70) System.out.println("grade is C");
        else System.out.println("grade is fail");
    }
}
```

### Cases

Each if statement can be called a case. For example if the grade
is above 90, this is a case. Many if statements together form multiple
cases.