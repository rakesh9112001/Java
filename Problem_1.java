import java.util.*;
public class Problem_1 {
	    double a;
	    double b;
	    String operation;

	    
	    public void setValues(double x, double y, String op) {
	        a = x;
	        b = y;
	        operation = op;
	    }

	    public void calculate() {
	        switch (operation.toLowerCase()) {
	            case "add":
	                System.out.println("Result: " + (a + b));
	                break;
	            case "subtract":
	                System.out.println("Result: " + (a - b));
	                break;
	            case "multiply":
	                System.out.println("Result: " + (a * b));
	                break;
	            case "divide":
	                if (b != 0) {
	                    System.out.println("Result: " + (a / b));
	                } else {
	                    System.out.println("Error: Cannot divide by zero.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operation. Try add, subtract, multiply or divide.");
	        }
	    }

	   
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Problem_1 calc = new Problem_1();

	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();

	        System.out.print("Enter operation (add, subtract, multiply, divide): ");
	        String op = sc.next();

	        calc.setValues(num1, num2, op);
	        calc.calculate();

	        sc.close();
	    }
	}