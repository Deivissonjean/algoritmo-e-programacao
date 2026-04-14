//Escrever um algoritmo que leia dois valores distintos inteiros e informe qual é o maior e
// diga se este número maior está no intervalo entre 1 a 99 100 e 199 ou maior que 200.

import java.util.Scanner;

public class ex6maiorvalor
{
    public static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);

        int  numero1, numero2, maior;

        //inicio

        System.out.println("Digite um número inteiro positivo: ");
        numero1 = ler.nextInt();

        System.out.println("Digite outro número inteiro positivo: ");
        numero2 = ler.nextInt();

        //Processamento

        if (numero1 > numero2) {

            System.out.println("O primeiro número é o maior: " +numero1);
            maior = numero1;
        }

        if(numero2 > numero1) {
            System.out.println("O segundo número é o maior: " + numero2);
            maior = numero2;
        }

        else {
            System.out.println("Os números são iguais: " + numero1);
            maior = numero1;
        }

        if (maior < 100 && maior > 0) {
            System.out.println(" Está no intervalo entre 1 a 99");
        }

        if (maior >= 100 && maior < 200){

            System.out.println(" Está no intervalo entre 100 e 199");
        }

        else System.out.println("Está no intervalo maior que 200");

    }
}