
/**
 *
 * @author Heber Quequejana
 */
public class Base64 {

    private static final String base64code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz" + "0123456789" + "+/";

    public static String convertir(int num) {
        String resultado = "";
        int dividendo = num;
        int cociente;
        int residuo;
        cociente = dividendo / 64;
        residuo = dividendo % 64;
        resultado = String.valueOf(base64code.charAt(residuo)) + resultado;
        while (cociente > 64) {
            dividendo = cociente;
            cociente = dividendo / 64;
            residuo = dividendo % 64;
            resultado = String.valueOf(base64code.charAt(residuo)) + resultado;
        }
        resultado = String.valueOf(base64code.charAt(cociente)) + resultado;
        switch (resultado.length()) {
            case 2:
                resultado = "AAA" + resultado;
                break;
            case 3:
                resultado = "AA" + resultado;
                break;
            case 4:
                resultado = "A" + resultado;
                break;

        }
        return resultado;
    }

}
