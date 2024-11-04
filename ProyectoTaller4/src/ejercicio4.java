import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        double costoMinuto, cantidadMinutos, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME COSTO POR MINUTO: ");
        costoMinuto = teclado.nextDouble();
        System.out.print("DAME LA CANTIDAD DE MINUTOS: ");
        cantidadMinutos = teclado.nextDouble();
        valorPlanilla = cantidadMinutos * cantidadMinutos;
        System.out.println("Valor de la planilla telefonica es: " + valorPlanilla);
    }
}
