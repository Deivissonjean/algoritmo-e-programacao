//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.A fórmula
// de conversão é: F=(9*C+160) 5, sendo F a temperatura em Fahrenheit e C atemperatura em
// Celsius.


import java.util.Scanner;

public class ex2conversordetemperatura
{
    static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        double F, C;

        //inicio

        System.out.println("Digite uma temperatura em Celsius: ");
        C = ler.nextDouble();

        //calculo

        F = (9*C+160) / 5;

        //ressultado

        System.out.println("A temperatura em  Fahrenheit é de " + F );
    }

}