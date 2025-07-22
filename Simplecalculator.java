import java.util.Scanner;

public class Simplecalculator{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value OF a");
        int a = sc.nextInt();
        System.out.println("Enter The Value OF b");
        int b = sc.nextInt();
        System.out.print("Choose (+ - * /): ");
        char op = sc.next().charAt(0);


        switch (op) {
            case '+': System.out.println("Sum = " + (a + b)); break;
            case '-': System.out.println("Diff = " + (a - b)); break;
            case '*': System.out.println("Prod = " + (a * b)); break;
            case '/': 
                if (b != 0) System.out.println("Div = " + (a / b));
                else System.out.println("Cannot divide by zero!");
                break;
        
         default: System.out.println("Invalid operator");
        }
    }
}