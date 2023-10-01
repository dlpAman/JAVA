import java.util.Scanner;

public class Bitmanipulation {
    public static void main(String args[]) {

        // get bit

        // Question => get the 3rd bit (position = 2) of a number n.(n=0101)
        // int n =5;
        // int pos = 3;
        // int bitMask = 1<<pos;
        // if((bitMask & n)==0){
        // System.out.println("bit was zero");
        // }
        // else{
        // System.out.println("bit was one");
        // }

        // Set bit

        // Question => set the 2nd bit (position =1) of a number n. (n =0101)

        // int n =5;
        // int pos = 1;
        // int bitMask = 1<<pos;
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // Clear Bit

        // Question => Clear the 3rd bit (position = 2) of a number n(n=0101)
        // int n=5;
        // int pos = 2;
        // int bitMask =1<<pos;
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask &n;
        // System.out.println(newNumber);

        // Update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask | n;
            System.out.println(newNumber);
        }
    }
}