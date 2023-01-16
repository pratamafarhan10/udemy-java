# Interface

An interface is a contract of behaviour. So the classes implementing an interface are required to override every method inside of it. This allows polymorphism.

Classes with similar behavior should implement an interface

## Three layer design

We will refactor our code into three layer:

1. Presentation (view)
2. Service (controller)
3. Repository (model)

### Presentation

Responsible to represent data to the user. That's gonna be your driver class that handling the user input and the output.

### Service

Middleman between the presentation layer and the repository. That means the presentation layer needs to go through the service layer then the service layer can talk to repository. Service layer contains the application business logic

### Repository

The only layer that allows to access the data store. Create, read, update, and delete data from the data store.

## Starter project

POJO: Plain Old Java Object that represent data that will be saved to a database. It doesn't have any special properties and behaviour.

## 3 Layer example in web development

In spring boot, there are 3 layers

1. Controller (presentation)
2. Service (business)
3. Repository (data access)