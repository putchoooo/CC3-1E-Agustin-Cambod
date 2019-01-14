package cc3;
import java.util.Scanner;
public class Mean {
    public static void main(String[] args) {
        userinput();
    }
    static void userinput() {
        boolean next = true;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter how many number of element will you use: ");
                while (!input.hasNextInt()) {
                    input.next();
                    System.out.println("Invalid input. Please try again.");
                    System.out.print("Enter how many number of element will you use: ");
                }
                int el = input.nextInt();
                float[] arr = new float[el];

                for (int c = 0; c < el; c++) {
                    System.out.print("[" + c + "] Enter a number: ");
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("Invalid input. Please try again.");
                        System.out.print("[" + c + "] Enter a number: ");
                    }
                    arr[c] = input.nextInt();
                }

                System.out.print("Average is " + getmean(arr));
                next = false;
            } catch (NegativeArraySizeException e) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (next);
    }
    static float getmean(float arr[]) {
        float mean = 0;
        for (int c = 0; c < arr.length; c++) {
            mean = mean + arr[c];
        }
        mean = mean / arr.length;
        return mean;
    }
}
