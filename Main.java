import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int userNum;

        System.out.print("Enter any number: ");
        userNum = x.nextInt();
        System.out.println("\nTerm " + userNum + " in the fibonacci sequence is " + fibSeq(userNum));
    }

    public static int fibSeq(int userNum){
        int finalNum = 0;
        int a = 0;
        int b = 1;
        int c;
        int i;

        //System.out.print(a + ", " + b + ", ");
        
        if (userNum == 1){
            finalNum = 0;
        } else if (userNum == 2) {
            finalNum = 1;
        } else if (userNum == 3) {
            finalNum = 1;
        } else {
            for (i = 3; i <= userNum; i++) {
                c = a + b;
               // System.out.print(c + ", ");
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