package ads.poo;

import java.util.Scanner;

public class App {

    //public static void main(String[] args) {
    //int[][] matriz = new int[3][3];

    //matriz[0][0] = 1;
    // TODO usar o tamanho da matriz e não estático
    //for (int i = 0; i < 3; i++) {
    //for (int j = 0; j < 3; j++) {
    //  System.out.printf(matriz[i][j] + " ");
    // }
    // System.out.println();
    //  }
    //}
//}

//matriz quadrada min 3 max 10. gerar a matriz identidade na tela

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;

        do {
            System.out.print("Insira uma número entre 3 e 10: ");
            n1 = entrada.nextInt();
        }while(n1<3 || n1>10);

        int[][] matriz = new int[n1][n1];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(matriz[i][j] + " ");
            }
        }
    }

}