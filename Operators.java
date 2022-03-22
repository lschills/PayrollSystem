//Lauryn Schiller lauryns1@umbc.edu
public class Main {

    public static void main(String[] args) {
        //HW part 1
        int var1 = 40;
        int var2 = 2;

        int plusOperator = var1+var2;
        System.out.println("40 plus 2 equals " + plusOperator);

        int minusOperator = var1-var2;
        System.out.println("40 minus 2 equals " +minusOperator);

        int multiplicationOperator = var1*var2;
        System.out.println("40 multiplied by 2 equals "+multiplicationOperator);

        int divisionOperator = var1/var2;
        System.out.println("40 divided by 2 equals "+ divisionOperator);

        int modulusOperator =var1%var2;
        System.out.println("40 mod 2 equals "+modulusOperator);

        int incrementOperator= ++var1;
        System.out.println("40 increased by one equals "+ incrementOperator);

        int decrementOperator= --var2;
        System.out.println("40 decreased by one equals "+ decrementOperator);



        //HW part 2
        int var3= 3;
        int var4= 12;

        boolean equalsOperator= var3==var4;
        System.out.println("3 is equal to 12. " +equalsOperator);

        boolean notEqualOperator= var3!=var4;
        System.out.println("3 is not equal to 12. " + notEqualOperator);

        boolean greaterOperator= var3>var4;
        System.out.println("3 is greater than 12. " + greaterOperator);

        boolean lessOperator=var3<var4;
        System.out.println("3 is less than 12. " +lessOperator);

        boolean greaterEqualOperator=var3>=var4;
        System.out.println("3 is greater than or equal to 12. " +greaterEqualOperator);

        boolean lessEqualOperator= var3<=var4;
        System.out.println("3 is less than or equal to 12. " +lessEqualOperator);

    }
}
