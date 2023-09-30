import java.util.Scanner;

public class Question5 {
    public static boolean  VotingEligibility(int age){
        return age>18;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        boolean eligibility = VotingEligibility(age);
        if(eligibility){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("you are a child");
        }
    }
}
