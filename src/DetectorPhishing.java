import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class DetectorPhishing {
    public static void main(String[] args) {
        
        // Ruta del archivo a analizar
        String archivo = "D:\\Oliver\\UTM\\POO\\phishing.txt";

        // Lista de palabras clave a buscar
        
        ArrayList<String> palabrasClave = new ArrayList<>();
        palabrasClave.add("enlace");
        palabrasClave.add("link");
        palabrasClave.add("cuenta");
        palabrasClave.add("contraseña");
        palabrasClave.add("alerta");
        palabrasClave.add("seguridad");
        palabrasClave.add("premio");
        palabrasClave.add("regalo");
        palabrasClave.add("proteger");
        palabrasClave.add("whatsapp");
        palabrasClave.add("faceboock");
        palabrasClave.add("instagram");
        palabrasClave.add("netflix");
        palabrasClave.add("amazon");
        palabrasClave.add("twitter");
        palabrasClave.add("google");
        palabrasClave.add("paypal");
        palabrasClave.add("banco");
        palabrasClave.add("peligro");
        palabrasClave.add("urgente");
        palabrasClave.add("codigo");
        palabrasClave.add("rembolso");
        palabrasClave.add("gratis");
        palabrasClave.add("cupon");
        palabrasClave.add("descuento");
        palabrasClave.add("verificar");
        palabrasClave.add("felicidades");
        palabrasClave.add("factura");
        palabrasClave.add("copia");
        palabrasClave.add("notificacion");
        palabrasClave.add("expira en 3 dias");
        palabrasClave.add("la contraseña de su cuenta ha caducado");
        palabrasClave.add("se requiere verificacion");
        palabrasClave.add("Su cuenta ha sido bloqueada");


        // Se usa BufferedReader para leer el archivo y buscar las palabras clave
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                for (String palabra : palabrasClave) {
                    if (linea.toLowerCase().contains(palabra.toLowerCase())) {
                        System.out.println("Palabra clave encontrada: " + palabra);   //se imprime en panttalla la keyword encontrada
                    }               
                }
            }
            br.close();   
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
