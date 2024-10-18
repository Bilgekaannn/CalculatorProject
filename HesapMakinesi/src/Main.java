import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Please enter the second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Enter the operation you want to use(+,-,*,/)`:");
        char operation = scanner.next().charAt(0);


        double result;

        switch (operation){
            case '+':
                result = number1 + number2;
                System.out.println("Result: "+result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: "+result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: "+result);
                break;
            case '/':
                if (number2 !=0){
                    result = number1 / number2;
                    System.out.println("Result: "+result);
                }else {
                    System.out.println("ERROR");
                }
                break;
            default:
                System.out.println("Invalid operation");




        }

        scanner.close();


    }
}