
/* 
 * ### **Important Java Abstraction Theory for Interviews**  

#### **1. What is Abstraction?**  
- Abstraction is a **principle of OOP** that hides implementation details and only shows relevant features to the user.  
- It helps reduce complexity and improve code maintainability.  

#### **2. How is Abstraction Achieved in Java?**  
- **Using Abstract Classes** (`abstract` keyword).  
- **Using Interfaces** (`interface` keyword).  

#### **3. Abstract Class vs Interface**  
| Feature         | Abstract Class | Interface |
|---------------|--------------|------------|
| **Methods** | Can have abstract & non-abstract methods | Only abstract methods (before Java 8), default/static methods (after Java 8) |
| **Variables** | Can have instance variables | Only `public static final` constants |
| **Constructor** | Yes, can have constructors | No constructors |
| **Access Modifiers** | Can have any access modifier | Methods are `public` by default |
| **Multiple Inheritance** | Not supported (single inheritance only) | Supports multiple inheritance |
| **When to Use?** | When classes share common behavior but need different implementations | When different classes share the same behavior but are unrelated |

#### **4. Key Features of Abstract Class**
- **Declared using** `abstract` keyword.  
- **Cannot be instantiated** (objects cannot be created).  
- **May contain abstract methods** (methods without a body).  
- **May contain concrete methods** (fully implemented methods).  
- **Can have constructors and instance variables**.  

#### **5. Key Features of Interfaces**
- **Declared using** `interface` keyword.  
- **All methods are abstract by default** (before Java 8).  
- **Supports multiple inheritance** (a class can implement multiple interfaces).  
- **Can have default and static methods (from Java 8)**.  
- **Cannot have constructors or instance variables**.  

#### **6. Differences Between Abstraction and Encapsulation**
| Feature | Abstraction | Encapsulation |
|---------|------------|--------------|
| **Purpose** | Hides implementation details | Hides data using access modifiers |
| **Achieved By** | Abstract classes & interfaces | Private fields with getters/setters |
| **Focus** | What an object does | How an object hides data |
| **Example** | `abstract class Vehicle { abstract void move(); }` | `private String password; public void setPassword(String p) { password = p; }` |

#### **7. Real-Life Examples of Abstraction**
- **Car**: You use the steering, accelerator, and brake without knowing the engine's internal working.  
- **ATM Machine**: Users interact with UI to withdraw money but don’t see the internal processing.  
- **Smartphone**: You press buttons to make a call but don’t see the underlying circuit operations.  

#### **8. Important Interview Questions on Abstraction**
1. **What is abstraction in Java?**  
2. **How do abstract classes and interfaces differ?**  
3. **Can an abstract class have constructors?**  
4. **Why can't we instantiate an abstract class?**  
5. **Can an abstract class have a `main()` method?**  
6. **Can an interface extend another interface?**  
7. **Can an abstract class implement an interface?**  
8. **Can an abstract class have final methods?**  
9. **What happens if a class does not implement all interface methods?**  
10. **Which is preferred: Abstract Class or Interface?**  


 */



class Abstraction {
	public static void main(String args[]){
		feamle f = new feamle();
		f.walk();
		f.eat();

	}
}

abstract class Mans{

	Mans(){
		System.out.println("I am Super class of Mans");
	}

	public void walk(){
		System.out.println("man is walking");
	}

	abstract void eat();
}

class feamle extends Mans{

	feamle(){
		System.out.println("I am feamle");
	}

	void eat(){
		System.out.println("I am feamle and i eat anything");
	}

}