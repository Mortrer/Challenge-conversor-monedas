import java.util.Map;
public class ConversorMod {
    public record MonedaResponse(
        String result,
        String base_code,
        Map<String, Double> conversion_rates
    ){}
}
