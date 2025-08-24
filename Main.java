import java.util.Scanner;
/**
 * Daniel Duran
 * CEN 4802 - Software Integration, Configuration, and Testing
 * August 24, 2025.
 * Main.java
 * This program will allow users to enter an integer and see which term it correlates to in the fibonacci sequence.
 * For example, entering 5 will give you the 5th term in the fibonacci sequence. The main method gets the users input
 * and calls the fibSeq method using the user's number as a parameter.
 * @author Daniel Duran
 */

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int userNum;

        System.out.print("Enter any number: ");
        userNum = x.nextInt();
        System.out.println("\nTerm " + userNum + " in the fibonacci sequence is " + fibSeq(userNum));
    }

    /**
     * Daniel Duran
     * CEN 4802 - Software Integration, Configuration, and Testing
     * August 24, 2025.
     * fibSeq.java
     * This method uses the userNum variable to determine how many times the fibonacci sequence should be calculated
     * and then returns the last number in the sequence to be displayed in the main method.
     * @param userNum The number supplied by the user from the main method.
     * @return finalNum The last number calculated in the fibonacci sequence.
     */

    public static int fibSeq(int userNum){
        int finalNum = 0;
        int a = 0;
        int b = 1;
        int c;
        int i;
        
        if (userNum == 1){
            finalNum = 0;
        } else if (userNum == 2) {
            finalNum = 1;
        } else if (userNum == 3) {
            finalNum = 1;
        } else {
            for (i = 3; i <= userNum; i++) {
                c = a + b;
                a = b;
                b = c;

                if (i == userNum) {
                    finalNum = c;
                }
            }
        }
        return finalNum;
    }
}
