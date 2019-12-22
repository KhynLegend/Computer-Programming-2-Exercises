
package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class Problem2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String fnum = "", snum = "";

        while (!new Problem2().isNumeric(fnum)) {
            System.out.print("Enter first number: ");
            fnum = sc.next();
        }

        while (!new Problem2().isNumeric(snum)) {
            System.out.print("Enter second number: ");
            snum = sc.next();
        }
        
        System.out.println(
                ((fnum.equals("10") || snum.equals("10")) || (Integer.parseInt(fnum) + Integer.parseInt(snum) == 10))
                        ? "\u001B[32mTrue" : "\u001B[31mFalse");
        
    }
    
    boolean isNumeric(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
