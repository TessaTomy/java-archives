/*
 * [initial-upload] Input validator for positive integers with custom exception
 * [class] PositiveInputValidator; reads n numbers and rejects negatives
 * [exception] NegativeException thrown on invalid input
 * [run-instructions] Compile with `javac PositiveInputValidator.java`, run with `java PositiveInputValidator`
 */

import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String s) {
        super(s);
    }
}

public class PositiveInputValidator {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("No of element pls:");
        int c = n.nextInt();
        int[] a = new int[c];
        int i = 0;

        System.out.println("Enter element pls:");
        while (i < c) {
            try {
                a[i] = n.nextInt();
                if (a[i] < 0) {
                    throw new NegativeException("-ve no");
                }
            } catch (NegativeException e) {
                System.out.println("Enter positive no.");
                continue;
            }
            i++;
        }
    }
}
