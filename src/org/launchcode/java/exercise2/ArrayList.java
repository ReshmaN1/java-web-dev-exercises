package org.launchcode.java.exercise2;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] arr) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        for (String val : arr) {
            int intVal = Integer.parseInt(val);
            if (intVal % 2 == 0) {
                total += intVal;
            }
        }
        System.out.println("Total :"+total);
        //return total;

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();



    }
}
