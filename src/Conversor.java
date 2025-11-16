import com.google.gson.Gson;
import java.util.Map;
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        ConsultaAPI consulta = new ConsultaAPI();
        String jsonRespuesta = consulta.obtenerDatosAPI("USD");

        Gson gson = new Gson();
        Moneda moneda = gson.fromJson(jsonRespuesta, Moneda.class);
        Map<String, Double> tasas = moneda.getConversionRates();

        if (tasas == null) {
            System.out.println("Error: No se pudieron obtener las tasas de conversión.");
            System.out.println("Verifique su API Key en ConsultaAPI.java o su conexión a internet.");
            return;
        }

        CalculadoraConversion calculadora = new CalculadoraConversion(tasas);

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                Menu.mostrarMenuPrincipal();

                try {
                    int opcion = Integer.parseInt(scanner.nextLine());

                    if (opcion == 7) {
                        break;
                    }

                    if (opcion < 1 || opcion > 6) {
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        continue;
                    }

                    System.out.print("Ingrese la cantidad que desea convertir: ");
                    double cantidad = Double.parseDouble(scanner.nextLine());

                    String monedaOrigen = "";
                    String monedaDestino = "";

                    switch (opcion) {
                        case 1:
                            monedaOrigen = "USD";
                            monedaDestino = "ARS";
                            break;
                        case 2:
                            monedaOrigen = "ARS";
                            monedaDestino = "USD";
                            break;
                        case 3:
                            monedaOrigen = "USD";
                            monedaDestino = "BRL";
                            break;
                        case 4:
                            monedaOrigen = "BRL";
                            monedaDestino = "USD";
                            break;
                        case 5:
                            monedaOrigen = "USD";
                            monedaDestino = "COP";
                            break;
                        case 6:
                            monedaOrigen = "COP";
                            monedaDestino = "USD";
                            break;
                    }

                    double resultado = calculadora.convertir(cantidad, monedaOrigen, monedaDestino);

                    System.out.printf(
                            "El resultado de convertir %.2f %s a %s es: %.2f %s\n",
                            cantidad, monedaOrigen, monedaDestino, resultado, monedaDestino
                    );

                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un número válido.");
                } catch (Exception e) {
                    System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                }
            }

        }

        System.out.println("\nGracias por usar el Conversor de Moneda. ¡Hasta luego!");
    }
}