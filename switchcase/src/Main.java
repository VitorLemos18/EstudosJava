import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();



        switch (dia){
            case 1:
                System.out.println("Bom dia");
                break;
            case 2:
                System.out.println("Boa Tarde");
                break;
            case 3:
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("INVALIDO");
                break;
        }
    }
}