import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME LA BASE: ");
        base = teclado.nextDouble();
        System.out.print("DAME LA ALTURA: ");
        altura = teclado.nextDouble();
        area = (base * altura) / 2;
        System.out.println("Area del triangulo es = " + area);
    }
}
