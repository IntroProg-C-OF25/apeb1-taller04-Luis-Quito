import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        double ladoCuadrado, alturaRectangulo, areaCuadrado, areaTriangulo, areaRectangulo, areaPoligono;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME EL VALOR DEL LADO DEL CUADRADO: ");
        ladoCuadrado = teclado.nextDouble();
        System.out.print("DAME EL VALOR DE LA ALTURA DEL RECTANGULO: ");
        alturaRectangulo = teclado.nextDouble();
        areaCuadrado = Math.pow(ladoCuadrado, 2);
        System.out.println("Area del Cuadrado: " + areaCuadrado);
        areaTriangulo = (ladoCuadrado + alturaRectangulo) / 2;
        System.out.println("Area de los tres triangulos: " + areaTriangulo);
        areaRectangulo = (ladoCuadrado * alturaRectangulo);
        System.out.println("Area del Rectangulo: "+ areaRectangulo);
        areaPoligono = ((areaTriangulo * 3) + areaRectangulo + areaCuadrado);
        System.out.println("El area del Poligono es = " + areaPoligono);
    }
}
