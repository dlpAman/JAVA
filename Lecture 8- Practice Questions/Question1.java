import java.util.Scanner;

public class Question1{
    // average of 3 numbers 
    public static int calculateAverage(int num1,int num2,int num3){
        int avg = (num1 +num2 +num3)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        int avg = calculateAverage(num1, num2, num3);
        System.out.println("The Average of 3 numbers is "+avg);
    }
}