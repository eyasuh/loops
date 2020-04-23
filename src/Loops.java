import java.util.Scanner;

public class Loops {
    public static void main (String [] args) {
        //1 Write a program that prints the numbers 1-10.
        for(int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.print("\nA\n");
        //2 Write a program that prints the numbers 1-10 backwards.
        for(int i = 10; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.print("\nB\n");
        //3Write a program that prints all the odd numbers from 1-20.
        for(int i = 1; i <= 20; i++) {
            if (i%2 > 0 )
            System.out.print(i);
        }
        System.out.print("\nC\n");
        //4 Write a program that prints all the even numbers from 1-20.
        for(int i = 1; i <= 20; i++) {
            if (i%2 == 0 )
                System.out.print(i);
        }
        System.out.print("\nD\n");
        //5 Have the user input a number and print all numbers from that input value to 1.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = num; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.print("\nE\n");
        //6 Sum all values from 1-10.
        int sum  = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        } System.out.print(sum);
        System.out.print("\nF\n");
        //7Have the user enter a number and print the sum of all numbers from that inputted value to 1.
        in.nextLine();
        num = in.nextInt();
        sum = 0;
        for(int i = num; i >= 1; i--) {
            sum += i;
        } System.out.print(sum);
        System.out.print("\nG\n");
        //8 i
        for(int i = 1; i < 5; i++) {
            System.out.println("*******");
        }
        // ii
        System.out.print("\nG ii\n");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //iii
        System.out.print("\nG iii\n");
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // 8 factorial number
        num = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


    }
}
