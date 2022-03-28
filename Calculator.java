//Lauryn Schiller lauryns1@umbc.edu
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int calculation;
        do {
            System.out.println("Input two numbers");
            int num1 = myObj.nextInt();
            int num2 = myObj.nextInt();
            System.out.println("Press 0 to quit");
            System.out.println("Press 1 to add");
            System.out.println("Press 2 to subtract");
            System.out.println("Press 3 to multiply");
            System.out.println("Press 4 to divide");
            calculation = myObj.nextInt();
            switch (calculation) {
                case 0:
                    System.out.println("Calculation quit");
                    break;
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println((float) num1 / num2);
                    break;
                default:
                    System.out.println("Error please enter a number 0-4");
            }
        }
        while (calculation > 0);
    }
}
