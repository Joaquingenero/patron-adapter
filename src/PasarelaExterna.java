// ADAPTEE 1: libreria de terceros. NO se puede modificar.
// Trabaja en centavos, pide la moneda y devuelve un texto.
public class PasarelaExterna {
    public String ejecutarTransaccion(long montoEnCentavos, String moneda) {
        System.out.println("  [Pasarela] Cobrando " + montoEnCentavos + " centavos en " + moneda);
        return "APROBADA";
    }
}
