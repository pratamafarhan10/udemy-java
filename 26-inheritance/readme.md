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

BUT, *the object shirt or pants will only have methods from product not from their respective class*.

So it is recommended to **declare an object at its most specific type**
