import java.util.Scanner;

public class JavaBasics {
    public static void threeAvrage(int a, int b, int c){
       int avr = (a+b+c)/3;
       System.out.println(avr);
    }
    public static void isEven(int a){
       if(a%2 == 0){
        System.out.println("Number "+a+" is Even");
       } else{
        System.out.println("Number "+a+" is not Even");
       }
     }
     public static void isPalindrome(int num){
        int before = num;
        int after = 0;
        while (num>0) {
          int last = num%10;
          after = (after*10) +last;

          num = num/10;
        }
        if(before == after){
            System.out.println("Number "+ before+ " is Palindrome");
        }
        else{
            System.out.println("Number "+ before+ " is not Palindrome");
        }
     }
     public static void digitSum(int num){
        int before = num;
        int after = 0;
        while (num>0) {
          int last = num%10;
          after = after +last;

          num = num/10;
        }
            System.out.println("Sum of Digite of "+ before+ " is " + after);
     }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String newName = sc.nextLine();
        // System.out.println(newName);

        /*
         * //Revers Number
         * int n = 10899;
         * int rev = 0;
         * 
         * while (n>0) {
         * int lastNum = n%10;
         * rev = (rev*10) + lastNum;
         * 
         * n = n/10;
         * }
         * System.out.println(rev);
         */

        /*
         * // Check if a number is prime or not
         * Scanner sc = new Scanner(System.in);
         * int checkN = sc.nextInt();
         * boolean isPrime = true;
         * 
         * if(checkN == 2){
         * System.out.println(checkN + " is a prime nuber");
         * } else{
         * for(int i=2; i<=Math.sqrt(checkN); i++){
         * if(checkN%i==0){
         * isPrime = false;
         * }
         * }
         * if(isPrime == true){
         * System.out.println(checkN + " is a prime nuber");
         * } else{
         * System.out.println(checkN + " is not a prime nuber");
         * }
         * }
         */

        /* // Reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0,odd = 0;
        while (num>0) {
           int lastNum = num%10;
           if(lastNum%2 == 0){
            even += lastNum;
           } else{
            odd += lastNum;
           }
            num = num/10;
        }
        System.out.println("Total of even is "+even+" and total of odd is "+ odd); */


      /*   // Factorial of number
        Scanner sc = new Scanner(System.in);
        int numF = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=numF; i++){
            fact *= i; 
        }
        System.out.println(fact); */
        // threeAvrage(1,2,3);
        // isEven(40);
        // isPalindrome(1245421);
        digitSum(1145);
    }
}