//LAURYN SCHILLER LAURYNS1@UMBC.EDU
//LAB 2 PT 2 IF ELSE IF STATEME
//Lauryn Schiller lauryns1@umbc.edu
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Lab 2 part 2 IF/ELSE STATEMENTS
        int month;
        System.out.println("Input month 1-12" );
        Scanner input = new Scanner(System.in);
        month=input.nextInt();
    if (month==1) {
        System.out.println("January");}
    else if (month==2) {
        System.out.println("February");}
    else if (month==3) {
        System.out.println("March");}
    else if (month==4) {
        System.out.println("April");}
    else if (month==5) {
        System.out.println("May");}
    else if (month==6) {
        System.out.println("June");}
    else if (month==7) {
        System.out.println("July");}
    else if (month==8) {
        System.out.println("August");}
    else if (month==9) {
        System.out.println("September");}
    else if (month==10) {
        System.out.println("October");}
    else if (month==11) {
        System.out.println("November");}
    else if (month==12) {
        System.out.println("December");}
    else {
        System.out.println("ERROR: PLEASE ENTER A VALUE BETWEEN 1-12");}

        //LAB 2 PART 1 SWITCH STATEMENTS

        int month2;
        System.out.println("Input month 1-12");
        month2=input.nextInt();

        switch (month2) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
            System.out.println("ERROR: PLEASE INPUT MONTH 1-12");}

    }
}