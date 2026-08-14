//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double pi = 3.14159;
        double raio = 2;
        double area = pi * (raio * raio);

        System.out.println("A= " + area);


        raio = 100.64;
        area = pi * (raio * raio);
        System.out.println("A= " + area);

        raio = 150;
        area = pi * (raio * raio);
        System.out.println("A= " + area);
    }
}