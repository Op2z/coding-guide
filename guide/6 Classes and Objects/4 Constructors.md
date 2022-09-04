# Constructors

The method that initializes the state of new objects when they are created.

They can give values for class variables and do other operations. 

When you did `Chair eddiesChair = new Chair();`, the `Chair()` is the constructor
being called to create `eddiesChair`.

### Creating Constructors

Suppose a chair has occupation and number of legs. How will we set
these fields when the object is initialized?

#### Constructor Without Parameters

```java
class Chair{
    boolean isOccupied;
    int numLegs;
    public Chair(){
        isOccupied = false;
        numLegs = 4;
    }
}
```

The constructor method has the naming convention `public` followed by 
the class name with () and {}.

`public Chair(){}`

#### Constructors With Parameters

This will allow us to directly set the values when creating an object.

```java
class Chair{
    boolean isOccupied;
    int numLegs;
    public Chair(boolean isOccupied, int numLegs){
        this.isOccupied = isOccupied;
        this.numLegs = numLegs;
    }
}
```

the `public Chair(parameters)` is now the new constructor.

### Using the Constructor

```java
public class Main{
    public static void main(String[] args) {
        Chair myChair = new Chair(false, 4);
    }
}
```
Creates new chair with isOccupied = false and numLegs = 4.