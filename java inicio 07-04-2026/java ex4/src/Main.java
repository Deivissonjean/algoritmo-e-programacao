//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após
// um mês. ● Considere fixo o juro da poupança em 0,70% a. m.

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        Double valorD, resultado;

    //inicio

        System.out.println("Quanto você tem de saldo na poupança? ");
        valorD = ler.nextDouble();

    //calculo

        resultado = (valorD * 0.007)+valorD;

    //resultado

        System.out.println("O valor total com juros é: " + resultado);

    }
}