public class Usuario {
    private String nombre;
    private int puntos;

    public Usuario(String nombre, int puntosIniciales) {
        this.nombre = nombre;
        this.puntos = puntosIniciales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public boolean tienePuntosSuficientes(int requeridos) {
        return puntos >= requeridos;
    }

    public void descontarPuntos(int cantidad) {
        puntos -= cantidad;
    }
}
