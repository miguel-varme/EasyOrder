public class Restaurante {
    public void notificarNuevoPedido(Pedido pedido) {
        System.out.println("[Restaurante] Pedido recibido #" + pedido.getId() + 
                         " - Platos: " + pedido.getPlatos());
    }

    public void actualizarEstado(String idPedido, String estado) {
        if (estado.contains("Cancelado")) {
            System.out.println("[Restaurante] CANCELACIÓN #" + idPedido + " - Razón: " + estado);
        } else {
            System.out.println("[Restaurante] Actualizado pedido #" + idPedido + " -> " + estado);
        }
    }
}