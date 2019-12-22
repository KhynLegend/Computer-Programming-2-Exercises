
package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class Problem5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            int smallBricks = 0, bigBricks = 0, goalBricks = 0; 
            
            System.out.print("Enter number of small bricks: ");
            String temp = sc.next();
            if(isNumeric(temp))
                smallBricks = Integer.parseInt(temp);
            else{
                System.err.println("Input a number! Restarting...\n");
                continue;
            }
            
            System.out.print("Enter number of big bricks: ");
            temp = sc.next();
            if(isNumeric(temp))
                bigBricks = Integer.parseInt(temp) * 5;
            else{
                System.err.println("Input a number! Restarting...\n");
                continue;
            }
            
            System.out.print("Enter length of brick to make (goal): ");
            temp = sc.next();
            if(isNumeric(temp))
                goalBricks = Integer.parseInt(temp);
            else{
                System.err.println("Input a number! Restarting...\n");
                continue;
            }
            
            System.out.println("");
            System.out.println(smallBricks + bigBricks == goalBricks ? "\u001B[32mTrue" : "\u001B[31m False");
            
            sc.close();
            break;
        }
        
    }
    
    static boolean isNumeric(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
