import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letraAdivinada = new char[palabraSecreta.length()];

        for (int i = 0; i < letraAdivinada.length; i++) {
            letraAdivinada[i] = '_';
            // System.out.print(letraAdivinada[i]);
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letraAdivinada) + " (" + palabraSecreta.length()
                    + "letras )");
            System.out.println("Introduce una letra, por favor");

            // Uso de la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letraAdivinada[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto!, Te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            if (String.valueOf(letraAdivinada).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades has gando. " + "Palabra: " + palabraSecreta);
            }

        }
        if (!palabraAdivinada) {
            System.out.println("Qué pena te has quedado sin intentos!, la palabra era: " + "'" + palabraSecreta + "'");
        }
        scanner.close();

    }
}
