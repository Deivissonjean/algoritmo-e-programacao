//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
// distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e
// depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do
// distribuidor seja de 28% e os impostos 45%. Escrever um algoritmo que leia o custo de
// fábrica de um carro e informe o custo ao consumidor do mesmo.

import java.util.Scanner;

public class ex5juroscarro
{
    static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);

        Double custoF, custoC, imposto;

        //inicio

        System.out.println("Me fale qual o valor de fabrica do seu carro: ");
        custoF = ler.nextDouble();

        //calculando

        imposto = (custoF * 0.45)+ custoF;
        custoC = (imposto * 0.28) + imposto;

        //resultado

        System.out.println("O custo ao consumidor do carro é: R$ " + custoC);

    }
}