import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        double montoprestamo, interesmensual, pagomensual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME MONTO DEL PRESTAMO: ");
        montoprestamo = teclado.nextDouble();
        System.out.print("DAME INTERES MENSUAL: ");
        interesmensual = teclado.nextDouble();
        pagomensual = (montoprestamo/12) + interesmensual;
        System.out.println("Pango mensual del prestamo a un año es = " + pagomensual);
    }
}
