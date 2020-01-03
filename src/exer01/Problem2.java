package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter numbers: ");
            
            String numString[] = sc.nextLine().split(" ");
            
            if(numString.length <= 2){
                System.out.println("Input at least 4 numbers!");
                main(null);
                break;
            }
            
            boolean isNumbers = false;
            
            // Scans all input if they're real numbers
            for(int x = 0; x < numString.length; x++){
                isNumbers = isNumeric(numString[x]);
                if(!isNumbers){
                    System.out.println("Not number");
                    main(null);
                    break;
                }
            }
            
            // if the input is valid
            if(isNumbers){
                int total1 = 0, total2 = 0;
                
                for (int i = 0; i < numString.length; i++) {
                    // First Half
                    if(i < numString.length / 2)
                        total1 += Integer.parseInt(numString[i]);
                    // Second Half
                    else
                        total2 += Integer.parseInt(numString[i]);
                }
                
                System.out.println("\u001B[32mAverage is " + 
                        (
                            // ig. (num = x + x + x | x + x + x = num) then print the largest average
                            (total1 / (numString.length / 2)) > (total2 / (numString.length / 2)) 
                                    
                            ? (total1 / (numString.length / 2)) : (total2 / (numString.length / 2))
                        )
                );
                sc.close();
                break;
            }else
                return;
            
        }

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
