# Class diagram

## Abstract factory

Abstract factory is a very good method to abstract object creation and object implementation. This is pretty similar to Factory method, but it creates a family of objects not only one, as it Factory method does.

![Abstract factory](/creational/diagrams/abstract_factory.png)

## Builder
Builder simplifies creation of object. This is used when creation is compilcated and requires several operations. Builder wraps this operations inside and gives to user a clean and beautiful api for creation.

![Builder](/creational/diagrams/builder.png)

## Factory method
Factory method is a very good method to abstract object creation and object implementation. I have created an abstract HttpClient and HttpClientFactory and then two different implementations. This patterns allows us easily to change implementation in our project, as we depend upon abstractions.
![Factory method](/creational/diagrams/factory_method.png)

## Prototype

Prototype pattern is defined and implemented at lower level inside Java. So we actually had to override `clone()` method. This patterns creates new object with same content. 

![Prototype](/creational/diagrams/prototype.png)

## Singletone

Singletone is commonly used to avoid duplications of an object and use same instance everytime you want to access methods.

![Singletone](/creational/diagrams/singletone.png)

# Tests
There is one test written for *Builder Pattern* which checks if builder works properly.

# Conclusion

During this laboratory work we have implemented and used 5 creational design patterns. Most of them are very used nowadays. For example prototype is already implemented as level of Java, so we don't need to create another interface. Builder patterns is commonly used for avoiding complicate constructors and simplify things with additional object, such as our case. In our case, we had implemented a pretty beautiful API for creating `WebUrl`.