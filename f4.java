//write a code to check whether the given number is palindrome or not
import java.util.Scanner;   
class f4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int r, sum = 0, temp;

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }
}