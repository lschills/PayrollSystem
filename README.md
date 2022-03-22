# PayrollSystem

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to IS 147 Payroll System in Java");
        System.out.println("Please follow the instructions on the screen.");
        System.out.println("--------------------------------------------");
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = myObj.nextLine();

        System.out.print("What is your age: ");
        int age = myObj.nextInt();

        System.out.print("Press F for full time or P for part time: ");
        char fullTimeOrPartTime = myObj.next().charAt(0);

        System.out.print("How many hours did you work this week: ");
        double hours = myObj.nextDouble();

        System.out.print("What is your hourly pay rate: ");
        double payRate = myObj.nextDouble();

        System.out.print("Are you submitting a vacation request?: (true/false) ");
        boolean needVacation = myObj.nextBoolean();

        final double tax = 0.10;
        double grossPay = hours * payRate;
        double taxPaid = grossPay * tax;
        double netPay = grossPay - taxPaid;

        System.out.println("*********************************************");
        System.out.println("Hello, " + name + ". You are: " +age+ " years old.");
        System.out.println("Your employment status is: " +fullTimeOrPartTime);
        System.out.println("Vacation request: " + needVacation);
        System.out.println("Your tax rate= " +tax);
        System.out.println("Pay rate per hour: $" + payRate);
        System.out.println("Hours worked: " +hours);
        System.out.println("Gross Pay= $" +grossPay);
        System.out.println("Tax paid= $" +taxPaid);
        System.out.println("---------------------------------------------");
        System.out.println("You made $" +netPay+ " this week");
        System.out.println("*********************************************");
    }
}
