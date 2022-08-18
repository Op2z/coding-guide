# Objects

An object is a data type that has its own identity, behavior, and states. 

### Initialization

`Object obj = new Object();`

### Common Objects

`String`: Used to store a sequence of characters (Hello World)

Can also be linked together using `+`.


```java
public class Main{
    public static void main(String[] args) {
        String s = "hello wrod";
        String v = s + "!";
        System.out.println(v);
    }
}
```

`Scanner`: Tokenizes string inputs by spaces and lines. Tokens are individual strings formed by spaces
in an input string.

```java
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }
}
```

`Array`: Stores a sequence of the same datatype (i.e. int[], String[], etc.). Size
never changes and you can use `.length` to get the length.

```java
public class Main{
    public static void main(String[] args) {
        int[] intArray = new int[5]; //creates array of size 5
        // all elements start as 0
        System.out.println(intArray.length); //prints length of array (5)
        int[] integerArray = {1, 2, 3, 4, 5}; //sets array directly with numbers (5)
        System.out.println(integerArray.length);
    }
}
```

`ArrayList`: A list of the datatype. It's an expanding array. Can add, remove,
get, etc. from this array list. Acts like a list and increases in size when adding
elements.

[Array List Guide](https://www.w3schools.com/java/java_arraylist.asp)

```java
public class Main{
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Fruits");
        shoppingList.add("Vegetables");
        shoppingList.add("Eggs");
        System.out.println(shoppingList);
    }
}
```

`Wrappers`: Takes primitive types and turns them into objects.

Array lists cannot store primitive types. Wrapper types are used to store primitives
like objects.

`ArrayList<int>` (this will not work because array lists cannot be a primitive type)

`ArrayList<Integer>` this will work because int is now the wrapper class Integer

```java
public class Main{
    public static void main(String[] args) {
        int i = 0;
        Integer I = 1; //wrapper class of int
        double d = 0.0;
        Double D = 0.0; //wrapper class for double
        //wrapper classes turns primitives into objects
        //acts the same way but can be used for arraylists
    }
}
```