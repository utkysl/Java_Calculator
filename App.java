import java.util.*;
public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double num1= 0, num2= 0;
            while (true) {
                System.out.println("Type the first number: ");
                if(scanner.hasNextDouble()){
                    num1 = scanner.nextDouble();
                    break;
                }
                else{
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }   while (true) {
                System.out.println("Type the second number: ");
                if(scanner.hasNextDouble()){
                    num2 = scanner.nextDouble();
                    break;
                }
                else{
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }   char operation;
            while (true) {
                System.out.println("Please Select the desired operation (+, -, *, /): ");
                operation = scanner.next().charAt(0);
                if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                    break;
                } else {
                    System.out.println("Invalid operation. Please enter one of (+, -, *, /) ");
                }
            }   double result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0){
                        result = num1 / num2;
                    }
                    else{
                        System.out.println("Error: Cannot divide by zero.");
                        return;
                    }
                    break;
                    
                default:
                    System.out.println("Invalid operation.");
                    return;
            }
            System.out.println("Result: " + result);
        }
    }
}
