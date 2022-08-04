# Variables and Types

### Variables

A variable stores data such as numbers, letters, strings, arrays (grids), etc. 

`int year;`

### Types

The type of data a variable represents.

`String` `boolean` `int` etc.

### Declaration

Declaration is where the variable is created. 

It is shown by typing the type name and then the variable name. 

`int variable;`

### Initialization

Where the variable's value is set.

`variable = 10;` or
`int variable = 10;`

You can initialize variables and declare them on the same line.

---

# Implementation

```java
public class Main {
    public static void main(String[] args) {
        int lastYear = 2021; //initialization and declaration
        int nextYear; //declaration only
        nextYear = 2023; 
        String s = "year";
    }
}
```

# Reference Types

### Initialization for Objects and Reference Types

Reference types and objects initialize with the type, the name, and an 
equal sign. On the right side of the equal sign you need the word "new", then the
type again, and then (), and then parameters and a semicolon. 

`Object obj = new Object();`

`Scanner sc = new Scanner(System.in);`

# Naming Convention

All variable names are in pascalCase: first letter lowercase. All words after
start uppercase. 

`int helloWorld;`

All primitive types such as int are lowercase

All object types such as `Object`,`Scanner`, `ArrayList` are CamelCase: where all first letters
in each word are capitalized.

Names cannot start with numbers and must be one word.

