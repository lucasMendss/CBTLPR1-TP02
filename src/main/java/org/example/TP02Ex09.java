/*
Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, sendo que no máximo 10x10.
A matriz não precisa ser quadrática. Após a digitação dos elementos, calcular e exibir a matriz transposta.
 */

package org.example;

public class TP02Ex09 extends Exercicio{

    public static void receberMatrizEExibirTransposta(){

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("Digite o número de linhas (M) [1-10]: ");
        int m = scanner.nextInt();
        System.out.print("Digite o número de colunas (N) [1-10]: ");
        int n = scanner.nextInt();
        
        if (m < 1 || m > 10 || n < 1 || n > 10) {
            System.out.println("Ordem inválida. Use valores entre 1 e 10.");
            return;
        }

        double[][] matriz = new double[m][n];
        double[][] transposta = new double[n][m];
        int c = 1;

        System.out.println("Digite " + (m * n) + " valores:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c + "° valor: ");
                matriz[i][j] = scanner.nextDouble();
                c++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nValores originais:");
        imprimirMatriz(matriz);
        System.out.println("\nMatriz transposta:");
        imprimirMatriz(transposta);

    }

    private static void imprimirMatriz(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%10.2f", m[i][j]);
            }
            System.out.println();
        }
    }
}




