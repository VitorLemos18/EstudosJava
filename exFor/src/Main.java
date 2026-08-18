import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int n = 0;
        for (int i = 10; i > n; i--) {
            System.out.println("Faltam " + i + " segundos...");
        }
        System.out.println("DECOLAR \uD83D\uDE80");

        */


        System.out.println("Digite uma frase");
        String frase = sc.nextLine();
        int qVezes = 10;
        System.out.println("Você deve escrever essa frase " + qVezes + " Vezes");
        for (int i = 1; i <= qVezes; i++) {
            System.out.println("escreveu: " + frase + i + " Vezes " );
        }
        sc.close();


        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresso VIP nº "+ i + " impresso!");
        }
    }
}