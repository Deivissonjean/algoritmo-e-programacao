//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de
// idade” e “menor de idade” e “idoso”para cada pessoa.Considere a idade a partir de 18 anos
// como maior de idade e idoso a partir de 60 anos.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);

        int idade, cont;

    //inicio

        cont = 0;

        while (cont < 75) {

            System.out.println("digite sua idade ");
            idade = ler.nextInt();

            if (idade <= 17) {

                System.out.println("Você é menor de idade ");
            } else if (idade >= 60) {
                System.out.println("Voce é idoso");
            } else {
                System.out.println("voce é maior de idade ");
            }
            cont++;
        }
    }
}