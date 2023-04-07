#include <stdio.h>

int main() {
   int n, sum = 0;

   printf("Enter a positive integer n: ");
   scanf("%d", &n);

   for(int i = 1; i <= 2*n-1; i += 2) {
      sum += i;
   }

   printf("The sum of the first %d odd numbers is %d\n", n, sum);

   if(sum == n*n) {
      printf("The sum is equal to n^2, so the statement is true.\n");
   }
   else {
      printf("The sum is not equal to n^2, so the statement is false.\n");
   }

   return 0;
}
