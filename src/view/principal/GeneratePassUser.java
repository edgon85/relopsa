
package view.principal;

import java.util.Random;

public class GeneratePassUser {

    private static final String UNICODE
            = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű";
    private static final String PLAIN_ASCII
            = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";

    //generar usuarios
    public String generateUser(String name, String lastName) {

        String user = "";
        char pr = name.charAt(0);
        user = pr + lastName.toLowerCase();

        return toAsciiString(user);
    }

    //generar Pass
    public String generatePass(String firstName, String lastName, String dpi) {

        Random aleatorio = new Random();
        // int num = aleatorio.nextInt(name.length());
        // System.out.println("Aleatorio: "+num);

        // char na = name.charAt(aleatorio.nextInt(name.length()));
        // System.out.println("letra: "+ na);    
        String pass = "";
        char a = firstName.charAt(aleatorio.nextInt(firstName.length()));
        char b = lastName.charAt(aleatorio.nextInt(lastName.length()));
        char h = lastName.charAt(aleatorio.nextInt(lastName.length()));
        char c = dpi.charAt(aleatorio.nextInt(dpi.length()));
        char d = dpi.charAt(aleatorio.nextInt(dpi.length()));
        char e = dpi.charAt(aleatorio.nextInt(dpi.length()));
        char f = dpi.charAt(aleatorio.nextInt(dpi.length()));
        char g = dpi.charAt(aleatorio.nextInt(dpi.length()));

        pass = b + "" + c + d + a + e + f + h + g;
        
        return toAsciiString(pass); 
    }

    public static String toAsciiString(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            int pos = UNICODE.indexOf(c);
            if (pos > -1) {
                sb.append(PLAIN_ASCII.charAt(pos));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
