import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        ControlPedido control = new ControlPedido(restaurante);

        
        List<String> platos1 = Arrays.asList("Hamburguesa", "Papas fritas");
        control.realizarPedido(platos1);

        
        List<String> platos2 = Arrays.asList("Pizza", "Refresco");
        control.realizarPedido(platos2);

       
        System.out.println("\n--- TEST 3: CANCELACIÓN MANUAL ---");
        control.cancelarPedido("Cliente canceló");
    }
}