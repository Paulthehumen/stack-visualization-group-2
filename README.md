# stack-visualization-group-2

# Group Information

**Project Title:** Stack Visualization  
**Course:** BSIT 2  
**Subject:** Data Structures and Algorithms  
**Programming Language:** Java  
**GUI Framework:** Java Swing  
**Stack Type:** Array-Based Stack  
**Stack Capacity:** 10 Elements

# Group Members

1. Aldrine Bellinario
2. Alberto Jr. S. Barluado
3. Joseph Empal
4. Kent Clark I. Española
5.Stephen Paul L. Tacardon

# Project Description

Stack Visualization is a Java-based application that demonstrates how a stack data structure works using an array. It uses a graphical user interface created with Java Swing to display stack elements and allow users to perform different stack operations.

The application follows the Last In, First Out (LIFO) principle, which means the last element added to the stack is the first element removed.

 Features

- **PUSH** – Adds a new element to the top of the stack.
- **POP** – Removes the top element from the stack.
- **PEEK** – Displays the top element without removing it.
- **CLEAR** – Removes all elements from the stack.
- **CHECK STACK** – Checks whether the stack is empty.
- **RANDOM** – Generates random values and adds them to the stack.
- **Input Validation** – Prevents invalid input.
- **Stack Visualization** – Displays stack elements through a graphical interface.
- **Stack Size Display** – Shows the current number of elements and maximum capacity.

# Requirements

- Java Development Kit (JDK)
- NetBeans IDE or another Java IDE
- Java Swing (included in standard Java desktop development)

 How to Run

1. Clone or download this repository.
2. Open the project in NetBeans IDE.
3. Locate the `src` folder.
4. Make sure the following files are included:
   - `ArrayStack.java`
   - `StackPanel.java`
   - `StackGUI.java`
5. Right-click `StackGUI.java`.
6. Select **Run File**.
7. The Stack Visualizer window should appear.

 Project Structure

```text
Stack-Visualization/
│
├── src/
│   ├── ArrayStack.java
│   ├── StackPanel.java
│   └── StackGUI.java
│
├── screenshots/
│
└── README.md
```

## Stack Implementation

The project uses an array-based stack with a maximum capacity of 10 elements.

The stack supports the following basic operations:

- Push
- Pop
- Peek
- IsEmpty
- IsFull
- Size
- Capacity
- Clear
- ToArray

The application also handles stack overflow and underflow using exception handling.


## AI Disclosure

OpenAI ChatGPT (GPT-6) was used as an AI assistance tool during development. It provided guidance for code organization, Java Swing GUI implementation, input validation, debugging, and documentation.

All group members are responsible for understanding, testing, and explaining their respective contributions.

## Contributors

This project was developed collaboratively by the group members as part of the Data Structures and Algorithms course.

Each member contributed to the development, implementation, testing, and improvement of the Stack Visualization application.
