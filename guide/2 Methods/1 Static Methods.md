# Static Methods

### Method

A function that executes code and can be called from other areas
of the code.

### Scope

Represented by curly brackets and shows the boundary of the method. 

All code statements must exist within the scope of a method. All variables created within
a scope only exist inside the scope. 

### Main Method

```java
public class Main{
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
```

The main method is the first method that is called when the code is run. 

## What are Static Methods?

Static methods are called directly from the class.

For example, you can convert an array into a string by calling the Array class and its static method `Arrays.toString(arr);`

`Arrays` is a java class, not an object instance. 

`Arrays.toString()` this is a static method of the Arrays class that converts
an array into a string. This method is called from the class and not an object.

### Creating Your Own Static Method

You can create your own static method part of your own class. The main method is a 
static method. To call methods directly from the main method, you must make the 
methods static.

To create your own static method, do the following: 

```java
public class main{
    public static void methodName(){
        // body of code goes here
    }
}
```

`public`: means this method can be accessed outside this class. For example, 
the `Arrays.toString` method is public because we can access this method.

`static`: means this method is static and belongs to the entire class file. 

`void`: this means that the code does not return any value.
It just runs code. If this value is instead int or String etc. the method must return that type of value.

These identifiers must go in this order. After you have the method name 
and () which defines that this is a method.

{} define the scope of the method. 

### Private Methods

Instead of using public we use keyword private. This makes the method 
exist only inside the class. 

```java
public class main{
    private static void methodName(){
        //this method is only accessible inside of this class
    }
}
```

### Method Parameters

Method parameters go inside the parentheses and define different input variable types that are
required by the method that can be used. 

```java
public class main{
    private static void printSumOfNumbers(int a, int b){
        //prints out sum of numbers using parameters a and b
        //a and b are parameters of type int
        //parameters are defined by a type, any name, separated by commas.
        System.out.println(a+b);
    }
}
```

Primitive types are passed down by value, so when you pass down an int as a parameter,
any modifications made inside the method to integers a and b will not change the original variable values.

Think of this like we're creating completely new variables a and b inside of the method and that their values are just set 
to the parameter inputs.

Objects are reference types which means that they are passed down by reference. This means that their address in the memory 
is what's being passed down, not their values (location is being passed down).

Any modification to an object parameter modifies the object itself as well.

### Calling Methods

To call a method that exists in the same class you call the method name
with parentheses after and add parameters if needed. 

```java
public class main{
    public static void main(String[] args) {
        int i = 25;
        int j = 2;
        printSumOfNumbers(i, j); // calls method with a = 25 and b = 2
        modifyNumbers(i, j); //i and j stay 25 and 2
        int[] c = {1, 2, 3};
    }
    private static void printSumOfNumbers(int a, int b){
        System.out.println(a+b);
    }
    private static void modifyNumbers(int a, int b){
        a = 0;
        b = 0;
        // because primitives are passed down by value
        // modifying a and b does not modify i and j
    }
    private static void modifyObject(int[] a){
        a[0] = 3; // modifies first element of array (1) and changes it to 3
        // because a is a reference to the original object the original object also changes from 1 to 3
    }
}
```

### Return Statements

`return` is a keyword used to say that a method is returning a value.

Methods that have return values do not use the word "void". Instead of void, 
they say a return type such as int, String, etc.

This method must return this return type. There is no code run after the
return word is called. 

```java
public class main{
    public static void main(String[] args) {
        returnSumOfTwoNumbers(1, 2);
        //this method call returns 3 but doesn't do anything
        int sum = returnSumOfTwoNumbers(2, 2);
        //sum is now equal to 4
        //treat methods with return values of int as if it is an int
        System.out.println(returnSumOfTwoNumbers(5, 6));
        //prints 11
    }
    private static int returnSumOfTwoNumbers(int a, int b){
        //instead of void we use int
        //must return int
        int c = a + b;
        return c;
        //returns the sum as an int
    }
}
```

