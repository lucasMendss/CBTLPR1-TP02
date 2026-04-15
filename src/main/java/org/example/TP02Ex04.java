//Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.

package org.example;

public class TP02Ex04 extends Exercicio{

    public static void receberMatriz2x3(){
        int[][] matriz = new int[2][3];

        System.out.println("------------------------------------------------------------------------------------------");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.printf("Digite o valor da posição %d-%d: %n", linha+1, coluna+1);
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Matriz 2x3: ");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.printf("%d-%d: %d %n", linha+1, coluna+1, matriz[linha][coluna]);
            }
        }
    }
}
