public class Main {
    public static void main(String[] args) {
        // Tienda que cobra con la pasarela externa (a traves de su adapter)
        Tienda tienda1 = new Tienda(new PasarelaAdapter(new PasarelaExterna()));
        tienda1.comprar(1500.50);

        // Tienda que cobra con el sistema legado (a traves de su adapter)
        Tienda tienda2 = new Tienda(new LegacyAdapter(new SistemaCobrosLegacy()));
        tienda2.comprar(800.00);

        // La clase Tienda es la misma en los dos casos: no se toco nada.
    }
}
