import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

//Conexión y consulta en la API para obtener la tasa de cambio
    public static double BusquedaMoneda(String tipoMoneda, String monedaConvertir) {
        try {
            String keyApi = "API KEY";
            final String direccion = "https://v6.exchangerate-api.com/v6/" + keyApi + "/latest/"+ tipoMoneda;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            ConversorMod.MonedaResponse monedas = gson.fromJson(json, ConversorMod.MonedaResponse.class);
            Double cambio = monedas.conversion_rates().get(monedaConvertir);
            String etiqueta = monedas.base_code();
            Double base = monedas.conversion_rates().get(tipoMoneda);
            Conversion.operacionConversion(base,cambio, etiqueta, monedaConvertir);
        } catch (IOException e) {
            System.out.println("Error de red" + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Error de Solicitud" + e.getMessage());
        }
        return 0;


    }


}
