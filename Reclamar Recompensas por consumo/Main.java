import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear usuario con puntos iniciales
        Usuario usuario = new Usuario("Carlos", 90);

        // Crear el controlador de recompensas
        ControlRecompensas control = new ControlRecompensas();

        System.out.println("Bienvenido, " + usuario.getNombre() + ".");
        System.out.println("Tienes " + usuario.getPuntos() + " puntos disponibles.");
        
        // Mostrar catálogo
        control.mostrarCatalogo();
        System.out.print("Elige el número de la recompensa que deseas reclamar: ");
        int opcion = scanner.nextInt();

        // Reclamar recompensa
        control.reclamarRecompensa(usuario, opcion);
        
        scanner.close();
    }
}
