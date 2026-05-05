package Java_Lista_9_Array;

import java.util.Scanner;

public class _atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir no vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        System.out.println("A soma de todos os elementos é: "+sum);

        sc.close();
    }
}
