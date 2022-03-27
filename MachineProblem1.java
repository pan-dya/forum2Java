import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of items: ");
        int NUM_ITEMS = input.nextInt();
        int[] array = new int[NUM_ITEMS];
        System.out.print("Enter each value of items (space in between each values):");
        for (int i = 0; i < NUM_ITEMS; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("The values are: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i+1 < array.length) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
