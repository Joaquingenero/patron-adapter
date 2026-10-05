// ADAPTER 2: implementa ProcesadorPago y traduce hacia SistemaCobrosLegacy.
public class LegacyAdapter implements ProcesadorPago {
    private SistemaCobrosLegacy legacy;

    public LegacyAdapter(SistemaCobrosLegacy legacy) {
        this.legacy = legacy;
    }

    @Override
    public boolean pagar(double montoEnPesos) {
        String texto = String.valueOf(montoEnPesos); // double -> texto
        int codigo = legacy.cobrar(texto);           // delega
        return codigo == 0;                          // entero -> boolean
    }
}
