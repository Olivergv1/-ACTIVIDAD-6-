import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class DetectorPhishing {
    public static void main(String[] args) {
        
        // Ruta del archivo a analizar
        String archivo = "D:\\Oliver\\UTM\\POO\\phishing.txt";

        // Se usa la lista Map para almacenar las palabras clave y sus valores
        
        Map<String, Integer> palabrasValores = new HashMap<>();
        palabrasValores.put("enlace", 3);
        palabrasValores.put("link", 3);
        palabrasValores.put("cuenta", 3);
        palabrasValores.put("contraseña", 3);
        palabrasValores.put("alerta", 3);
        palabrasValores.put("seguridad", 3);
        palabrasValores.put("premio", 3);
        palabrasValores.put("regalo", 3);
        palabrasValores.put("proteger", 3);
        palabrasValores.put("whatsapp", 2);
        palabrasValores.put("faceboock", 3);
        palabrasValores.put("instagram", 2);
        palabrasValores.put("amazon", 2);
        palabrasValores.put("twitter", 2);
        palabrasValores.put("google", 3);
        palabrasValores.put("paypal", 3);
        palabrasValores.put("banco", 3);
        palabrasValores.put("peligro", 3);
        palabrasValores.put("urgente", 3);
        palabrasValores.put("codigo", 3);
        palabrasValores.put("rembolso", 3);
        palabrasValores.put("gratis", 3);
        palabrasValores.put("cupon", 3);
        palabrasValores.put("descuento", 3);
        palabrasValores.put("verificar", 3);
        palabrasValores.put("felicidades", 1);
        palabrasValores.put("factura", 1);
        palabrasValores.put("copia", 1);
        palabrasValores.put("notificacion", 1);
        palabrasValores.put("expira en 3 dias", 2);
        palabrasValores.put("la cotraseña de su cuenta de ha caducado", 3);
        palabrasValores.put("se requiere verificacion", 3);
        palabrasValores.put("su cuenta de ha sido bloqueada ", 3);
        

        // se lee el archivo y se buscan las palabras clave
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                for (Map.Entry<String, Integer> entry : palabrasValores.entrySet()) {
                    String palabra = entry.getKey();
                    int valor = entry.getValue();
                    if (linea.toLowerCase().contains(palabra.toLowerCase())) {
                        System.out.println("Palabra clave encontrada: " + palabra + " (" + valor + " puntos)");   //se imprime en pantalla
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

