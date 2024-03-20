package oddoreven;
import java.util.Scanner;

public class Oddeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers:");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ":");
            number[i] = sc.nextInt();
        }
        System.out.println("Result:");
        System.out.println("Even numbers:");
        for (int i = 0; i < size; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i]);
            }
        }
        
        System.out.println("Odd numbers:");
        for (int i = 0; i < size; i++) {
            if (number[i] % 2 != 0) {
                System.out.println(number[i]);
            }
        }
    }
}
