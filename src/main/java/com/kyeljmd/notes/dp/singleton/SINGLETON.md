**Singleton** 

*Ensures a class has only one instance, and provide a global point  of access to it*

**What**

* Singleton pattern ensures there's only object in the whole project

* One example of used is ThreadPools, Caches, Information registries, and other
information that only needs one instance of it.

**HOW**

* Create class with private constructor

* Create a static variable 

* Create a static method that returns/initializes if need 
the static variable

* Synchronize the getInstance if you dont have any performance concerns

* Use Eager initialization if performance is important. statically initializing(upon class load)
the object.

*Use Double checked locking(java)

* Be wary synchronization issues/Multithreading issues

* Be wary if you're multiple classloaders, a singleton class may result into multiple singleton references