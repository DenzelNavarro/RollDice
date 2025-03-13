# RollDie Program

## Description
The **RollDie** program simulates rolling two dice using a `RollDie` class. The program creates two dice, rolls them, and displays their values. Additionally, it calculates and prints the sum of the numbers rolled. The dice values are generated randomly between 1 and 6.

## Features
- Creates two dice objects.
- Rolls each die and displays the resulting values.
- Computes the sum of the numbers rolled.
- Allows multiple rolls to observe changes in values.

## What I Learned
- Object-oriented programming concepts such as classes and instance variables.
- Random number generation using `Math.random()`.
- String representation of objects using `toString()`.
- Encapsulation through private instance variables and getter methods.

## Classes

### `RollDie`
The `RollDie` class represents a six-sided die.

- **Instance Variable:**
  - `num`: Stores the rolled number.
- **Constructor:**
  - `RollDie()`: Initializes the die with a default value of `1`.
- **Methods:**
  - `roll()`: Generates a random number between 1 and 6 and updates `num`.
  - `getNum()`: Returns the current value of `num`.
  - `toString()`: Returns the die value as a string.

### `TestProgRollDie`
The `TestProgRollDie` class is the main program that simulates rolling dice.

- Creates two `RollDie` objects.
- Rolls each die and prints the results.
- Computes and displays the sum of the rolled values.
- Rolls again and outputs the updated sum.

## Example Output
```sh
Die 1: 1
Die 2: 1
After rolling die 1: 3
After rolling die 2: 5
Sum of the numbers rolled by the dice is: 8
After rolling again, the sum of the numbers rolled is: 7
```

## How to Run
1. Compile the Java files:
   ```sh
   javac RollDie.java TestProgRollDie.java
   ```
2. Run the program:
   ```sh
   java TestProgRollDie
   ```

