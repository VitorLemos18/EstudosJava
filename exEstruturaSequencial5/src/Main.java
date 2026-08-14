//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int p1, np1, p2, np2;
        double vu1 , vu2;
        p1 = 12;
        np1 = 1;
        p2 = 16;
        np2 = 2;
        vu1 = 5.30;
        vu2 = 5.10;
        double soma ;
        soma = (vu1 * np1) + (vu2 * np2);

        System.out.printf("Valor a pagar: %.2f" , soma);

        p1 = 13;
        np1 = 2;
        p2 = 161;
        np2 = 4;
        vu1 = 15.30;
        vu2 = 5.20;
        soma = (vu1 * np1) + (vu2 * np2);
        System.out.printf("Valor a pagar: %.2f" , soma);

        p1 = 1;
        np1 = 1;
        p2 = 2;
        np2 = 1;
        vu1 = 15.10;
        vu2 = 15.10;
        soma = (vu1 * np1) + (vu2 * np2);
        System.out.printf("Valor a pagar: %.2f" , soma);
    }
}