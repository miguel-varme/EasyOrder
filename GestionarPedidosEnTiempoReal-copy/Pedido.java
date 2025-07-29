import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public class Pedido {
    private String id;
    private List<String> platos;
    private String estado;
    private String hora;

    public Pedido(List<String> platos) {
        if (platos == null) {
            throw new IllegalArgumentException("La lista de platos no puede ser nula");
        }
        this.id = "PED-" + UUID.randomUUID().toString().substring(0, 4);
        this.platos = platos;
        this.estado = "Recibido";
        this.hora = LocalTime.now().toString().substring(0, 8);
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado == null || nuevoEstado.isEmpty()) {
            throw new IllegalArgumentException("Estado inválido");
        }
        this.estado = nuevoEstado;
    }

 
    public String getId() { return id; }
    public String getEstado() { return estado; }
    public String getHora() { return hora; }
    public List<String> getPlatos() { return platos; }
}