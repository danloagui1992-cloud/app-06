
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int edad;
        double salario;
        int opcion;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la edad");
        edad = entrada.nextInt();

        System.out.println("Ingresa un salario");
        salario = entrada.nextDouble();

        System.out.println("###########################");
        System.out.println("1.- Es médico");
        System.out.println("2.- Es programador");
        System.out.println("3.- Es abogado");
        System.out.println("Ingresa una opción");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                
            case 2:
                
            case 3:
               
                
            default:
                throw new AssertionError("Error");
        }

    }
}
