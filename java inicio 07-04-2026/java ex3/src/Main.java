//Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um
// valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e
// também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);

        Double valorDolar, dolarDisp, valorConv;

    //inicio

        System.out.println("Qual a cotação do dólar hoje? ");
        valorDolar = ler.nextDouble();

        System.out.println("Qual a quantidade de dólares você tem disponível? ");
        dolarDisp = ler.nextDouble();

    //calculo

        valorConv = valorDolar * dolarDisp;

    //resultado

        System.out.println("O Valor da conversão em real (R$) do valor informado em dólar (US$) é de: R$ " + valorConv);

    }
}