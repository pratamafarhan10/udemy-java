# Immutable Objects

| Primitive | Immutable object |                 Mutable object |
| --------- | :--------------: | -----------------------------: |
| int       |     Integer      | Any object that can be updated |
| long      |       Long       |                                |
| double    |      Double      |                                |
| char      |    Character     |                                |
| boolean   | Boolean & String |                                |

## Primitive

A primitive is the most basic type in java. The variable store a single value and nothing more.

| Primitive | Byte used in memory |
| --------- | :-----------------: |
| int       |          4          |
| long      |          8          |
| double    |          8          |
| char      |          2          |
| boolean   |        1 bit        |

## Immutable Object vs Primitive

- Immutable objects take up more size in memory
- Immutable objects can be null; primitive types can not
- Immutable objects can call methods; primitive types can not

| Immutable object | Byte used in memory |
| ---------------- | :-----------------: |
| Integer          |         16          |
| Long             |         24          |
| Double           |         24          |
| Character        |         16          |
| Boolean          |         16          |

Notes:

- **Whenever possible favor primitive objects over immutable object, because they consume less size memory**
- **Only use immutable objects when you have no choice** for example when use List (ArrayList or LinkedList, they can only store objects)

## Immutable Object vs Mutable Object

- The state of an immutable objects cannot be changed
- References can be shared safely across your application

