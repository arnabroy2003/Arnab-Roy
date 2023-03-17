import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        // Reverse the number
        int reverse = 0;
        int originalNum = num;
        while (originalNum != 0) {
            int digit = originalNum % 10;
            reverse = reverse * 10 + digit;
            originalNum /= 10;
        }
        
        // Check if the number is a palindrome
        if (num == reverse) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

}
