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
