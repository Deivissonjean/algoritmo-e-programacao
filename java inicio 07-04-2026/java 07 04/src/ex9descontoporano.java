//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
// Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente
// de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2010 -
// 12% e acima de 2010 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto
// até que a resposta digite: “(N) Não” . Informar total de carros com ano até 2010 e total
// geral.

import java.util.Scanner;

public class ex9descontoporano {
    public static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);

        double desconto, valorCarro, valorFinal;
        int totalCarros, totalAte2010, anoCarro;
        String verif;
        //inicio

        totalCarros = 0;
        totalAte2010 = 0;

        verif = "S";

        while (verif.equalsIgnoreCase("S")){
            System.out.println("Qual o valor do carro: ");
            valorCarro = ler.nextDouble();

            System.out.println("Qual o ano do carro (yyyy): ");
            anoCarro = ler.nextInt();

            if (anoCarro <= 2010) {
                desconto = valorCarro * 0.12;
                totalAte2010 =totalAte2010 + 1;
            }
            else
                desconto = valorCarro * 0.07;


            valorFinal = valorCarro - desconto;

            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor final: R$ " + valorFinal);

            totalCarros = totalCarros + 1;

            System.out.println("Deseja continuar? (S/N): ");
            verif = ler.next();

        }
        System.out.println("Total de carros: " + totalCarros);
        System.out.println(" Carros até 2010: " + totalAte2010);

    }
}