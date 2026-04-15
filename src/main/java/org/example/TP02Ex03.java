/*
Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado,
deverá ser positivo, porém menor que vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de erro
e solicitar o valor novamente. Após a digitação dos “N” valores, exibir:
    a. O maior valor;
    b. O menor valor;
    c. A soma dos valores;
    d. A média aritmética dos valores;
    e. A porcentagem de valores que são positivos;
    f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do programa. Consistir a resposta
no sentido de aceitar somente “S” ou “N” e encerrar o programa em função dessa resposta.
 */

package org.example;

public class TP02Ex03 extends Exercicio{

    public static void receberNValores() {

        char escolha;
        do {
            int maior = 0;
            int menor = 0;
            int soma = 0;
            double qtdePositivos = 0;
            double qtdeNegativos = 0;
            double media;
            int limite;

            System.out.println("------------------------------------------------------------------------------------------");

            do {
                System.out.println("Digite um número entre 1 e 19: ");
                limite = scanner.nextInt();
            } while (limite < 1 || limite > 19);

            for (int i = 1; i <= limite; i++) {
                System.out.println("Digite o " + i + "º valor: ");
                int num = scanner.nextInt();

                if (i == 1) {
                    maior = num;
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
                if (num > 0) {
                    qtdePositivos++;
                }
                if (num < 0) {
                    qtdeNegativos++;
                }

                soma += num;
            }

            media = (double) soma / limite;
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Soma: " + soma);
            System.out.printf("Média: %.2f \n", media);
            System.out.printf("Porcentagem de positivos: %.2f%c \n", (qtdePositivos / limite) * 100, '%');
            System.out.printf("Porcentagem de negativos: %.2f%c \n", (qtdeNegativos / limite) * 100, '%');

            do {
                System.out.println("Deseja executar esse programa novamente? (s/n):");
                escolha = scanner.next().toLowerCase().charAt(0);

                if(escolha != 's' && escolha != 'n'){
                    System.out.println("Não entendi. Digite 's' ou 'n'.");
                }
            }while (escolha != 's' && escolha != 'n');

        }while(escolha != 'n');
    }
}
