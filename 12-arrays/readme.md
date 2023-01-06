# Arrays

Arrays allows you to store many values at once. Since Java is a static language, one array can only store one data type. **You cannot resize the array once you created it**

## Declaring an array

You can either use array declaration or array literal (but only when you declare and affect the variable right away, array literals cannot be used for re-assigning an array).

For primitive types:

```java
int[] myIntArray = new int[3]; // each element of the array is initialised to 0
int[] myIntArray = {1, 2, 3};
int[] myIntArray = new int[]{1, 2, 3};
```

For classes, for example String, it's the same:

```java
String[] myStringArray = new String[3]; // each element is initialised to null
String[] myStringArray = {"a", "b", "c"};
String[] myStringArray = new String[]{"a", "b", "c"};
```

The third way of initializing is useful when you declare an array first and then initialize it, pass an array as a function argument, or return an array. The explicit type is required.

```java
String[] myStringArray;
myStringArray = new String[]{"a", "b", "c"};
```

https://stackoverflow.com/questions/1200621/how-do-i-declare-and-initialize-an-array-in-java
