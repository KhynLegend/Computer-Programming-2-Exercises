package exer01;

import java.util.Scanner;

/**
 * This class is created by Khyn Antoque
 */
public class Problem7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter number of games: ");
            String num = sc.next();

            if (!isNumeric(num)) {
                System.err.println("Not a number! Restarting...\n");
                main(args);
                break;
            }

            int numOfGames = Integer.parseInt(num);

            System.out.print("Enter game data: ");
            String attacks = sc.next();

            System.out.println("");
            
            if (isLegit(attacks, numOfGames)) {
                
                //scores[0] = A's score | scores[1] = B's score
                int scores[] = {0, 0};
                
                //Tracks on the current match in the current loop
                int matches = 1;
                
                for(int turn = 0; turn < numOfGames * 2; turn += 2) {
                    
                    System.out.print("Game #" + matches + ":");
                    
                    switch(String.valueOf(attacks.charAt(turn)) + String.valueOf(attacks.charAt(turn + 1))) {
                        case "RS": case "SP":
                            System.out.print(" A WINS\n");
                            scores[0]++;
                            break;
                        case "SR": case "PS":
                            scores[1]++;
                            System.out.print(" B WINS\n");
                            break;
                        default:
                            System.out.print(" DRAW\n");
                    }
                    
                    matches++;
                    
                }
                
                System.out.println("\n" + (scores[0] > scores[1] ? "A WINS TOURNAMENT" : "B WINS TOURNAMENT"));
                
            } else {
                System.err.println("Insufficient turns! Restarting...\n");
                main(args);
                break;
            }
            
            break;
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

    //Checks the two inputs if they're goin to fit to the input standards before playing the game
    static boolean isLegit(String text, int numOfTurns) {
        
        if (numOfTurns * 2 == text.length()) {
            
            for (int x = 0; x < text.length(); x++) {
                
                if (text.charAt(x) != 'R' && text.charAt(x) != 'S' && text.charAt(x) != 'P')
                    return false;
                
            }
            
            return true;
            
        } else
            return false;

    }
    
}
