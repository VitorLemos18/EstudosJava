import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >=6){
            System.out.println("Bom dia");
        } else if (x >= 12) {
            System.out.println("Boa Tarde");
        }else if (x >= 18 && x <= 24){
            System.out.println("Boa NOite");
        }else{
            System.out.println("Boa madrugada");
        }

    }
    }
