import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaReservas {
    private Mesa mesa;
    private Reserva reserva;

    public SistemaReservas() {
        this.mesa = new Mesa(1); // Mesa con número 1 por defecto
    }

    // Método principal con flujos alternativos
    public void solicitarReserva(String fechaStr, String horaStr, int numPersonas, Cliente cliente) {
        // Validación básica
        if (numPersonas <= 0 || numPersonas > 10) {
            System.out.println("[Error] Número de personas inválido (máx. 10)");
            return;
        }

        // Convertir fecha y hora
        LocalDateTime fechaHora = parsearFechaHora(fechaStr, horaStr);
        if (fechaHora == null) {
            System.out.println("[Error] Fecha u hora inválidas (Formato: YYYY-MM-DD HH:MM)");
            return;
        }

        // Flujo principal: Verificar disponibilidad
        if (mesa.verificarDisponibilidad(fechaHora)) {
            // Paso 4: Crear reserva
            this.reserva = new Reserva(fechaStr, horaStr, cliente, mesa);
            
            // Paso 5: Confirmación
            System.out.println("[Éxito] Reserva #" + reserva.getId() + 
                             " para " + fechaStr + " a las " + horaStr);
            
            // Paso 6: Notificar
            cliente.notificar("Reserva confirmada. Presentarse 15 mins antes.");
        } else {
            // Flujo alternativo 1: Mesa no disponible
            System.out.println("[Error] Mesa no disponible en ese horario");
            
            // Sugerir horario alternativo (simulado)
            String horarioAlternativo = sugerirHorarioAlternativo(fechaHora);
            System.out.println("[Sugerencia] Intente este horario: " + horarioAlternativo);
        }
    }

    // Flujo alternativo 2: Cancelación de reserva
    public void cancelarReserva(String idReserva) {
        if (reserva != null && reserva.getId().equals(idReserva)) {
            mesa.habilitarMesa(true); // Liberar mesa
            System.out.println("[Cancelación] Reserva #" + idReserva + " anulada");
        } else {
            System.out.println("[Error] Reserva no encontrada");
        }
    }

    // Métodos auxiliares
    private LocalDateTime parsearFechaHora(String fecha, String hora) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            return LocalDateTime.parse(fecha + " " + hora, formatter);
        } catch (Exception e) {
            return null;
        }
    }

    private String sugerirHorarioAlternativo(LocalDateTime fechaHora) {
        return fechaHora.plusHours(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
}