import java.util.Scanner;

public class Question3 {
    public static int greatestofTwo(int a , int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greatest = greatestofTwo(a, b);
        System.out.println("The greatest number between "+ a + " and " + b + " is " + greatest);

    }
}
