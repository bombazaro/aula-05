package ads.poo;

import java.util.Scanner;

public class App {
    // Cria uma matriz identidade de tamanho n1 x n1, onde n1 é um número entre 3 e 10
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;

        do {
            System.out.print("Insira um número entre 3 e 10 para a matriz identidade: ");
            n1 = entrada.nextInt();

        }while(n1<3 || n1>10);

        int[][] matriz = new int[n1][n1];

            for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println();
        }
        entrada.close();
    }
}