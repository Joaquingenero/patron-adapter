// CLIENTE: solo conoce la interfaz ProcesadorPago.
// No sabe si atras hay una pasarela externa o un sistema legado.
public class Tienda {
    private ProcesadorPago procesador;

    public Tienda(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void comprar(double monto) {
        System.out.println("Tienda: cobrando $" + monto);
        if (procesador.pagar(monto)) {
            System.out.println("Tienda: pago OK\n");
        } else {
            System.out.println("Tienda: pago rechazado\n");
        }
    }
}
