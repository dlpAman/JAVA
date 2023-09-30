import java.util.Scanner;

public class Question7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;
        do {
            System.out.print("Enter the number:");
            int number = sc.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Do you want to enter another number?: ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zero numbers: " + zeroCount);
        sc.close();
    }
}
