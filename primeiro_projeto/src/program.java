import java.util.Locale;

public class program {
    public static void main(String[] args){
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.printf("%.5f%n", x);
        System.out.println("Resultado é: " + x +"METROS");
        System.out.printf("Resultado é: %.2f metros%n", x );
        String nome = "Maria";
        int idade = 18;
        double renda = 1.875;
        System.out.printf("%s tem %d anos e ganha R$ %.2f", nome,idade,renda);
    }

}
