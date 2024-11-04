import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        double precionetflix, precioyoutubepremium, preciodropbox, preciospotify, edad, totalmensualidades;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME PRECIO DE LA MENSUALIDAD DE NETFLIX: ");
        precionetflix = teclado.nextDouble();
        System.out.print("DAME PRECIO DE LA MENSUALIDAD DE YOUTUBE PREMIUM: ");
        precioyoutubepremium = teclado.nextDouble();
        System.out.print("DAME PRECIO DE LA MENSUALIDAD DE DROPBOX: ");
        preciodropbox = teclado.nextDouble();
        System.out.print("DAME PRECIO DE LA MENSUALIDAD DE SPOTIFY: ");
        preciospotify = teclado.nextDouble();
        System.out.print("INGRESE SU EDAD: ");
        edad = teclado.nextDouble();
        if (edad <= 30)
            System.out.println("SE DESCUENTA EL 20%");
        else
            System.out.println("NO SE DESCUENTA");
        if (edad <= 30)
            totalmensualidades = (precionetflix + precioyoutubepremium + preciodropbox + preciospotify) * 0.80;
        else
            totalmensualidades = (precionetflix + precioyoutubepremium + preciodropbox + preciospotify);
        System.out.println("Valor total a pagar mensual de servicios digitales es = " + totalmensualidades);
    }
}
