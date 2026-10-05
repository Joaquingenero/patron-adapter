// ADAPTER 1: implementa ProcesadorPago y traduce hacia PasarelaExterna.
public class PasarelaAdapter implements ProcesadorPago {
    private PasarelaExterna pasarela;

    public PasarelaAdapter(PasarelaExterna pasarela) {
        this.pasarela = pasarela;
    }

    @Override
    public boolean pagar(double montoEnPesos) {
        long centavos = Math.round(montoEnPesos * 100);                // pesos -> centavos
        String respuesta = pasarela.ejecutarTransaccion(centavos, "ARS"); // delega
        return respuesta.equals("APROBADA");                           // texto -> boolean
    }
}
