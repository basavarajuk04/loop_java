package javabasava.looping;
import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x value");
        int x = sc.nextInt();
        System.out.println("Enter the sum value");
        int sum = sc.nextInt();
        while (x <= 10) {
            sum = sum + x;
            x++;
            System.out.println("summation:" + sum);
        }

    }

}

