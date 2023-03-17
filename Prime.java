public class Prime {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        System.out.println("Prime numbers between 1 to 100 are:");

        // Loop through all numbers between 1 and 100
        for (i = 2; i <= 100; i++) {
            isPrime = true;

            // Check if current number is prime
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If number is prime, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
