package org.example;

public class TP02Ex05 extends Exercicio{

    public static void receberMatriz3x2(){
        int[][] matriz = new int[3][2];

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.printf("Digite o valor da posição %d-%d: %n", linha+1, coluna+1);
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Matriz 3x2: ");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.printf("%d-%d: %d %n", linha+1, coluna+1, matriz[linha][coluna]);
            }
        }
    }
}
