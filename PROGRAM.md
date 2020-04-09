# Program

## Hands-on idea:

- Do hands-on in pairs (if Corona allows for it) to speed up the hands on parts.
- 'Thermostat software' as basis for all examples/hands-on
  - Work with abstractions
    - (Celsius/Fahrenheit/Kelvin), could be helpful with (Liskov from Solid).
  - Installing a new heater (different interface, create an adapter instead of if/else logic).
  - Testable interactions: turn on heating, turn off, does the heating scheme say it should be heated at this moment;
    - There could be different interfaces as well. Unit test based, integration test with REST calls, e2e with a simple UI.
  - Testing I/O (such as dates), may show the use for Dependency Injection with a `Clock` instance;
  - Could contain more 'complex data', such as heating schemes (may be a good exercise for single responsibility).

## General cut-up

Day 1: Mainly on writing clean and testable code.
Day 2: Mainly on Writing better test code.

## Sources and reading material for after the training:

- Book Clean Code
- Book: Implementation Patterns
- Web: https://sourcemaking.com/
- Web: https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf
- Paper: http://www.literateprogramming.com/mccabe.pdf

## Slide notes

---

### Module 0 - Introduction and Clean code (~30m).

#### 0.1 General introduction

#### 0.2 Why?

- Reference to 'There will be code'
- Code will be read more times than written.
- Readability. Affects the 'cost of change'.
- Getting stuck affects your state of mind.

#### 0.3 What clean code and testing code have in common? Hint: less bugs.

Tested code and clean code intersect:

- They intersect at bug free code;
- If you cant get your tested code clean, it says something about the code you are testing.

#### 0.4 The Clean Code 'bible' by R.C. Martin.

- Readability
- Isolation of functionality
- No duplication (DRY)
- Less code.

---

### Module 1 - General Software Development (~2h).

#### 1.1 Attitude (15m)

- Group effort.
- _"Where Is the Science in Computer Science?"_
- Be strict on the little things. It is a good and easy start
  - For example code formatting.
- Boy scout.

#### 1.2 Readable/good names (45m).

- Theory
- Example by code. Include how it helps in testing.
- Hands-on by rewriting a 'cryptic' Java class - make the unit tests run again.

#### 1.3 DRY (45m).

- Theory
- Example by code. Include how it helps in testing.
  - Suggestion: a UI test where you wait for a button to be available before clicking it. You want to keep this dry.
- Hands-on by rewriting one JUnit test class with some duplication in there.

---

### Module 2. Object Oriented Programming (~3h)

#### 2.1 Brief intro into Object Oriented programming (45m - 1h)

- Classes, Methods, Fields;
- Public, private, protected;

#### 2.2 Class Design (45m - 1h)

- Hide implementation.
- Encapsulation and Cohesion.
- Static constructors

#### 2.3 Inheritance (30m)

#### 2.4 Interfaces (30m)

- "All problems in computer science can be solved by another level of indirection" - David Wheeler (https://en.wikipedia.org/wiki/Indirection) (held).
-

---

### Module 3. SOLID (~2h)

> `O` and `I` intentionally left out

#### 3.1 Single Responsibility Principle (1h)

- Helps in the readability
- Hands-on: Refactor a Java class. Cut it up in methods.
  - For example, a class that determines if the thermostat should heating should turn on based on a heating plan, the current date and time and the current temperature.
  - Tip: Use naming as referred to before.
- Evaluate hands-on

#### 3.2 Dependency Inversion (30m - 45m):

- Show problems for testing code that is not using DI.
- Rule of thumb: "Do not use `new`-keyword for classes that express business rules. `new`-keyword is 'ok' for data and domain objects."
- For 95% only used to create testable code.
- Hands-on: rewrite some code to be IoC compatible. Put all construction in the `main` function.

#### 3.3 Liskov Substitution Principle (30m without hands-on) (could be omitted if the time does not allow for it)

- Show the dangers of making mistakes in this
- Hands-on: ?

---

### Module 4. Code Smells and Patterns and Others (~2)

#### 4.1 Cyclomatic Complexity (45m)

- Refer to paper. Complexity measure
- Reference for the number of tests.
- Hands-on:
  - Determine the complexity of a few methods (by hand?)
  - Refactor some methods to have a complexity of at most 2 (or 3...)?
- Pitfall: is a switch case really complex?

#### 4.2 Primitive Obsession (45m)

- https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf (subject)
- Give an Example with a `Secret`/`Password` Java class
- Hands-on: Implement a Carousel (for the thermostat display) with a `non-empty List` of `Slide`s

### 4.3 Adapter Pattern (30m)

- Theory what this solves.
  - You have an abstraction.
  - You have a few libraries from different vendors.
  - How to connect these?
- Hands-on: Implement the adapter pattern for two different heaters.
- Share Reference to material on patterns

---

### Module 5. Building Test Data for (creational pattern/factory)

TODO - Separate test data preparation from your tests

---

### Module 6. Using abstractions to Reuse tests.

TODO - Idea reuse same Cucumber test to do a visual test and a REST-based test.

---

### Module 7. Page Object Pattern

TODO - How OO can help you here

---

### Random things

- ToString, Equals and HashCode. Entities that tend to be hard to change once a system grows.
- Rule of thumb: Use `Object -> *` methods/functions as little as possible.
- Use `Integer.toString` rather than `String.valueOf` or `.toString()`. Add example of bugs that could occur.
