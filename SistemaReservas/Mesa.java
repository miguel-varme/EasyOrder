import java.time.LocalDateTime;

public class Mesa {
    private int numero;
    private boolean disponible;
    private LocalDateTime fechaReserva;

    public Mesa(int numero) {
        this.numero = numero;
        this.disponible = true;
    }

    public boolean verificarDisponibilidad(LocalDateTime fechaHora) {
        // Validar que la fecha no sea pasada y la mesa esté libre
        if (fechaHora.isBefore(LocalDateTime.now())) {
            return false;
        }
        this.disponible = (fechaReserva == null || !fechaHora.equals(fechaReserva));
        return disponible;
    }

    public void habilitarMesa(boolean estado) {
        this.disponible = estado;
        this.fechaReserva = estado ? null : LocalDateTime.now();
    }

    public int getNumero() {
        return numero;
    }
}