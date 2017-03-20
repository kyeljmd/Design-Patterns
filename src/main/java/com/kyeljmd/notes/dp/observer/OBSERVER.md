**Observer Pattern**

*The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, 
called observers, and notifies them automatically of any state changes, usually by calling one of their methods.*

**What**

 * Programs to an interface and allows you to remove depends upon runtime

 * Observer pattern establishes a publish and subscribe
model

 * Where you have a subject, and have a list
or group of listeners that is registered to that subject
when something changes, these observers are listening 
to that topic will be notifies the observers 
about that change

 * Observer pattern allows you to register
and register observers/listeners upon run time.

 * PUBLISH AND SUBSCRIBE model something similar to 
a Message Queue

**How**

 * We have an object called Subject that maintains a 
   list of dependent objects which can also be called as observers.

 * The observers all observers will extend or implement a common interface for it to be callled/used
by its Subject.

