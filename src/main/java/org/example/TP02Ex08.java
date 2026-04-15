package org.example;

public class TP02Ex08 extends Exercicio{

  public static void main(String[] args) {
    double[][] matriz = new double[3][4];
    double[][] resultado = new double[3][4];
    int c = 1;

    System.out.println("Digite 12 valores: ");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(c + "° valor: ");
        matriz[i][j] = scanner.nextDouble();
        c++;
      }
    }

    System.out.print("Digite a constante multiplicativa: ");
    double constante = scanner.nextDouble();

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        resultado[i][j] = matriz[i][j] * constante;
      }
    }

    System.out.println("\nValores originais:");
    imprimirMatriz(matriz);
    System.out.println("\nValores resultantes:");
    imprimirMatriz(resultado);

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

