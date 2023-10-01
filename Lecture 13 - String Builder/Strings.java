public class Strings{
    public static void main(String args[]){
        // STRING BUILDER ARE USED TO MODIFY THE STRINGS 
        // STRINGS ARE IMMUTABLE IN JAVA

        // STRING BUILDER - declaration 
    //     StringBuilder sb =  new StringBuilder("Aman");
    //     System.out.println(sb);
    //     //print character at index 0
    //     System.out.println(sb.charAt(0));

    //     // set char at index 

    //   sb.setCharAt(0, 'N');
    //   System.out.println(sb);

    //   // adding character at any index

    //   sb.insert(2,'S');
    //   System.out.println(sb);

    //   // delete the extra 'S'

    //   sb.delete(2, 3);
    //   System.out.println(sb);

    //   // replacing char 

    //   sb.setCharAt(0, 'A');
    //   System.out.println(sb);


    // adding character at the end

    StringBuilder sb = new StringBuilder("h");
    sb.append("e");
    sb.append("l");
    sb.append("l");
    sb.append("o");
    System.out.println(sb.length());

     }
}