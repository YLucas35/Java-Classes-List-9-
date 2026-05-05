package Java_Lista_9_Array;

public class _atividade_5 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        System.out.println("Vetor na ordem inversa:");

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
