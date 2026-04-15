/*
Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar
uma constante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado na própria matriz,
nas posições correspondentes.
 */

package org.example;

public class TP02Ex07 extends Exercicio{

    public static void receberEMultiplicarMatriz3x4(){
        int[][] matriz = new int[3][4];
        int[][] matrizMultiplicada = new int[3][4];

        System.out.println("------------------------------------------------------------------------------------------");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.printf("Digite o valor da posição %d-%d: %n", linha+1, coluna+1);
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println("Digite um número para ser a constante multiplicativa: ");
        int multiplicador = scanner.nextInt();

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                matrizMultiplicada[linha][coluna] = matriz[linha][coluna] * multiplicador;
            }
        }
    }
}
