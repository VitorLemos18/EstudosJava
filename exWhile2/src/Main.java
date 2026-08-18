import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        /* At 01
        String senha = sc.next();
        // sempre que for fazer a diferença entre strings usar equals
        while(!senha.equals("java123")){
            System.out.println("Senha invalida");
            senha = sc.next();
        }
        System.out.println("Acesso consedido");
        sc.close();
        */
        /* At 02
        System.out.println("[1]Ver saldo \n[2]Fazer pix \n[3]Sair");
        int op = sc.nextInt();
        while(op != 3){
            if (op == 1){
                System.out.println("Seu saldo é R$ 0,00");
                op = sc.nextInt();
            }else if(op == 2){
                System.out.println("PIX realizado com sucesso");
                op = sc.nextInt();
            }else{
                System.out.println("Opção inválida, tente novamente.");
            }
            System.out.println("\n[1]Ver saldo \n[2]Fazer pix \n[3]Sair");
            op = sc.nextInt();
        }
        sc.close();
        System.out.println("[1]Ver saldo \n[2]Fazer pix \n[3]Sair");
    */
        String item = sc.next();
        while(!item.equals("chega")){
            System.out.println("Digite o nome do item");
            item = sc.next();
        }
        System.out.println("Mala fechada. Boa viagem!");


    }

}