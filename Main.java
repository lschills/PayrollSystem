//Lauryn Schiller lauryns1@umbc.edu
public class Main {
    public static void triangle(int height) {
        for (int i = height; i >= 1; i = i - 1) {
            System.out.println();
            for (int j = i; j >= 1; j = j - 1) {
                System.out.print("*");
            }
        }
    }
    public static void main(String[] args) {
    triangle(10);
    }
}