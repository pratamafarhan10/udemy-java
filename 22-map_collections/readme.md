# Map Collection

```java
Map map = new HashMap();
Map map = new TreeMap();
```

## HashMap

Stores unordered key-value pairs collection

### HashMap Equality

The step to get the object inside our map

1. HashMap first hash the incoming key/object (hashCode function returns different value for every single object unless we modify/override based on the object attributes)
2. The hashCode get hash again to locate the correct index
3. At the current index, HashMap finds the right key/object that equals using **equals** function (if we modify the equals method, the method will compare by using toString method and if not equal then it will compare it by the object attributes)
4. If there is a key that equal with the key that we are looking for then the HashMap will return the key and the value.

**If we don't modify the equals or the hashCode method. This can lead to get totally different value in the map**

## TreeMap

Stores ordered key-value pairs collection. Tree map using red black tree algorithm to sort the values.

The size of the tree, determine how fast we can get the entry.

Only use tree map if you need the entries to be sorted
