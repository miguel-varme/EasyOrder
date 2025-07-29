public class Main {
    public static void main(String[] args) {
      
        Cliente cliente = new Cliente("Ana López", "555-1234");
        SistemaReservas sistema = new SistemaReservas();

 
    
        sistema.solicitarReserva("2025-12-25", "19:30", 4, cliente);


        sistema.solicitarReserva("2025-12-25", "19:30", 2, cliente); 

        sistema.cancelarReserva("RES-1234");
    }
}