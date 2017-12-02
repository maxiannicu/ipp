# Class diagram

## Command

Command decouples the object that invokes the operation from the one that knows how to perform it. To achieve this separation, the designer creates an abstract base class that maps a receiver (an object) with an action (a pointer to a member function). The base class contains an execute() method that simply calls the action on the receiver. This pattern is close to Strategy, but instead, this does not represent an algorithm, but action(which doesn't have a parameter).

I had used command as a menu action. Executed command is assigned after user input selection.

![Abstract factory](/behavioral/diagrams/command.png)

## Strategy

There are common situations when classes differ only in their behavior. For this cases is a good idea to isolate the algorithms in separate classes in order to have the ability to select different algorithms at runtime.

In our laboratory work I added several algorithms for a collection of numbers (Multiply, Min, Max, Sum). These all accepts same parameters and gives as result a number. The algorithm is selected at runtime (user selects algorithm).

![Builder](/behavioral/diagrams/strategy.png)

## Chain of responsability

The Chain of Responsibility design pattern allows an object to send a command without knowing what object will receive and handle it. The request is sent from one object to another making them parts of a chain and each object in this chain can handle the command, pass it on or do both. This pattern is used sometimes in Web application, for implementing *Filters*.

In our case, I had implemented a chain of formatters. The chain will stop when sended object has a specific type.

![Factory method](/behavioral/diagrams/chain-of-responsability.png)

## Iterator

The idea of the iterator pattern is to take the responsibility of accessing and passing trough the objects of the collection and put it in the iterator object. The iterator object will maintain the state of the iteration, keeping track of the current item and having a way of identifying what elements are next to be iterated.

In our case we had an abstraction for Enumerable (Collection) and Iterator, which iterates over collection. I had added a custom list and implementation for an interator over that list.

![Prototype](/behavioral/diagrams/iterator.png)

## Null

The intent of a Null Object is to encapsulate the absence of an object by providing a substitutable alternative that offers suitable default do nothing behavior. In short, a design where "nothing will come of nothing"

In this laboratory work I used this as default action for Algorithm selection. Because user selects an algorithm by specifying it's index, this may cause that user has selected an index without an algorithm assigned. NullAlgorithm is used as default value for algorithm. If user input matches any algorithm, than this value is replaced. Otherwise it will remains as Null and won't cause any harm as it works as normal object.

![Singletone](/behavioral/diagrams/null.png)

# Conclusion

In my opinion, behavioral patterns plays bigger role than other patterns. Behavioral are used more often than structural and creational, that are often replaced by dependency injection (singletone, factory-ies). Behavioral patterns is a strong foundation for a project, especially complex projects where is required a lot of data manipulations and computations. Such patterns as Command and Strategy offers a good flexibility and respects a principile from SOLID - (Open/Closed). These patterns gives us a easy way to extends and separate logic and behavior. Of course iterators are used everythere. Iterators are on base of collections in every language. Iterations over foreach loops are done with iterators. Also iterators are used for advanced topics like Stream(java) or Linq(C#). 