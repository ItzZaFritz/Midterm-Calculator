import java.util.Scanner;

public class Midterm_Project {
    public static void main(String[] args) {

        /* Message from F7 Fritz
        This function will be a calculator that uses a while loop that keeps it
        running until the user wants to exit.
        The function will be able to add, subtract, multiply, divide, modulo,
        exponent, square root, and factorial.
        The user will be able to choose what operation they want and the program will
        use either one or two numbers to perform the operation and return the result.
        It will also have a conditional statement to check whether or not the user's
        inputs are valid, such as the correct operator or number.
        P.S: This program was based on my Python calculator program I made when I was
        learning Python during my first year of high school.
        So this will be an improvement of that program, but in Java.
        Note that ChatGPT was used specifically to write pseudocode for the program
        so that I have an outline to work with, and they are all will have comments. */

        // STEP 1: SET UP THE PROGRAM
        // The main method greets the user and displays the available operations.
        // The calculator method is called to begin the calculator program.

        // Greets the user and provides instructions
        System.out.println("Welcome user, how may we assist you with your calculations today?");
        System.out.println("To exit the program, please type exit");

        // Display a menu containing all available operations
        System.out.println("\nOperator Options Below, Please Select The Appropriate Operation Symbol");
        System.out.println("1.) Addition | +");
        System.out.println("2.) Subtraction | -");
        System.out.println("3.) Multiplication | *");
        System.out.println("4.) Division | /");
        System.out.println("5.) Modulo | %");
        System.out.println("6.) Exponentiation | ^");
        System.out.println("7.) Square Root | √");
        System.out.println("8.) Factorial | !");

        calculator();
    }

    // STEP 2: CREATE THE OPERATOR METHODS

    // Create a method for addition that accepts two numbers,
    // adds them together, and returns the result.
    public static double addition(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    // Create a method for subtraction that accepts two numbers,
    // subtracts the second number from the first, and returns the result.
    public static double substraction(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    // Create a method for multiplication that accepts two numbers,
    // multiplies them together, and returns the result.
    public static double multiplication(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    // Create a method for division that accepts two numbers,
    // divides the first number by the second, and returns the result.
    public static double division(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    // Create a method for modulo that accepts two numbers,
    // calculates the remainder, and returns the result.
    public static double modulo(double num1, double num2) {
        double result = num1 % num2;
        return result;
    }

    // Create a method for exponentiation that accepts two numbers,
    // raises the first number to the power of the second number, and returns the result.
    public static double exponentiation(double num1, double num2) {
        double result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }

        return result;
    }

    // Create a method for the square root that accepts one number,
    // calculates its square root, and returns the result.
    public static double squareroot(double num1) {
        double result = Math.sqrt(num1);
        return result;
    }

    // Create a method for factorial that accepts one number,
    // calculates the factorial, and returns the result.
    public static double factorial(double num1) {
        double result = 1;

        for (int i = 1; i <= num1; i++) {
            result *= i;
        }
        return result;
    }

    // STEP 3: BUILD THE CALCULATOR METHOD
    // This program will function as a calculator that continues running
    // until the user exits.

    public static void calculator() {

        // Initialize the necessary variables and prepare to receive user input.
        Scanner sc = new Scanner(System.in);
        String status = " ";

        // Use a while loop to keep the calculator running until the user chooses to quit.
        while (!status.equalsIgnoreCase("exit")) {

            // Allow the user to select an operation or choose to exit.
            // Available operations include addition, subtraction, multiplication,
            // division, modulo, exponentiation, square root, and factorial.

            // Ask the user to select an operation.
            System.out.print("\nSelect Your Operator (or type exit): ");
            String operator = sc.next();

            // Check whether the user wants to exit the calculator.
            if (operator.equalsIgnoreCase("exit")) {
                status = "exit";
            }

            // Otherwise, check whether the selected operator is valid.
            else if (operator.equals("+") || operator.equals("-")
                    || operator.equals("*") || operator.equals("/")
                    || operator.equals("%") || operator.equals("^")
                    || operator.equals("√") || operator.equals("!")) {

                // Determine how many numbers the selected operation requires.

                // For addition, subtraction, multiplication, division, modulo,
                // and exponentiation, request two numbers from the user.
                if (operator.equals("+") || operator.equals("-")
                        || operator.equals("*") || operator.equals("/")
                        || operator.equals("%") || operator.equals("^")) {
                    System.out.println("You'll need input two numbers");

                    System.out.print("Type in your first number: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Type in your second number: ");
                    double num2 = sc.nextDouble();

                    // Use a switch statement to determine which operation was selected.
                    // Call the corresponding operator method and pass the required numbers.
                    if (operator.equals("+")) {
                        System.out.println("The sum is: " + addition(num1, num2));
                    }

                    else if (operator.equals("-")) {
                        System.out.println("The difference is: " + substraction(num1, num2));
                    }

                    else if (operator.equals("*")) {
                        System.out.println("The product is: " + multiplication(num1, num2));
                    }

                    else if (operator.equals("/")) {
                        System.out.println("The quotient is: " + division(num1, num2));
                    }

                    else if (operator.equals("%")) {
                        System.out.println("The remainder is: " + modulo(num1, num2));
                    }

                    else if (operator.equals("^")) {
                        System.out.println("The power is: " + exponentiation(num1, num2));
                    }

                }

                // For square root and factorial, request one number from the user.
                else if (operator.equals("√") || operator.equals("!")) {
                    System.out.println("You'll need input one number");

                    System.out.print("Type in your number: ");
                    double num1 = sc.nextDouble();

                    // Use a switch statement to determine which operation was selected.
                    // Call the corresponding operator method and pass the required numbers.
                    if (operator.equals("√")) {
                        System.out.println("The square root is: " + squareroot(num1));
                    }

                    else if (operator.equals("!")) {
                        System.out.println("The factorial is: " + factorial(num1));
                    }

                }

                // After the calculation, ask whether the user wants to exit or continue.
                // If the user chooses to exit, the while loop will terminate.
                System.out.print(
                    "\nType exit to quit, or type anything else to continue: "
                );
                status = sc.next();
            }

            else {
                // Notify the user that they selected an invalid operator
                System.out.println("Invalid Operator Input");
            }

        }

        // Display a closing message when the user exits.
        System.out.println("Thank you for using the calculator!");

        // Close the Scanner when it is no longer needed.
        sc.close();
    }
}