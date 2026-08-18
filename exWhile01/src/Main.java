import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Senha invalida");
            senha = sc.nextInt();

        }
        sc.close();
        System.out.println("Acesso Permitido");
    }
}