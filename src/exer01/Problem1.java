
package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class Problem1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String numString[] = new String[3];

        while (!new Problem1().isNumeric(numString[0])) {
            System.out.print("Enter first number: ");
            numString[0] = sc.nextLine();
        }

        while (!new Problem1().isNumeric(numString[1])) {
            System.out.print("Enter second number: ");
            numString[1] = sc.nextLine();
        }
        
        while (!new Problem1().isNumeric(numString[2])) {
            System.out.print("Enter second number: ");
            numString[2] = sc.nextLine();
        }
        
        int a = Integer.parseInt(numString[0]);
        int b = Integer.parseInt(numString[1]);
        int c = Integer.parseInt(numString[2]);
        
        System.out.print("\nCheck second number? (true/false): ");
        boolean response = sc.nextBoolean();
        
        System.out.println();
        
        System.out.printf("%b\n", response ? c > b : (b > a && c > b));
        
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
