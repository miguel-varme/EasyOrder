public class Reserva {
    private String id;
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    private String estado; // "Confirmada", "Cancelada", "En espera"

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.id = "RES-" + System.currentTimeMillis() % 10000;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
        this.estado = "Confirmada";
    }

    public void cancelar() {
        this.estado = "Cancelada";
    }

    // Getters
    public String getId() { return id; }
    public String getEstado() { return estado; }
}