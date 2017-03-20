**Decorator Pattern**

*Attaches additional reponsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing
for extending functionality*


**What**

* Decorator adds behaviour to an existing class

* Wrap the class with newer behaviour

* This is implemented by performing recursive calls
  from the wrapper. 
  
* Maybe confusing an 

**How**

* Declare an Abstract component

* A Concrete Component extends An abstract component

* We have a Decorator class that also extends the abstrac component

* A concrete decorator will have an instance of a Component.

* Relies heavily on recursive calls

* BE CAREFUL WHEN ADDING ADDTIONAL BEHAVIOURS

* decorators can cahange the beviour of their components 
by adding new functionality before/after they decorate.

* Wrap components with decorators to add new functionalities