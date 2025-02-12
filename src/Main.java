import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the vector: ");
        int n = sc.nextInt();

        int[][] vect = new int[n][n];

        System.out.println("Enter the elements of the vector: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vect[i][j] = sc.nextInt();
            }
        }


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i][i];
        }

        System.out.println("The sum of the main diagonal elements is: " + sum);


        sc.close();
    }
}