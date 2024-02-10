public class NumeroParImpar {

    // Método para verificar si un número es par o impar
    public static boolean esPar(int numero) {
        // Un número es par si el resto de dividirlo por 2 es 0
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = 4; // Cambia este número para probar con diferentes valores
        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}