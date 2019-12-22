package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class Problem4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter numbers: ");
            
            String numbers = sc.nextLine();
            String numString[] = numbers.split(" ");
            
            boolean isNumbers = false;
            
            for(int x = 0; x < numString.length; x++){
                isNumbers = isNumeric(numString[x]);
                if(!isNumbers){
                    System.out.println("Not number");
                    main(null);
                    break;
                }
            }
            
            if(isNumbers){
                int total1 = 0, total2 = 0;
                
                for (int i = 0; i < numString.length; i++) {
                    if(i < numString.length / 2)
                        total1 += Integer.parseInt(numString[i]);
                    else
                        total2 += Integer.parseInt(numString[i]);
                }
                
                System.out.println("\u001B[32mAverage is " + 
                        (
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
