**Command Pattern**

*Command Pattern encapsulats a request as an object, thereby letting you parameterize other objects
with different requests, queue or log requests, and suport undoable operations*

**What**

* Encapsulates method object invocation on a different
class.
* Use when you want to group method invocations, that 
have different execution methods or points.

**How**

* Create a Receiver class that will receive a list/or a Command object
THe receiver will be the one responsible for invoking the needed 
command object.
* You will have Command interface that will be extended by your
vendor classes also know as Concrete Command Objects. which will be used on the Receiver class
* Strive for dumb receivers. meaning little to business logic
to keep your classes decoupled
* With the command pattern, each operation will have a command object
resulting to multiple command objects.
