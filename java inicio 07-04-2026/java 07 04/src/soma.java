
import java.util.Scanner;

public class soma {
    public static void main(String[] args)

    {
        Scanner leia = new Scanner(System.in);

        //Variáveis

        float numeroUm, numeroDois, resultado;

        //Recebimento de dados

        System.out.print("Insira o primeiro número: ");
        numeroUm = leia.nextFloat();

        System.out.print("Insira o Segundo número: ");
        numeroDois = leia.nextFloat();

        //Resultado

        resultado = numeroUm + numeroDois;
        System.out.print("O resultado da soma entre os números é: " + resultado);

    }
}