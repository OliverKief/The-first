import java.util.Random;

public class GeneradorDeContraseñas {

    public static String generarContraseña(int longitud, boolean incluirNumeros, boolean incluirMayusculas, boolean incluirEspeciales) {
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

        // Generar la contraseña
        Random random = new Random();
        StringBuilder contraseña = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteresPermitidos.length());
            contraseña.append(caracteresPermitidos.charAt(indiceAleatorio));
        }

        return contraseña.toString();
    }

    public static void main(String[] args) {
        int longitud = 10; // Longitud de la contraseña
        boolean incluirNumeros = true;
        boolean incluirMayusculas = true;
        boolean incluirEspeciales = true;

        String contraseña = generarContraseña(longitud, incluirNumeros, incluirMayusculas, incluirEspeciales);
        System.out.println("Contraseña generada: " + contraseña);
    }
}
