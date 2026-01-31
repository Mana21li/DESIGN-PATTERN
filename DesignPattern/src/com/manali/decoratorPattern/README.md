# Decorator Design Pattern

## 1. What is the Decorator Pattern?

**Decorator Pattern** is a **structural design pattern** that allows you to **add new behavior to objects dynamically** without modifying their existing code.

Instead of relying on inheritance (which can lead to class explosion), the decorator pattern uses **composition** to wrap objects and extend their functionality at runtime.

---

## 2. When to Use Decorator Pattern

Use the Decorator Pattern when:

- You want to **add responsibilities to objects dynamically**
- Using inheritance would result in **too many subclasses**
- You want to adhere to the **Open/Closed Principle**
- You need **flexible combinations of behaviors**

---

## 3. Key Components

1. **Component**  
   Defines the common interface for both concrete components and decorators.

2. **ConcreteComponent**  
   The base object to which additional responsibilities can be added.

3. **Decorator (Abstract)**  
   Implements the Component interface and contains a reference to a Component object.

4. **ConcreteDecorator**  
   Extends the behavior of the component by adding new functionality.

---

## 4. Real-World Analogy ☕

Consider a coffee ordering system:
- Plain Coffee
- Coffee + Milk
- Coffee + Milk + Sugar
- Coffee + Milk + Sugar + Whipped Cream

Each topping **decorates** the coffee without changing the original coffee class.

---

## 5. UML Diagram

        +----------------+
        |   Component    |
        |----------------|
        | +cost()        |
        +----------------+
                ▲
                |
      +---------------------+
      |  ConcreteComponent  |
      |---------------------|
      | +cost()             |
      +---------------------+

                ▲
                |
        +----------------+
        |   Decorator    |
        |----------------|
        | -component     |
        | +cost()        |
        +----------------+
                ▲
                |
      +---------------------+
      |  ConcreteDecorator  |
      |---------------------|
      | +cost()             |
      +---------------------+
