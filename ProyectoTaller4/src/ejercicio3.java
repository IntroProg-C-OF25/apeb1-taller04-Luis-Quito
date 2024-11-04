import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        int numeromultiplicativo; 
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME UN NUMERO ENTRE 2 Y 6: ");
        numeromultiplicativo = teclado.nextInt();
        if (numeromultiplicativo >= 2 && numeromultiplicativo <= 6) {
            System.out.println("Tabla de multiplicar del: " + numeromultiplicativo + " : ");
        for (int n = 1; n <= 10; n++) {
            System.out.println(numeromultiplicativo + "*" + n + "=" + (numeromultiplicativo * n));
        }
        } else {
            System.out.println("No se puede realizar esta tabla de multiplicar");
        }
    }
}
