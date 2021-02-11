package com.suako;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int getValueInput(String ordinal){
        Scanner input = new Scanner(System.in);
        int userInput;

        while (true) {
            try {
                System.out.printf("Enter your %s number: %n", ordinal);
                userInput = input.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("You didn't enter a number!");
                input.nextLine();
            }
        }

        return userInput;
    }

    public static void main(String[] args) {
        System.out.println("Simple Addition Program\n-");

        int firstValue = getValueInput("first");
        int secondValue = getValueInput("second");

        System.out.printf("%s + %s = %s", firstValue, secondValue, firstValue + secondValue);
    }
}
