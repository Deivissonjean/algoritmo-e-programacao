//Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno de 0 a 10 durante
// o semestre. Calcular a soma das notas e sua média (aritmética), informar o nome e sua menção
// aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (média entre 5.1

import java.util.Scanner;

public class ex7mediaescolar
{
    static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);

        Double nota1, nota2, nota3, soma, media;
        String nome;

        //inicio

        System.out.println("Insira o nome ");
        nome = ler.nextLine();

        System.out.println("Insira a primeira nota ");
        nota1 = ler.nextDouble();

        System.out.println("Insira a segunda nota ");
        nota2 = ler.nextDouble();

        System.out.println("Insira a terceira nota ");
        nota3 = ler.nextDouble();

        //calculo

        soma = nota1 + nota2 + nota3;
        media = soma / 3;

        //resultado

        if (media >= 7) {

            System.out.println("O aluno " + nome + " foi aprovado");
        }

        if(media >= 5.1 && media <=6.9) {

            System.out.println("O aluno " + nome + " está em recuperação");
        }

        else if (media <= 5 ){
            System.out.println("O aluno " + nome + " está reprovado");
        }
    }
}