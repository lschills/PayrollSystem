//Lauryn Schiller lauryns1@umbc.edu
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = myObj.nextLine().toUpperCase();
        int nameLength = firstName.length();
        char firstLastLetter = firstName.charAt(nameLength-1);
        System.out.println(firstLastLetter);

        System.out.println("Enter your last name and press enter");
        String lastName = myObj.nextLine().toLowerCase();
        String firstThreeLast= lastName.substring(0,3);

        int randomInt = 10 + (int) (Math.random() * 99);
        String randomSTR = Integer.toString(randomInt);

        String password = firstLastLetter+ randomSTR + firstThreeLast;
        System.out.println("Your password is: " + password);

        String passwordCon = password.concat("****");
        System.out.println("Your password after using concat: "+ passwordCon);

        StringBuilder pass = new StringBuilder(passwordCon);
        StringBuilder reversePassCon = pass.reverse();
        System.out.println("Your password after reverse: "+ reversePassCon);
        }
}
