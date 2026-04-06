// Faça uma função que recebe, por parâmetro um valor N, um valor O e um valor T e calcule e
// escreve a taboada de 1 até T. Mostre a taboada na forma: Onde “N” é o valor de calculo da
// taboada “O” é o operador da tabuada e “T” é o ultimo numero que será realizado a conta da
// tabuada. Exemplo, n = 5, O = “S” e T = 10, irá fazer a tabuada de soma do numero 5 até
// chegar no numero 10.


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);

        int N, T, contador;
        double R;
        String operadorO;

    //inicio

        System.out.println("Quer ver a tabuada de qual número? ");
        N = ler.nextInt();

        System.out.println("Qual número quer que a tabuada pare? ");
        T = ler.nextInt();

        ler.nextLine();

        System.out.println("Insira qual tabuada deseja calcular - (+) Soma, (-) Subtração, (*) Multiplicação, (/) Divisão: ");
        operadorO = ler.nextLine();

        for (contador = 1; contador <= T; contador++) {

            if(operadorO.equals("+")){
                R = N + contador;
            }
            else if (operadorO.equals("_")) {
                R = N - contador;
            }
            else if(operadorO.equals("*")) {
                R = N * contador;
            }
            else {
                R = N / contador;
            }

            System.out.println(N + " " + operadorO + " " + contador + " = " + R);
        }
    }
}
