# Higher Order Function

Higher order function allows you to make your code more concise. This lambda expression looks like a callback in javascript

The process:

1. Higher order function needs to know your intent
2. You need to express your intent in the form of lambda expression

| Functional interface |                      Lambda expression                       |         Example         | Used for  |
| :------------------: | :----------------------------------------------------------: | :---------------------: | :-------: |
|       Consumer       |        Receives a parameter and produces side-effect         |     x->{ ...code }      |   array   |
|      Predicate       |        Receives one parameter and produces a boolean         |  x->{ return boolean }  |           |
|       Function       |         Receives one parameter and returns any value         |   x->{ return value }   |           |
|      BiConsumer      |       Receives two parameters and produces side-effect       |   (x,y)->{ ...code }    | Map<K, V> |
|      Comparator      |        Receives two parameters and returns an integer        |  (x,y)->{ return int }  |   array   |
|    BinaryOperator    | Receives two parameters and returns a value of the same type | (x,y)->{ return value } |           |

## Stream Operations

When you break down your data source into a stream you can process it into pipeline of operations. Most of stream operations are higher order function.

- Filter: filter that receives predicate expression
- Map: transform every element in the stream. Receives a function expression and return another value
- sorted: receives stream as input in comparator expression and returns a sorted stream

## Terminate operations

Terminate operations terminate the process in the pipeline.