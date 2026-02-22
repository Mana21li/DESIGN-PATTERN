# Factory Method vs Abstract Factory Design Pattern

Both **Factory Method** and **Abstract Factory** are **Creational Design Patterns**.  
They deal with **object creation** while hiding the instantiation logic from the client.

---

### 📌 Factory Method Design Pattern

The Factory Method Design Pattern is used in software engineering to provide an interface for creating objects in a superclass while allowing subclasses to alter the type of objects that will be created.

* It encapsulates the object creation logic in a separate method, abstracting the instantiation process and promoting loose coupling between the creator and the created objects.
* This pattern enables flexibility, extensibility, and maintainability in the codebase by allowing subclasses to define their own implementation of the factory method to create specific types of objects
---

### 📌 Abstract Factory Design Pattern
The Abstract Factory Pattern is a way of organizing how you create groups of things that are related to each other. It provides a set of rules or instructions that let you create different types of things without knowing exactly what those things are. This helps you keep everything organized and lets you switch between different types easily, following the same set of rules.

* Abstract Factory pattern is almost similar to Factory Pattern and is considered as another layer of abstraction over factory pattern.
* Abstract Factory patterns work around a super-factory which creates other factories.
* Abstract factory pattern implementation provides us with a framework that allows us to create objects that follow a general pattern.
* So at runtime, the abstract factory is coupled with any desired concrete factory which can create objects of the desired type.
---

### ✅ Factory vs. Abstract Factory Design Pattern

| Aspect | Factory Design Pattern | Abstract Factory Design Pattern |
|--------|------------------------|----------------------------------|
| **Purpose** | Creates objects without specifying the exact class. | Creates families of related objects without specifying their concrete classes. |
| **Complexity** | Less complex, focuses on a single product type. | More complex, involves multiple related products. |
| **Level of Abstraction** | Lower level of abstraction. | Higher level of abstraction. |
| **Class Hierarchy** | Involves a single factory method. | Involves multiple factory methods grouped under an abstract factory. |
| **Object Creation** | One product per factory. | Multiple related products per factory. |
| **Usage Scenario** | Useful when only one type of product is required. | Useful when multiple types of related products are required. |
| **Flexibility** | Less flexible as it deals with a single product. | More flexible as it deals with multiple related products. |
| **Code Maintainability** | Easier to maintain due to simplicity. | More complex but manageable with clear relationships among products. |
| **Example in Electronics** | Creating different types of sensors (e.g., temperature, pressure). | Creating families of components for a complete subsystem (e.g., an entire sensor suite). |
| **Decoupling** | Decouples the code from the specific type of product. | Decouples the code from the family of products and their concrete implementations. |

- Create a **factory method** in a base class or interface
- Subclasses override this method to create **specific objects**

📐 UML Diagram (Factory Method)

             <<interface>>
                Product
                   ▲
         -----------------------
         |                     |
    ConcreteProductA   ConcreteProductB


                Creator
           ----------------
        + factoryMethod(): Product
                    ▲
         -----------------------
         |                     |
    ConcreteCreatorA     ConcreteCreatorB

```
interface Product {
    void use();
}

class ProductA implements Product {
    public void use() { }
}

class ProductB implements Product {
    public void use() { }
}

abstract class Creator {
    abstract Product factoryMethod();
}
```