[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19218273)
# Instructions

Design and implement a hierarchy of classes, such that the code fragment in another class
```java
  ArrayList<Money> piggyBank = new ArrayList<Money>();
  piggyBank.add(new Quarter());
  piggyBank.add(new Bill(1));
  piggyBank.add(new Nickel());
  piggyBank.add(new Nickel());
  piggyBank.add(new Dime());
  piggyBank.add(new Coin("half-dollar", 0.50));
  piggyBank.add(new Bill(5));
  System.out.println(piggyBank);
  double amount = 0;
  for (Money item : piggyBank)
    {
      amount += item.getAmount();
    }
  System.out.println("The piggy bank holds $" + amount + ".");
  System.out.println(piggyBank.get(2).equals(piggyBank.get(3)));
```

displays
```java
[quarter, $1, nickel, nickel, dime, half-dollar, $5]
The piggy bank holds $6.95.
true
```
# Design Requirements
1. Write the Money class, which contains a constructor and one method. The Money class constructor has one parameter that is a double that contains the value of a piece of money.
2. The getAmount method in the Money class returns a double representing the value of the money item.
3. The inherited classes Coin and Bill both extend Money. Coin and Bill each have a constructor and an appropriate toString method.
4. Additionally, the Coin class has an equals method that overrides the equals method in the Object class. The method should check if two coins have the same name & value.
5. The classes Quarter, Nickel, and Dime should extend the superclass Coin and only have a no-argument constructor.


_Write your classes to avoid duplication of code by using inheritance
properly._


US coin names and values are as indicated.
* Quarter = $0.25
* Dime = $0.10
* Nickel = $0.05

  
