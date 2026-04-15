/*
Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10
e quadrática. Após a digitação dos elementos, calcular e exibir determinante da matriz.
 */

package org.example;

public class TP02Ex11 extends Exercicio{
    public static void receberMatrizECalcularDeterminante() {

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("Digite a ordem da matriz quadrada (1-10): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Ordem inválida. Use valores entre 1 e 10.");
            return;
        }

        double[][] matriz = new double[n][n];
        int c = 1;

        System.out.println("Digite " + (n * n) + " valores:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c + "° valor: ");
                matriz[i][j] = scanner.nextDouble();
                c++;
            }
        }

        double det = calcularDeterminante(matriz);

        System.out.println("\nValores originais:");
        imprimirMatriz(matriz);
        System.out.printf("\nDeterminante: %.2f\n", det);

    }

    private static double calcularDeterminante(double[][] m) {
        int n = m.length;
        if (n == 1) return m[0][0];
        if (n == 2) return m[0][0] * m[1][1] - m[0][1] * m[1][0];
        double det = 0;
        for (int j = 0; j < n; j++) {
            double[][] sub = new double[n-1][n-1];
            for (int i = 1; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    if (k < j) sub[i-1][k] = m[i][k];
                    else if (k > j) sub[i-1][k-1] = m[i][k];
                }
            }
            det += Math.pow(-1, j) * m[0][j] * calcularDeterminante(sub);
        }
        return det;
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
