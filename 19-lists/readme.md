# List

## Array List

Array list do not have a fix size. But they are different in how they store data. The type of element that list can store is generic. You can only store object in a list

```java
// Generic
List list = new ArrayList();

// Specific
List<String> list = new ArrayList<>();
```

## Comparing using built in equals method

In nature, java compare between objects by using it's reference. Even you have the same object that have the same value but with different reference, java will throw out false or not equal.
