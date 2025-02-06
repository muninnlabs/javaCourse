import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos números inteiros você vai digitar? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for(int i=0; i<n; i++){
            if(vet[i] < 0){
                System.out.printf("%d\n", vet[i]);
            }
        }

        sc.close();

    }
}
