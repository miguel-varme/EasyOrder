import java.util.ArrayList;

public class ControlRecompensas {
    private ArrayList<Recompensa> catalogo;

    public ControlRecompensas() {
        catalogo = new ArrayList<Recompensa>();
        // Cargamos recompensas
        catalogo.add(new Recompensa("Descuento del 10%", 50));
        catalogo.add(new Recompensa("Bebida gratis", 100));
        catalogo.add(new Recompensa("Postre gratis", 80));
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de recompensas:");
        for (int i = 0; i < catalogo.size(); i++) {
            Recompensa r = catalogo.get(i);
            System.out.println(i + ". " + r.getDescripcion() + " - " + r.getPuntosNecesarios() + " puntos");
        }
    }

    public void reclamarRecompensa(Usuario usuario, int indice) {
        if (indice >= 0 && indice < catalogo.size()) {
            Recompensa r = catalogo.get(indice);
            if (usuario.tienePuntosSuficientes(r.getPuntosNecesarios())) {
                usuario.descontarPuntos(r.getPuntosNecesarios());
                System.out.println("¡Recompensa aplicada al pedido: " + r.getDescripcion() + "!");
                System.out.println("Puntos restantes: " + usuario.getPuntos());
            } else {
                System.out.println("No tienes suficientes puntos. Gana más consumiendo en la app.");
            }
        } else {
            System.out.println("Índice de recompensa inválido.");
        }
    }
}
