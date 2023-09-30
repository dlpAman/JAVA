import java.util.Scanner;

public class Question10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n =sc.nextInt();
        int firstTerm = 0, secondTerm =1;
        System.out.println("Fibonacci series of " + n + " terms:");
        if(n>=1){
            System.out.println(firstTerm + " ");
        }
        if(n>=2){
            System.out.println(secondTerm + " ");
        }
        for(int i =3; i<=n;i++){
            int nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        sc.close();
    }
}
