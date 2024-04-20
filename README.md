# Java Program: String Matching and Custom Exception Handling

## Overview

This Java program prompts the user to enter a string and checks if it matches a specific value. If the input string does not match the expected value, a custom exception is thrown, indicating the mismatch along with the line number where the exception occurred.

## Main Class

- **`Main` Class**: This class contains the `main` method, which is the entry point of the program. It prompts the user to enter a string and then checks if the entered string matches the expected value ("India"). If the string does not match, a custom exception (`NOMATCHEXCP`) is thrown.

## Custom Exception Class

- **`NOMATCHEXCP` Class**: This class extends the `Exception` class to create a custom exception for string mismatch. It includes fields to store the erroneous string and the line number where the exception occurred. The constructor initializes the exception with a message, the erroneous string, and the line number. The `toString` method provides a custom string representation of the exception, including the message, erroneous string, and line number.

## Usage

1. **Running the Program**: Compile and run the `Main` class to start the application.
2. **Input**: Enter a string when prompted by the program.
3. **Output**: The program will either display a message indicating that the entered string matches "India" or will throw a custom exception if the string does not match.

## Requirements

- **Java Development Kit (JDK)**: Ensure you have JDK installed on your system to compile and run the Java program.

