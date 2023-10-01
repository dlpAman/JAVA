import java.util.Scanner;

public class Question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter the size of the array: ");
        int arr[] = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search for (x): ");
        int x = sc.nextInt();
        int index = search(arr, x);
        if (index != -1) {
            System.out.println("The number " + x + " is found at index " + index);
        } else {
            System.out.println("The number " + " is not found in the array. ");
        }
    }

    private static int search(int[] arr, int x) {
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

}
