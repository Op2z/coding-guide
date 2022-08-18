# Non Static Methods

Non-static methods have to be called through an object instance instead of a class.
Some common non-static methods include: getting input from a scanner or getting the size of an array list.

```java
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int num = sc.nextInt();
    }
}
```

### Other Examples of Non Static Methods

- `System.out.println()` where `println` is a non-static method of 
System.out
- charAt() and indexOf() are non-static methods that can be used on strings.
- etc.

### Creating Your Own Non-Static Method

```java
class Chair {
    int numberOfLegs;
    String occupantName;
    static String brandName;
    public void setNumLegs(int legs){
        numberOfLegs = legs;
    }
    public void setOccupantName(String name){
        occupantName = name;
    }
    public static void setBrandName(String brandName1){
        brandName = brandName1;
    }
    public void printChair(){
        System.out.println(numberOfLegs + occupantName + brandName);
    }
}
```

### Calling in Non-Static Methods

```java
public class Main{
    public static void main(String[] args) {
        Chair chair1 = new Chair();
        chair1.setNumLegs(5);
        chair1.setOccupantName("eddie");

        Chair chair2 = new Chair();
        chair2.setOccupantName("victor");
        chair2.setNumLegs(4);

        Chair.setBrandName("ikea");

        chair1.printChair(); // 5eddieikea
        chair2.printChair(); // 4victorikea

    }
}
```

