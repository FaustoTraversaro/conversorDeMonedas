import java.util.Map;

public class CalculadoraConversion {

    private Map<String, Double> tasas;

    public CalculadoraConversion(Map<String, Double> tasas) {
        this.tasas = tasas;
    }

    public double convertir(double cantidad, String monedaOrigen, String monedaDestino) {

        double tasaOrigen = tasas.getOrDefault(monedaOrigen, 0.0);
        double tasaDestino = tasas.getOrDefault(monedaDestino, 0.0);

        if (tasaOrigen == 0.0 || tasaDestino == 0.0) {
            System.out.println("Error: Una o ambas monedas (" + monedaOrigen + ", " + monedaDestino + ") no se encontraron.");
            return 0.0;
        }

        double cantidadEnUSD = cantidad / tasaOrigen;

        double resultado = cantidadEnUSD * tasaDestino;

        return resultado;
    }
}
