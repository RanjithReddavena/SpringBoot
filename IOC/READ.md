🚀 Module 01: Inversion of Control (IoC)

Spring IoC (Inversion of Control) Container is the core of the Spring Framework.
It creates and manages objects (beans), injects dependencies, and manages their life cycles.
It uses Dependency Injection (DI) based on configurations from XML files,Java-based configuration,annotations,or POJOs.
Since the container,not the developer,controls object creation and wiring,it's called Inversion of Control (IoC).
Types of IoC Containers

*There are two types of IoC containers in Spring:*
1. BeanFactory
    The most basic version of the IoC container Provides basic support for dependency injection and bean lifecycle management
    Suitable for lightweight applications where advanced features are not required
2. ApplicationContext
    An extension of BeanFactory with more enterprise features Includes event propagation, internationalization, and more Preferred choice for most Spring applications
Key Features of IoC Container

/*The key features of IoC Container are:*/

*Dependency Injection: Automatically injects dependencies into our classes
*Lifecycle Management: Manages the lifecycle of beans, including instantiation, initialization, and deletion
*Configuration Flexibility: Supports both XML-based and annotation-based configurations
*Loose Coupling: Promotes loose coupling by decoupling the implementation of objects from their usage
