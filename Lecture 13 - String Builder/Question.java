public class Question {
    public static void main(String args[]) {
        // how to reverse a string
        // hello => olleh
        // Aman => namA
        StringBuilder sb = new StringBuilder("Aman");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // for hello (5-1-0)
            char frontChar = sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
