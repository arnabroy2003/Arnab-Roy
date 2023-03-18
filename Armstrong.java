import java.util.Scanner;

public class Armstrong{

    public static void main(String[] args) {

        int num, originalNumber, remainder, result = 0, n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        num = scanner.nextInt();
        scanner.close();

        originalNumber = num;

        // count number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = num;

        // check if the number is Armstrong
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
