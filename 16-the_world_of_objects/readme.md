# Objects

- Object is a thing that contains fields
- Object is a thing that can perform tasks

To initialize new object

```java
Car toyota = new Car();
```

the 'toyota' variable will store a unique reference to the object. If we store it into a new variable, for example

```java
Car toyota2 = toyota;
```

Here we are not creating a new object, we just copying the reference to the object toyota.

## Constructor

Constructor is the first method that runs when we initialize a new object. In constructor to refer to the object attribute we can use keyword **this**

## Getters

It is not recommended to access the object field directly (ex: toyota.brand). It is a best practice to create getters to access the object attributes. That's why when we define an attributes we should use **private** not **public**

## Setters

It is not recommended to modify the object fields directly (ex: toyota.brand = "Toyota"). It is a best practice to create a setters to modify the object fields.

## Copy constructor

A mutable object is an object with setters. After we call a new object, we can still modify the fields with setters.

- When dealing with objects, avoid setting variables equal to each other
- Both variables will share a reference to the same object

```java
public Car(Car source){
        this.brand = source.brand;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
    }
```

The newly object will accept a source which is the same type. And it will set the fields to the source fields.

## Arrays are mutable objects
- A variable will store the reference to the array. So **avoid setting variables equal to each other**.
- Both variables will share a reference to the same object

## toString

If you print out/call the object directly like below

```java
Car toyota = new Car();

System.out.println(car)
```

Java will call toString method from Class or **if we override the toString method in our class like below, java will call the overriden class**

```java
public class Car{
    //...
    public String toString(){
        return this.brand + " " + this.year;
    }
}
```

## equals
- equal contract, when you override the equals method you have to override the hashcode method too.
- don't change the name, return value, and the parameter from the methods that you want to override. Because java can't recognize it.

Step to override the equals method
1. Check if reference are equal
2. Check if the target is even a city object
3. Return true if the fields are equal