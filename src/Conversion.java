import java.util.Scanner;
import java.text.DecimalFormat;

public class Conversion {
//Solicita datos y realiza las operaciones de conversion respectiva
    public static void operacionConversion(double monedaConvertir, double monedaCambio, String etiquetaMonedaConvertir, String etiquetaMonedaCambio){
        DecimalFormat formatoDecimal = new DecimalFormat("#,##0.00");
        Double resultadoConversion;
        Scanner scan = new Scanner(System.in);
        System.out.println("El cambio es: " + formatoDecimal.format(monedaConvertir) + " " + etiquetaMonedaConvertir + " a " + formatoDecimal.format(monedaCambio) + " " + etiquetaMonedaCambio);
        System.out.println("Ingrese cantidad a convertir en "+etiquetaMonedaConvertir);
        Double cantidadMoneda = scan.nextDouble();
        System.out.println("Cantidad ingresada: " + formatoDecimal.format(cantidadMoneda) + " " + etiquetaMonedaConvertir);
        resultadoConversion = cantidadMoneda * monedaCambio;
        System.out.println("Resultado de la conversión: " + formatoDecimal.format(resultadoConversion) + " " + etiquetaMonedaCambio);

    }

}
