import java.util.*;

class Simplecalc {
    double addition(double a, double b) {
        return a + b;
    }

    double subtraction(double a, double b) {
        return a - b;
    }

    double multiplication(double a, double b) {
        return a * b;
    }

    double division(double a, double b) {
        return a / b;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double a = sc.nextDouble();

        System.out.print("Enter b value: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();
        sc.close();

        Simplecalc calc = new Simplecalc();
        double result = 0;

        switch(op) {
            case "+":
                result = calc.addition(a, b);
                break;
            case "-":
                result = calc.subtraction(a, b);
                break;
            case "*":
                result = calc.multiplication(a, b);
                break;
            case "/":
                result = calc.division(a, b);
                break;
            default:
                System.out.println("Invalid Operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
