import java.util.Random;

public class GeneradorDeContrasenas {

    public static String generarContrasena(int longitud, boolean incluirNumeros, boolean incluirMayusculas, boolean incluirEspeciales) {
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String especiales = "!@#$%^&*()_+-=[]{}|;':,.<>?";

        // Construir la cadena de caracteres permitidos según las opciones
        String caracteresPermitidos = caracteres;
        if (incluirNumeros) {
            caracteresPermitidos += numeros;
        }
        if (incluirMayusculas) {
            caracteresPermitidos += mayusculas;
        }
        if (incluirEspeciales) {
            caracteresPermitidos += especiales;
        }

        // Generar la contrasena
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteresPermitidos.length());
            contrasena.append(caracteresPermitidos.charAt(indiceAleatorio));
        }

        return contrasena.toString();
    }

    public static void main(String[] args) {
        int longitud = 10; // Longitud de la contrasena
        boolean incluirNumeros = true;
        boolean incluirMayusculas = true;
        boolean incluirEspeciales = true;

        String contrasena = generarContrasena(longitud, incluirNumeros, incluirMayusculas, incluirEspeciales);
        System.out.println("Contrasena generada: " + contrasena);
    }
}
