import java.util.Scanner;
/**
 * HW3 - due 04.27.2024
 * Write a recursive method to form the sum of two positive integers a and b.
 * Test your program by calling it from a main program that reads two integers from the keyboard and uses your method to complete and print their sum, along with two numbers.
 * (The output must be exactly same as shown in the example.)
 * Call your method: RecSum
 * Input:
 *   Please enter first number: 4
 *   Please enter second number: 9
 * OUTPUT:
 *   From start of body : 4   9
 *   From start of body : 3   9
 *   From start of body : 2   9
 *   From start of body : 1   9
 *   From start of body : 0   9
 *   From end of body :   1   9
 *   From end of body :   2   9
 *   From end of body :   3   9
 *   From end of body :   4   9
 *
 *   The sum of 4  and  9  is 13
 */
public class hw3
{
    public static void main(String[] args) {
        int num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Please enter second number: ");
        num2 = scan.nextInt();

        RecSum(num1,num2);
    }
    public static void RecSum(int a, int b)
    {
        System.out.println();
        descending(a,b);
        System.out.println();
        ascending(a,b,1);
        System.out.println();

        System.out.println("The sum of " + a + " and " + b + " is " + (a+b));

    }
    public static void descending(int a, int b)
    {
        if (a >= 0)
        {
            System.out.println("From start of body :  " + a + " " + b);
            descending((a-1),b);
        }

    }
    public static void ascending(int a, int b,int count)
    {
        if (count > a) // Base case
            return;
        else {
            System.out.println("From end of body :  " + count + " " + b);
            ascending(a,b, count + 1);
        }
    }
}

