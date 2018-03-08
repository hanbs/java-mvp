# HMVP with passive Swing view && Spring as IoC framework

Hierarchical model–view–presenter? This is just a simple project to show how i work with Swing and Spring context in a legacy rich client application. The main goal is to get the software testable by using interfaces and dependency injection where possible. This sample project should not include other patterns like Observer, Reactive, Async, etc.

I could not find actual information about implementing the MVP pattern with passive view and Swing. That is the reason i created this sample project. I am sure, that it is not 100% perfect. If you have any  recommendation to improve this project, please feel free to open an issue or a pull request.

Inspired by following references:

* [Model–view–controller][4]
* [HMVC: The layered pattern for developing strong client tiers][1]
* [Model–view–presenter][2]
* [Martin Fowler: Passive view][3]

## UML Image's:

### Sample application interfaces:
![Application UML][ApplicationDiagram]

### MainFrame dependencies: 
![MainFrame UML][MainFrameDiagram]

### FirstChild  dependencies: 
![FirstChild UML][FirstChildDiagram]

### SecondChild dependencies: 
![SecondChild UML][SecondChildDiagram]


[1]: https://www.javaworld.com/article/2076128/design-patterns/hmvc--the-layered-pattern-for-developing-strong-client-tiers.html
[2]: https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter
[3]: https://martinfowler.com/eaaDev/PassiveScreen.html
[4]: https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller

[ApplicationDiagram]: src/main/resources/uml/ApplicationDiagram.png
[MainFrameDiagram]: src/main/resources/uml/MainFrameDiagram.png
[FirstChildDiagram]: src/main/resources/uml/FirstChildDiagram.png
[SecondChildDiagram]: src/main/resources/uml/SecondChildDiagram.png

