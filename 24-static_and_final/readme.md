# Static and Final

## Instance vs Static

- An instance field belong to the object of the class (ex: the attribute of the object)
- A static field belongs to the class itself

## Static

Belong to the class. For example we have a user object that has an attribute of below

| User                   |
| ---------------------- |
| name (String)          |
| age (int)              |
| userCount (int/static) |

Then we create 3 new users that has different name and age. Now a static keyword can be accessed in every object and the value is same in every object

Static has to be called in a static way.

```java
public class Car {
    //...
    private static int carCount;

    //...
    public static int getCarCount(){
        return carCount;
    }
}

// This is the WRONG way
Car toyota = new Car();

System.out.println(toyota.getCarCount);

// This is the RIGHT way
System.out.println(car.getCarCount);
```

## Static Final Constant

A static belongs to the class. A constant is final because it cannot be assigned to a new value. A constant is declared with UPPERCASE_AND_UNDERSCORES

So for example if we have minimum age of 19 the we can create

```java
public class Car {
    //...
    private static final int MIN_AGE = 19;

    //...
    public static final int getMinAge(){
        return MIN_AGE;
    }
}
```