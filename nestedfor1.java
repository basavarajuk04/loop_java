package javabasava.looping;
import java.util.Scanner;

public class nestedfor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of i and j: ");
        int k = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.println("arr[i][j]=n*k ");
            }
        }

    }
}
