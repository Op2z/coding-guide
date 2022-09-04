# Encapsulation

Hiding the implementation of details of an object from clients of object.

This means making fields private, for example `private int cost`,
and then adding accessors and modifiers that gets and sets the value of cost.

We want to hide the variable cost so that we are in control of all modifications
and getting of the value cost.

### Getter

A method that gets the value.
Aka accessor.

Named with the convention get followed by variable name.
`getCost()`

### Setter

A method that sets the value, aka mutator.

`setCost()`

```java
class Chair{
    private boolean isBroken;
    
    public void setIsBroken(boolean isBroken){
        this.isBroken = isBroken;
    }
    public boolean getIsBroken(){
        return isBroken;
    }
}
```

What we just did above: we took `public boolean isBroken` and made it into
`private boolean isBroken`. This hides isBroken from the client.

We can access `isBroken` using `.getIsBroken()` and `.setIsBroken()`.

```java
public class Main{
    public static void main(String[] args) {
        Chair myChair = new Chair();
        myChair.setIsBroken(false);
        System.out.println(myChair.getIsBroken());
    }
}
```

Encapsulation is the process of making fields hidden.

