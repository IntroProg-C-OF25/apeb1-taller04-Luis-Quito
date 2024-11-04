import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        double gastohijo1, gastohijo2, gastohijo3, gastoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME GASTO HIJO 1: ");
        gastohijo1 = teclado.nextDouble();
        System.out.print("DAME GASTO HIJO 2: ");
        gastohijo2 = teclado.nextDouble();
        System.out.print("DAME GASTO HIJO 3: ");
        gastohijo3 = teclado.nextDouble();
        gastoTotal = (gastohijo1 + gastohijo2 + gastohijo3);
        System.out.println("Gasto total de los hijos es = " + gastoTotal);
    }
}
