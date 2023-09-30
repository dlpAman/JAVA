import java.util.Scanner;

public class Question4 {
    public static double calculateCircumference(double r){
        double pi =Math.PI;
        double circumference = 2*pi*r;
        return circumference;

    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        double r = sc.nextInt();
        double circumference = calculateCircumference(r);
        System.out.println("The Circumference of given radius " + r + " is " + circumference);

    }
}
