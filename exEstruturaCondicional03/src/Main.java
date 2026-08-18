import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();



        if (a % b == 0 || b % a ==0){
            System.out.println("São Multiplos");
        }else{
            System.out.println("Não são multiplos");
        }
    }
}