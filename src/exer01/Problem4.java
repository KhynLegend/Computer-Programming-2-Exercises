
package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class Problem4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            
            System.out.print("Enter numbers: ");
            
            String numString[] = sc.nextLine().split(" ");
            
            boolean isNumbers = false;
            
            // Scans all input if they're real numbers
            for (String numString1 : numString) {
                isNumbers = isNumeric(numString1);
                if(!isNumbers){
                    System.out.println("Not number");
                    main(null);
                    break;
                }
            }
            
            int biggestOdd = 0;
            
            // Scan the whole array to find the biggest odd number
            for(String x : numString) {
                if(x.equals("0"))
                    continue;
                // Gets the odd number
                int odd = Integer.parseInt(x) % 2 != 0 ? Integer.parseInt(x) : 0;
                // if odd is greater then the new odd will get assigned
                biggestOdd = odd > biggestOdd ? odd : biggestOdd; 
            }
            
            //Replace zeros with odd numbers
            for (int i = 0; i < numString.length - 1; i++) {
                if(numString[i].equals("0")){
                    numString[i] = biggestOdd + "";
                }
            }
            
            System.out.println("New Array: " + getElements(numString));
            
            sc.close();
            break;
        }
        
    }
    
    static String getElements(String arr[]) {
        String all = "";
        for(String x : arr)
            all += x + " ";
        return all;
    }
    
    static boolean isNumeric(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
