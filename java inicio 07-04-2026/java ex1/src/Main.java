//  Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a
//   distância total percorrida pelo automóvel e o total de combustível gasto.


import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        Double distancia, combustivel, consumo;

    //inicio do algoritmo

        System.out.println("Insira a distância total percorrida: ");
        distancia = ler.nextDouble();

        System.out.println("Insira o total de combustível gasto: ");
        combustivel = ler.nextDouble();

    //calculo

        consumo = distancia / combustivel;

    //resultado

        System.out.println("O consumo médio do automóvel é: " + consumo + " km/l");

    }
}