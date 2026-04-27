import java.util.Scanner;
    public class ques3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();

        int temp = num;

        // Convert to Binary
        String binary = "";
        while (temp > 0) {
            int rem = temp % 2;
            binary = rem + binary;
            temp = temp / 2;
        }

        // Convert to Hexadecimal
        temp = num;
        String hex = "";
        while (temp > 0) {
            int rem = temp % 16;

            if (rem < 10)
                hex = rem + hex;
            else
                hex = (char)(rem + 55) + hex; // 10->A, 11->B ...

            temp = temp / 16;
        }

        System.out.println("\nBinary: " + binary);
        System.out.println("Hexadecimal: " + hex);

        sc.close();
    }
}

