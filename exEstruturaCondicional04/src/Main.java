import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();

        if (h1 > h2){
            int soma = (24 - h1) + h2;
            System.out.println("O JOGO DUROU " + soma + " Hora(S)");
        }else{
            int soma = h2 - h1;
            System.out.println("O JOGO DUROU " + soma + " Hora(S)");
        }

    }
}