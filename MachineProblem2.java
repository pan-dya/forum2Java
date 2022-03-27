import java.util.Scanner;

public class PrintArrayInStars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items:");
        int NUM_ITEMS = input.nextInt();
        int []array = new int[NUM_ITEMS];
        System.out.print("Enter the values of all items (space in between each values): ");
        for (int i=0; i < NUM_ITEMS; i++){
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            System.out.printf("%d: ",i);
            System.out.printf("*".repeat(array[i]));
            System.out.printf("(%d)\n",array[i]);
        }
    }
}
