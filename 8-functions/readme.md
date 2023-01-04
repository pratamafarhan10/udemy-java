# Functions

Functions can be used to isolate a specified task.

Function in Java:

public static void name (int param){

}

- public/private/protected means level of access, public means that it can be accessed in another class
- static means that the function can only be called in a static context (another static function). Every functions in our class need to be static
- void/any data type is the return value. Void means we don't return anything
- name is the name of the function
- parameters is the argument that can be used inside the function

## Notes
- The main function task is to run the main application
- Always write function with lowerCamelCase
- Function and method is the exact same things in java

## Void function vs Value-returning function
Void means you don't return any value from the function. If your function needs to perform some kind of calculation that can be use in another function, then your function needs to return a value.

## Scope
When you define a variable inside of a function, that variable can only be accessed inside the function. If you define it in class level, you can access it from anywhere inside the class
