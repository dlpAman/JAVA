import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {

        //  **STRINGS ARE IMMUTABLE**

        // declaration

        // String name = "Aman";
        // String fullName = "Aman Prajapati";
        // String sentence = "My name is Aman Prajapati";

        // first program

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is: "+ name);

        // first function program

        // 1st function = concatenation => joining two strings

        // String firstname = "Aman";
        // String lastName = "Prajapati";
        // String fullName = firstname + " " + lastName;
        // System.out.println(fullName);

        // 2nd function print length of string

        // System.out.println(fullName.length());

        //3rd function - charAt means Access characters of string

        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }


        // 4th FUNCTION .compareto  -- COMPARISON BETWEEN TWO STRINGS 

        // String name1 = "Tony";
        // String name2 = "Tony";

        // if(name1.compareTo(name2)==0){

        //     //isme 3 case check honge 
        //     //1st s1>s2  : function return karega +ve value
        //     //2nd s1==s2 : function return karega 0
        //     //3rd s1<s2 : function return karega -ve value
        //     System.out.println("Strings are Equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }


        //subString yani kisi string ka chhota part 

        // String sentence = "My name is Tony Stark";
        // String name = sentence.substring(0,sentence.length());
        // System.out.println(name);

        // PARSEINT METHOD OF INTEGER CLASS 
        String str ="123";
        int number = Integer.parseInt(str);
        System.out.println(number);

    }
}