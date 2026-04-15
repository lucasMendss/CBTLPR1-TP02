//Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.

package org.example;

public class TP02Ex06 extends Exercicio{

    public static void receberMatrizDeNomes2x3(){
        String[][] nomes = new String[2][3];

        System.out.println("------------------------------------------------------------------------------------------");
        for(int linha = 0; linha < nomes.length; linha++){
            for(int coluna = 0; coluna < nomes[0].length; coluna++){
                System.out.printf("Digite o nome para a posição %d-%d: %n", linha+1, coluna+1);
                nomes[linha][coluna] = scanner.nextLine();
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Nomes: ");
        for(int linha = 0; linha < nomes.length; linha++){
            for(int coluna = 0; coluna < nomes[0].length; coluna++){
                System.out.printf("%d-%d: %s %n", linha+1, coluna+1, nomes[linha][coluna]);
            }
        }
    }

}
