# Objects

### Object-Oriented Programming (OOP)

Reasoning about a program as a set of objects rather than actions.

### Objects

A programming entity that contains a state (data) and behavior (methods).

### State

A set of values (internal data) stored in an object.
Also known as fields or class variables.

```java
class Chair{
    int numberOfLegs;
    boolean hasCushion;
    String nameOfPerson;
    boolean isChairBroken;
}
```

### Behavior

Set of actions an object can perform, often reporting or modifying its internal state.
Also known as class methods.

```java
class Chair{
    private int numberOfLegs;
    public void breakChair(){
        numberOfLegs = 0;
    }
    public void growChair(){
        numberOfLegs = 4;
    }
    
    public int getNumberOfLegs(){
        return numberOfLegs;
    }
}
```

### Client

The code that interacts with the class and objects of the class.

### Classes vs Objects

Chair is the class, each chair you create is an object. 

Classes are the blueprints for objects. Objects are what you make from the blueprints.
Classes have states and behaviors that the objects use.

```java
public class Main{
    public static void main(String[] args) {
        Chair eddiesChair = new Chair();
        Chair victorsChair = new Chair();
        eddiesChair.growChair();
        victorsChair.growChair();
        eddiesChair.breakChair();
        System.out.println(eddiesChair.getNumberOfLegs());
        System.out.println(victorsChair.getNumberOfLegs());
    }
}
```

