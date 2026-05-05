package Java_Lista_9_Array;

import java.util.Scanner;

public class _atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {10, 25, 30, 45, 50};
        boolean found = false;

        System.out.print("Digite um número para buscar: (ps: Existem apenas os números 10, 25, 30, 45, 50 armazenados no programa)");
        int target = sc.nextInt();

        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("O número "+target+" está no vetor!");
        } else {
            System.out.println("Número não encontrado.");
        }
    }
}
