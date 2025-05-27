import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        //Ciclo para repetir las opciones hasta que se seleccione la opcion para salir y finalizar el programa
        while (opcion != 11) {
            System.out.println("***************Bienvenido al Conversor de Monedas***************");
            System.out.println("Seleccione una opción para realizar la conversión");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Dólar => Peso mexicano");
            System.out.println("8) Peso mexicano => Dólar");
            System.out.println("9) Dólar => Quetzal");
            System.out.println("10) Quetzal => Dólar");
            System.out.println("11) Salir");
            //Validación de lo ingresado, si es un int
            if (scan.hasNextInt()) {
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1:
                        String tipo = "USD";
                        String monedaConvertir = "ARS";
                        System.out.println("Conversión dólar a peso argentino");
                        Consulta.BusquedaMoneda(tipo, monedaConvertir);
                        break;
                    case 2:
                        String tipo1 = "ARS";
                        String monedaConvertir1 = "USD";
                        System.out.println("Conversión peso argentino a dólar");
                        Consulta.BusquedaMoneda(tipo1, monedaConvertir1);
                        break;
                    case 3:
                        String tipo2 = "USD";
                        String monedaConvertir2 = "BRL";
                        System.out.println("Conversión dólar a real brasileño");
                        Consulta.BusquedaMoneda(tipo2, monedaConvertir2);
                        break;
                    case 4:
                        String tipo3 = "BRL";
                        String monedaConvertir3 = "USD";
                        System.out.println("Conversión real brasileño a dólar");
                        Consulta.BusquedaMoneda(tipo3, monedaConvertir3);
                        break;
                    case 5:
                        String tipo4 = "USD";
                        String monedaConvertir4 = "COP";
                        System.out.println("Conversión dólar a peso colombiano");
                        Consulta.BusquedaMoneda(tipo4, monedaConvertir4);
                        break;
                    case 6:
                        String tipo5 = "COP";
                        String monedaConvertir5 = "USD";
                        System.out.println("Conversión peso colombiano a dólar");
                        Consulta.BusquedaMoneda(tipo5, monedaConvertir5);
                        break;
                    case 7:
                        String tipo6 = "USD";
                        String monedaConvertir6 = "MXN";
                        System.out.println("Conversión Dólar a peso mexicano");
                        Consulta.BusquedaMoneda(tipo6, monedaConvertir6);
                        break;
                    case 8:
                        String tipo7 = "MXN";
                        String monedaConvertir7 = "USD";
                        System.out.println("Conversión Peso mexicano a dólar");
                        Consulta.BusquedaMoneda(tipo7, monedaConvertir7);
                        break;
                    case 9:
                        String tipo8 = "USD";
                        String monedaConvertir8 = "GTQ";
                        System.out.println("Conversión Dólar a quetzal");
                        Consulta.BusquedaMoneda(tipo8, monedaConvertir8);
                        break;
                    case 10:
                        String tipo9 = "GTQ";
                        String monedaConvertir9 = "USD";
                        System.out.println("Conversión Quetzal a dólar");
                        Consulta.BusquedaMoneda(tipo9, monedaConvertir9);
                        break;
                    case 11:
                        break;
                    default:
                        System.out.println("Moneda no soportada");

                }
            }else {
                System.out.println("Ingrese un valor valido");
                scan.nextLine();
            }
        }

        scan.close();


    }
}