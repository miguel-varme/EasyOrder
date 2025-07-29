import java.util.List;

public class ControlPedido {
    private Pedido pedido;
    private Restaurante restaurante;
    private boolean pedidoActivo;

    public ControlPedido(Restaurante restaurante) {
        this.restaurante = restaurante;
        this.pedidoActivo = false;
    }

    
    public void realizarPedido(List<String> platos) {
        if (platos == null || platos.isEmpty()) {
            System.out.println("[Error] Lista de platos vacía");
            return;
        }

        this.pedido = new Pedido(platos);
        this.pedidoActivo = true;
        
        System.out.println("[Sistema] Pedido #" + pedido.getId() + " creado");
        restaurante.notificarNuevoPedido(pedido);

        
        double probabilidad = Math.random();
        if (probabilidad < 0.7) {
            
            pedido.actualizarEstado("En preparación");
            restaurante.actualizarEstado(pedido.getId(), "En preparación");
            System.out.println("[Sistema] Estado: " + pedido.getEstado());
        } else {
           
            cancelarPedido("Falta de ingredientes");
        }
    }

    
    public void cancelarPedido(String motivo) {
        if (pedidoActivo && !pedido.getEstado().equals("Cancelado")) {
            pedido.actualizarEstado("Cancelado (" + motivo + ")");
            restaurante.actualizarEstado(pedido.getId(), "Cancelado");
            System.out.println("[Sistema] Pedido #" + pedido.getId() + " cancelado: " + motivo);
            pedidoActivo = false;
        } else {
            System.out.println("[Error] No hay pedidos activos para cancelar");
        }
    }
}