# Decorator Design Pattern 

***Decorator*** is a *structural* design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

* [Link to good explanation](https://refactoring.guru/design-patterns/decorator)

## Notes
* ***Inheritance is static.*** You can’t alter the behavior of an existing object at runtime. You can only replace the whole object with another one that’s created from a different subclass.
* With ***composition*** one object has a reference to another and delegates it some work, whereas with inheritance, the object itself is able to do that work, inheriting the behavior from its superclass.
* ***Wrapper*** is the alternative nickname for the Decorator pattern that clearly expresses the main idea of the pattern. A “wrapper” is an object that can be linked with some “target” object. The wrapper contains the same set of methods as the target and delegates to it all requests it receives.
* Decorator design patterns are most often used for applying *single responsibility principles* since we divide the functionality into classes with unique areas of concern.

#
# <img src="https://raw.githubusercontent.com/UlianaStefanishyna/attachments-recource/master/image/Decorator_structure.png" height="400" width="600" align="middle"/>
## Example
# <img src="https://raw.githubusercontent.com/UlianaStefanishyna/attachments-recource/master/image/Decorator.png" height="500" width="500" align="middle"/>


