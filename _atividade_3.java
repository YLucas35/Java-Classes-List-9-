package Java_Lista_9_Array;

import java.util.Scanner;

public class _atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[5];

        System.out.println("Digite 5 números, e eu mostrarei qual deles é o maior ou o menor entre eles");

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vect[i] = sc.nextInt();
        }

        int maior = vect[0];
        int menor = vect[0];

        for (int i = 1; i < vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
            }
            if (vect[i] < menor) {
                menor = vect[i];
            }
        }

        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);

        sc.close();
    }
}
