import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void añadirUsuario(Scanner teclado){
        String identificador;
        System.out.println("Escriba el identificador");
        identificador = teclado.nextLine();

    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        ArrayList<Cliente> lista = new ArrayList<>();

        do {
            System.out.println("Elige opción:\n" +
                    "1. Añadir Usuario\n" +
                    "2. Buscar Usuario\n" +
                    "3. Total ingresos\n" +
                    "0. Salir");
            opcion = teclado.nextLine();

            switch (opcion){
                case "1":
                    añadirUsuario(teclado);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (!opcion.equals("0"));
    }
}
