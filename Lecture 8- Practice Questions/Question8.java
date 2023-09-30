import java.util.Scanner;

public class Question8 {
    public static double calculatePower(double x, int n) {
        if (n == 0) {
            return 1.0; // Anything raised to the power of 0 is 1
        }

        double result = 1.0;

        // Use a loop to calculate x^n
        for (int i = 1; i <= Math.abs(n); i++) {
            result *= x;
        }

        // If n is negative, take the reciprocal
        if (n < 0) {
            result = 1.0 / result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        double result = calculatePower(x, n);

        System.out.println(x + " raised to the power of " + n + " is " + result);

        scanner.close();
    }
}

