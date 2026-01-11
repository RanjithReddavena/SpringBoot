# 🚀 Module 01: Inversion of Control (IoC)

The **Spring IoC (Inversion of Control) Container** is the core of the Spring Framework. It shifts the responsibility of object management from the developer to the framework.

## 📖 What is IoC?
In traditional programming, the developer manually creates objects and manages their dependencies. In Spring, the **container** takes over this responsibility:
* It creates and manages objects (**Beans**).
* It handles **Dependency Injection (DI)** based on configurations.
* It manages the entire **Bean Lifecycle**.

Because the container—not the developer—controls object creation and wiring, it is called **Inversion of Control**.

---

## 🏗️ Types of IoC Containers
Spring provides two types of IoC containers:

### 1. BeanFactory
* The most basic version of the IoC container.
* Provides basic support for dependency injection and bean lifecycle management.
* **Best for:** Lightweight applications or resource-constrained environments.

### 2. ApplicationContext
* An extension of `BeanFactory` with advanced enterprise features.
* Includes event propagation, internationalization (i18n), and AOP integration.
* **Best for:** Most modern Spring applications (the preferred choice).

---

## ✨ Key Features
The IoC Container offers several advantages:

*   **Dependency Injection:** Automatically injects dependencies into your classes.
*   **Lifecycle Management:** Manages beans from instantiation through deletion.
*   **Configuration Flexibility:** Supports **XML-based**, **Annotation-based**, and **Java-based** configurations.
*   **Loose Coupling:** Promotes cleaner code by decoupling object implementation from its usage.

---

## 🛠️ Configuration Methods
1. **XML Configuration** (Classic approach)
2. **Java Annotations** (e.g., `@Component`, `@Service`, `@Autowired`)
3. **Java-based Configuration** (using `@Configuration` and `@Bean` classes)
