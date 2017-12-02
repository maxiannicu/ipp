# Class diagram

## Bridge

Sometimes an abstraction should have different implementations; consider an object that handles persistence of objects over different platforms using either relational databases or file system structures. The intent of this pattern is to decouple abstraction from implementation so that the two can vary independently.

In my laboratory work, I have created 2 astractions names as `Shape` and `DrawingApi`. These two abstractions can vary independently. Also, we have created multiple number of shapes in our program.

![Abstract factory](/structural/diagrams/bridge.png)

## Composite

There are times when a program needs to manipulate a tree data structure and it is necessary to treat both Branches as well as Leaf Nodes uniformly. The intent of this pattern is to compose objects into tree structures to represent part-whole hierarchies.

In my case I used composite shape to create a House On Wheel. We had a shape of house and shape of wheels (maybe something additional). Composite pattern allowed us to join them all and consider as a single element. Composite pattern can handle from one to infinite number of shapes.

![Builder](/structural/diagrams/composite.png)

## Decorator

Extending an object's functionality can be done statically (at compile time) by using inheritance however it might be necessary to extend an object's functionality dynamically (at runtime) as an object is used.

In my case I have created a ground decorator, this actually was printing a ground + a concrete Shape. So, this is like two objects as one.

![Factory method](/structural/diagrams/decorator.png)

## Proxy

Sometimes we need the ability to control the access to an object. For example if we need to use only a few methods of some costly objects we'll initialize those objects when we need them entirely. Until that point we can use some light objects exposing the same interface as the heavy objects. These light objects are called proxies and they will instantiate those heavy objects when they are really need and by then we'll use some light objects instead.

In my case, a proxy was a `LoggingProxyShell` which was responsibly logged all actions for a specific Shell. Actually this proxy just prints the parameters and redirects command to a real object. 

![Prototype](/structural/diagrams/proxy.png)

## Adapter

The adapter pattern is adapting between classes and objects. Like any adapter in the real world it is used to be an interface, a bridge between two objects. In real world we have adapters for power supplies, adapters for camera memory cards, and so on.

In my case, I have adapted a system command line to our Shell interface. After adapting, we can use this as a normal component in our system, without chaning our system.

![Singletone](/structural/diagrams/adapter.png)

# Conclusion

In my opinion, structural patterns are important, especially for Client-side applications and drawing applications. Their usage is common for UI-things. Of course, we should know them all, as long as we pretend to be engineers. Of course, we can find their usage on server-side applications. For example, Entity Framework ORM uses Proxy objects for lazy loading and modification tracking. This already means a big usage, as everyone uses ORM (maybe not everyone knows that they work with proxy).