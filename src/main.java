import java.util.Scanner;

public class main {
    public static void anadirUsuario(Scanner teclado, Registro registro){
        String identificador, contraseña;
        double descuento;
        boolean premium;
        teclado.nextLine();
        System.out.println("Escriba el identificador");
        identificador = teclado.nextLine();
        System.out.println("Escriba la contraseña");
        contraseña = teclado.nextLine();
        System.out.println("Escriba el importe de los descuentos");
        descuento = teclado.nextDouble();
        System.out.println("¿Es premium? (true o false)");
        premium = teclado.nextBoolean();
        teclado.nextLine();
        Usuario usuario = new Usuario(identificador, contraseña, descuento, premium);
        registro.añadirCliente(usuario);
        System.out.println("Usuario añadido");
    }
    public static void buscarCliente(Scanner scanner, Registro registro) {
        System.out.print("Introduce el identificador (correo): ");
        String identificador = scanner.next();
        Cliente cliente = registro.buscarCliente(identificador);

        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente.getIdentificador());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
    public static void calcularIngresos(Registro registro) {
        double ingresosTotales = registro.calcularIngresos();
        System.out.println("Los ingresos totales son: " + ingresosTotales + " euros.");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;

        Registro registro = new Registro();
        try {
            do {
                System.out.println("Elige opción:\n" +
                        "1. Añadir Usuario\n" +
                        "2. Buscar Usuario\n" +
                        "3. Total ingresos\n" +
                        "0. Salir");
                opcion = teclado.next();

                switch (opcion) {
                    case "1":
                        anadirUsuario(teclado, registro);
                        break;
                    case "2":
                        buscarCliente(teclado, registro);
                        break;
                    case "3":
                        calcularIngresos(registro);
                        break;

                    case "0":
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } while (!opcion.equals("0"));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}