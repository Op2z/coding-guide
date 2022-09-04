# Arrays

Stores a series of numbers as an object.

The length of an array is fixed and cannot be changed unless a new array
is created.

To create an array you must use the keyword new as it is an object.
Arrays can represent any data type. Arrays are defined by the datatype
followed by hard brackets.


### Array Indexes

The first element in an array is element #0. The second element is position 1. Indexes
tell the position in an array.

For example, the last index in an array is the length of the array minus one, because
the first element starts at 0. 

### Arrays Example

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //creating arrays
        int[] integerArray = new int[15];
        //creates array with length 15
        //all elements in array are initialized to 0

        int[] numberArray = {1, 2, 3, 4, 5};
        //creates array directly and populates it with numbers

        int firstNumber = numberArray[0];
        //gets 1
        int lastNumber = numberArray[numberArray.length - 1];
        //gets 5

        numberArray[3] = 7;
        //changes number 4 to 7 in numberArray
        numberArray[numberArray.length - 1] = 0;
        //changes last number to 0

        System.out.println(Arrays.toString(numberArray));
        //prints out the array
        
        String s = Arrays.toString(numberArray);
        //converts the array to a string
        
        for (int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }//traverses each element of the array and prints 
        //on a separate line.
        
        for (int element: numberArray){
            System.out.println(element);
            //loops through array giving each value
            //no indexes
        }
        
        for (int j = 0; j < integerArray.length; j++){
            integerArray[j]++;
            //increases all elements of array by one
        }
    }
}
```