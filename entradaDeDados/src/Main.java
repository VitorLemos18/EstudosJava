import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String x;
        //int i;
        //char g;

        // Avisa que quer o nome ANTES de ler
        //System.out.println("Digite seu primeiro nome:");
        //x = sc.next(); // Atenção: digite apenas um nome (sem espaço)

        // Avisa que quer a idade ANTES de ler
        //System.out.println("Digite sua idade:");
       // i = sc.nextInt();

        //System.out.println("Digite seu Sexo (M ou F):");
        //g = sc.next().charAt(0);

        //System.out.printf("Meu nome é %s, sou do sexo %c minha idade é %d\n", x, g, i);

        int x;
        String s1,s2,s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




        sc.close();
    }
}