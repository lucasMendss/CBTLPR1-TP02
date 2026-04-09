package org.example;

public class TP02Ex02 extends Exercicio{

    public static void receberDezValores(){
        double maior = 0;
        double soma = 0;
        double media;

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
        System.out.printf("Média: %.2f", media);
    }
}
