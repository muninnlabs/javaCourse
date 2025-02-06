import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vetA = new double[n];
        double[] vetB = new double[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite os valores para A: ");
            vetA[i] = sc.nextDouble();
        }

        for(int i=0; i<n; i++){
            System.out.print("Digite os valores para B: ");
            vetB[i] = sc.nextDouble();
        }

        System.out.print("Vetores resultantes: ");

        for(int i=0; i<n; i++){
            System.out.printf(" %.1f", vetA[i]+vetB[i]);
        }

        sc.close();
    }
}
