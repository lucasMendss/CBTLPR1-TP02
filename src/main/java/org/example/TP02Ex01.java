/*
* Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
* Caso contrário solicitar novamente apenas o segundo valor.
*/
package org.example;

public class TP02Ex01 extends Exercicio {

    public static void receberDoisValores(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Informe o 1º valor: ");
        int num1 = scanner.nextInt();

        int num2;
        do{
            System.out.println("Informe um valor maior que " + num1 + ": ");
            num2 = scanner.nextInt();
        } while (num2 < num1);
    }
}
