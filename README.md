# Java Midterm Calculator

A command-line calculator created for a Java midterm project. It presents a menu, performs calculations, and continues until the user chooses to exit.

## Project background

This project revisits my [Simple Python Calculator](https://github.com/ItzZaFritz/Simple-Python-Calculator), which I made while learning Python in my first year of high school. The Java version builds on that idea with a repeated calculation loop, separate methods for each operation, square roots, and factorials.

See [Project Notes](PROJECT_NOTES.md) for a comparison and the current limitations.

## Operations

| Operator | Operation | Numbers |
| --- | --- | --- |
| `+` | Addition | 2 |
| `-` | Subtraction | 2 |
| `*` | Multiplication | 2 |
| `/` | Division | 2 |
| `%` | Remainder | 2 |
| `^` | Exponentiation | 2 |
| `√` | Square root | 1 |
| `!` | Factorial | 1 |

## Run on Windows

Install a Java Development Kit (JDK), open a terminal in this folder, and run:

```powershell
javac -encoding UTF-8 -d bin src\Midterm_Project.java
java -cp bin Midterm_Project
```

Choose an operator, enter the requested number or numbers, and follow the prompt to continue or exit. You can also enter `exit` at the operator prompt. For example, choose `+`, enter `2` and `3`, and the calculator prints `The sum is: 5.0`.

The square-root operator is the `√` character; make sure your terminal can enter and display it.

## Files

- `src\Midterm_Project.java` - the calculator source.
- `PROJECT_NOTES.md` - background, comparison, and limitations.
- `.gitignore` - excludes compiled Java output.
