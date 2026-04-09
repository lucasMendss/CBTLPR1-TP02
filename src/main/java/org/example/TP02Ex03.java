package org.example;

public class TP02Ex03 extends Exercicio{

    public static void receberNValores() {
        int maior = 0;
        int menor = 0;
        int soma = 0;
        double qtdePositivos = 0;
        double qtdeNegativos = 0;
        double media;
        int limite;

        do{
            System.out.println("Digite um número entre 1 e 19: ");
            limite = scanner.nextInt();
        } while (limite < 1 || limite > 19);

        for(int i = 1; i <= limite; i++){
            System.out.println("Digite o " + i + "º valor: ");
            int num = scanner.nextInt();

            if(i == 1){
                maior = num;
                menor = num;
            }
            if(num > maior){ maior = num; }
            if(num < menor) { menor = num; }
            if(num > 0) { qtdePositivos++ ; }
            if(num < 0) { qtdeNegativos++ ; }

            soma += num;
        }

        media = soma / limite;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f \n", media);
        System.out.printf("Porcentagem de positivos: %.2f%c \n", (qtdePositivos / limite) * 100, '%');
        System.out.printf("Porcentagem de negativos: %.2f%c \n", (qtdeNegativos / limite) * 100, '%');
    }
}
