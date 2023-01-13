# Inheritance

Class can inherit the methods or attributes from parent class.

The process:

1. Create **parent** class that contains the shared field and methods
2. **Child** classes must inherit fields and method from their **parent**

## Polymorphism

Polymorphism is the ability of an object to take on multiple forms. A child can take the form of its parent.

For example we have 3 classes:

1. Product: brand, price, color
2. Shirt extends product: size
3. Pants extends product: length, waist

We can declare a variable with type of product that can store shirt/pants

```java
Product shirt = new Shirt();
Product pants = new Pants();
```

BUT, _the object shirt or pants will only have methods from product not from their respective class_.

So it is recommended to **declare an object at its most specific type**

## Override

Overriding means that the child class provides its own implementation of a method.
@Override annotation ensures that you are actually overriding a parent method

## Super

Super keyword refers to the parent class of a class.

- super(): invokes the constructor of a parent class.
- super.member: access a member of the parent class.

## Abstract

Abstract keyword is used to create abstract classes and methods.

- Abstract class: is a class that you can't create an object from.
- Abstract method: exposes behavior that a child must override.

### Abstract Class

For example we have 3 class

- Product: a parent that provide inheritance to its child class
- Shirt: a child class that inherit from product
- Pants: a child class that inherit from product

If we don't define the product class as an abstract, we can create an object from it. But, it is not specific what product that we are going to create.
To avoid this, use abstract class on the parent because we don't want to create any object that is not specific.

### Abstract Method

You can only define an abstract method inside an abstract class. An abstract method specifies what should be returned and what parameter to except.
An abstract method do not have a body and its implementation completely depends on the child itself.

## Object class

The object class is the root parent of any other class in Java. The object class defines methods like equals(), toString(), hashCode(), and getClass(). Any class is automatically inherit these methods.
