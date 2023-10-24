package Beginner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double inputA, inputB = 0;
        System.out.println("Thsi will calculate the hypotenuse");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        inputA = scanner.nextDouble();

        System.out.println("Type a number: ");
        inputB = scanner.nextDouble();

        double total = Math.sqrt(Math.pow(inputA, 2) + Math.pow(inputB, 2));

        System.out.println(total);

    }
}
