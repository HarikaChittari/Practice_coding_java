package PatternProblems;

import java.util.Scanner;

public class Rectangle_pattern {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int b = sc.nextInt();
        for( int j = 1; j <=l; j++) {
            for (int i = 1; i <= b; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
