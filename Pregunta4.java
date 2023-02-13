
import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la distancia recorrida en metros: ");
        double distancia = sc.nextDouble();
        System.out.println("Introduzca el tiempo en segundos: ");
        double tiempo = sc.nextDouble();
        double velocidad = distancia / tiempo;
        System.out.println("La velocidad media es: " + velocidad + " m/s");
    }
}

//Código valido y funcional hecho por copilot en el que puedes calcular la velocidad media de desplazamiento del usuario de manera sencilla.