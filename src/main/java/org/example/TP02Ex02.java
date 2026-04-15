/*
Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro,
se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
 */
package org.example;

public class TP02Ex02 extends Exercicio{

    public static void receberDezValores(){
        double maior = 0;
        double soma = 0;
        double media;

        System.out.println("------------------------------------------------------------------------------------------");
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º valor: ");
            double num = scanner.nextDouble();

            if(i == 0){
                maior = num;
            }

            if(num > maior){
                maior = num;
            }

            soma = soma + num;
        }

        media = soma / 10;
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f %n", media);
    }
}
