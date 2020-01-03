package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class WarmUpProblem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fnum = "", snum = "";

        while (!new WarmUpProblem1().isNumeric(fnum)) {
            System.out.print("Enter first number: ");
            fnum = sc.nextLine();
        }

        while (!new WarmUpProblem1().isNumeric(snum)) {
            System.out.print("Enter second number: ");
            snum = sc.nextLine();
        }
        
        System.out.println(new WarmUpProblem1().check(fnum, snum));

        sc.close();

    }

    String check(String fnum, String snum) {
        
        return fnum.charAt(fnum.length()-1) == snum.charAt(snum.length()-1) ? "\u001B[32mTrue" : "\u001B[31mFalse";

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
