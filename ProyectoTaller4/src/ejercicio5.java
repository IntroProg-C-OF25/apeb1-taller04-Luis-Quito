import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        double costoCPU, costoteclado, costopantalla, costoraton, CostoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME COSTO CPU: ");
        costoCPU = teclado.nextDouble();
        System.out.print("DAME COSTO TECLADO: ");
        costoteclado = teclado.nextDouble();
        System.out.print("DAME COSTO PANTALLA: ");
        costopantalla = teclado.nextDouble();
        System.out.print("DAME COSTO RATON: ");
        costoraton = teclado.nextDouble();
        CostoTotal = (costoCPU + costoteclado + costopantalla + costoraton);
        System.out.println("Costo total de la computadora es = " + CostoTotal);
    }
}
