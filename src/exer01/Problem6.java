
package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class Problem6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            
            System.out.print("Enter numbers: ");
            
            String numbers = sc.nextLine();
            String numString[] = numbers.split(" ");
            
            boolean isNumbers = false;
            
            for (String numString1 : numString) {
                isNumbers = isNumeric(numString1);
                if(!isNumbers){
                    System.out.println("Not number");
                    main(null);
                    break;
                }
            }
            
            for (int i = 0; i < numString.length - 1; i++) {
                if(numString[i].equals("0")){
                    numString[i] = Integer.parseInt(numString[i + 1]) % 2 != 0 ? numString[i + 1] : "0";
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
