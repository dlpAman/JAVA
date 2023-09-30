import java.util.Scanner;

public class Question9 {
    public static int calculateGOD(int a , int b){
        if(b>a){
            int temp =a;
            a=b;
            b=temp;
        }
        while(b!=0){
            int remainder = a%b;
            a=b;
            b =remainder;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = calculateGOD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
    }
}
