import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        double preciokilovatioporhora, kilovatiosconsumidos, edad, totalplanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME EL COSTO DEL KILOVATIO/HORA: ");
        preciokilovatioporhora = teclado.nextDouble();
        System.out.print("DAME NUMERO DE KILOVATIOS CONSUMIDOS EN EL MES: ");
        kilovatiosconsumidos = teclado.nextDouble();
        System.out.print("INGRESE SU EDAD: ");
        edad = teclado.nextDouble();
        if (edad >= 65)
            System.out.println("SE DESCUENTA EL 10%");
        else
            System.out.println("NO SE DESCUENTA");
        if (edad >= 65)
            totalplanilla = (preciokilovatioporhora * kilovatiosconsumidos) * 0.90;
        else
            totalplanilla = (preciokilovatioporhora * kilovatiosconsumidos);
        System.out.println("Valor a cancelar de la planilla de luz es = " + totalplanilla);
                }
}
