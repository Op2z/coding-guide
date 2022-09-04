# Object Instances

### Instance

A specific creation of an object. It's basically an object
that is created and the instance is that specific object.

Instance is like saying which object we are referring to. 

### Creating an Instance of an Object

`Chair eddiesChair = new Chair();`

### Fields

Variables inside an object that make up its state. Multiple fields 
form the state. These are class variables, also known as attributes.

```java
class Chair {
    String brand;
    int cost;
}
```

### Instance Method

Methods inside an object that operates on the object. These are object behaviors. 

Also known as class methods, these are all nonstatic which means they do not have a static keyword.

```java
class Chair{
    int cost = 100;
    public void breakChair(){
        cost = 0;
    }
}
```

### Mutator

It is a type of instance method that changes the state of an object.

`breakChair()` is a mutator.

### Accessor

It is a type of instance method that returns a state without modifying it.

```java
class Chair{
    private int cost = 100;
    public int getCost(){
        return cost;
    }
}
```

**Note private means that cost cannot be accessed outside the class.**

### `this` keyword

Gives you the instance of the current object.

```java
class Chair{
    private boolean occupied;
    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }
}
```

