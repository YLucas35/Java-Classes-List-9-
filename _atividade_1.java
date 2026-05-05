package Java_Lista_9_Array;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[5];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        sc.close();
    }
}