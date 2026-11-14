# Project Notes

## From Python to Java

The [original Python calculator](https://github.com/ItzZaFritz/Simple-Python-Calculator) was an early high-school programming project. It offered seven operations, including whole division, and prompted for two numbers and an operator. This Java midterm revisits the calculator as a continuing interactive program, using methods for operations and adding square root and factorial. The Java version does not include whole division.

The source notes that ChatGPT was used to write pseudocode as an outline for the project.

## Current limitations

- Enter numeric values when prompted; nonnumeric input is not handled and can terminate the program.
- Use nonnegative whole numbers for factorial and for the exponent in exponentiation. The loop-based implementations do not validate these inputs or correctly implement arbitrary fractional or negative values.
- Division and remainder by zero are not explicitly rejected. Java floating-point results such as `Infinity` or `NaN` may be displayed.
- The square root of a negative number produces `NaN`.
- Very large calculations can overflow or take a long time.
