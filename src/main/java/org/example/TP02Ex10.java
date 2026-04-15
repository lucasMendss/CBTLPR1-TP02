/*
Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de
ordem 10 e quadrática. Após a digitação dos elementos, calcular e exibir a matriz inversa. Exibir as matrizes
na tela, sob a forma matricial (linhas x colunas).
 */

package org.example;

public class TP02Ex10 extends Exercicio{

    public static void receberMatrizECalcularInversa() {
        while (true) {
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.print("Digite a ordem da matriz quadrada (1-10): ");
            int n = scanner.nextInt();

            if (n < 1 || n > 10) {
                System.out.println("Ordem inválida. Use valores entre 1 e 10.");
                continue;
            }

            double[][] matriz = new double[n][n];
            double[][] inversa = new double[n][n];
            int c = 1;

            System.out.println("Digite " + (n * n) + " valores:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c + "° valor: ");
                    matriz[i][j] = scanner.nextDouble();
                    c++;
                }
            }

            if (!calcularInversa(matriz, inversa)) {
                System.out.println("\nMatriz singular. Tente novamente com outra matriz.");
                continue;
            }

            System.out.println("\nValores originais:");
            imprimirMatriz(matriz);
            System.out.println("\nMatriz inversa:");
            imprimirMatriz(inversa);
            break;
        }

    }

    private static boolean calcularInversa(double[][] a, double[][] inv) {
        int n = a.length;
        double[][] mat = new double[n][2 * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = a[i][j];
            }
            mat[i][n + i] = 1.0;
        }

        for (int i = 0; i < n; i++) {
            int pivot = i;
            double max = Math.abs(mat[i][i]);
            for (int k = i + 1; k < n; k++) {
                double value = Math.abs(mat[k][i]);
                if (value > max) {
                    max = value;
                    pivot = k;
                }
            }

            if (Math.abs(mat[pivot][i]) < 1e-12) {
                return false;
            }

            if (pivot != i) {
                double[] temp = mat[i];
                mat[i] = mat[pivot];
                mat[pivot] = temp;
            }

            double diag = mat[i][i];
            for (int j = 0; j < 2 * n; j++) {
                mat[i][j] /= diag;
            }

            for (int k = 0; k < n; k++) {
                if (k == i) {
                    continue;
                }
                double factor = mat[k][i];
                for (int j = i; j < 2 * n; j++) {
                    mat[k][j] -= factor * mat[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inv[i][j] = mat[i][n + j];
            }
        }

        return true;
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

