
import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        // Crie um programa que verifique se um candidato está apto a tirar a carteira de
        // motorista do tipo D. Os requisitos são: ter idade maior que 21 anos; estar
        // habilitado pelo menos dois anos com a carteira B ou um ano com a carteira C; não
        // ter nenhuma infração nos últimos doze meses.

        Scanner ler = new Scanner(System.in);

        int idade, tempo, pontos;
        String categoria;

        //inicio

        System.out.print("informe sua idade? ");
        idade = ler.nextInt();

        if (idade <21){
            System.out.println("você nâo está apto a tirar a carteira de categoria D");
            return;
        }
        ler.nextLine();
        System.out.println("Em qual categoria você está habilitado ");
        categoria = ler.nextLine();

        if (categoria.equals("a")||categoria.equals("A")){
            System.out.println("você nâo está apto a tirar a carteira de categoria D");
            return;
        }

        System.out.println("Quanto tempo você está habilitado B ");
        tempo = ler.nextInt();

        if (tempo <2){
            System.out.println("você nâo está apto a tirar a carteira de categoria D");
            return;
        }

        System.out.println("quantas autuações você teve nos ultimos doze mezes ");
        pontos = ler.nextInt();

        if (pontos >0) {

            System.out.println("você nâo está apto a tirar a carteira de categoria D");
            return;

        }
        else if (pontos ==0){
            System.out.println("apto");
        }
    }
}