**Factory Method Pattern**

*Defines an interface for creating an object, but
lets subclasses decide which class to instantiate
Factory method pattern lets a class defer instatiation to subclasses*

**What**

 * Allows the creation of an object on to another
 class
 
 * Sometimes, using the *new* keyword on instatiating
  objects is not the best case.
 
 * Program to an interface.(An interface does not always mean
 a java interface, it could be a subclass implementing an abstract method)
 
 * Goal is to relay creation of objects on another class
 
 * Isolates object creation so that the maintenance can only happen at one place

 eg PizzaStore is our interface and NyPizzaStore are the subclasses that decides which object to create
 
 **HOW**
 
  * Usually defines 2 interface (Product, and Creator)
  
  * The creator has a factory method that is an interface of creating objects
  
  * The creation of objects is decided upon runtime, Creator class is created 
  without knowledge on the actual products that will be created, 
  which is decided purely by the choice of the subclass that is used
  
  * All product must implement a common interface. and this common interface
    is the type that Factory method returns
  
  * Code to interface
  
  * You extend a class, and the implementing class overrides the abstract method to create the object
  
  
  Use to decouple client code  from the concrete classes you need to instatiate. 
  
  
  **Abstract Factory Pattern**
  
  *provides an interface for creating families of related or
  dependent objects without specifying their concrete classes*
  
  e.g PizzaIngredientFactory is the common interface, and the dependent objects/family are
  NYPizzaIngredient,ChicagoFactory, and CaliforniaPizzaFactory
  
  *What*
  
  * Groups together a set of related product 
  
  * can have factory method inside. 
  
  **How**
  
  * Abstract method factory makes use of object composition
  
  * and the client uses that factory to create an object/uses that factory to facilitate creation of objects(Pizza Ingredient factory)
  
  * Under the hood abstract method factory makes use of  Factory method
  
 
  Use when you have a family or set related products