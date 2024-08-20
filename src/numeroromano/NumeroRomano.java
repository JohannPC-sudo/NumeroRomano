/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroromano;

/**
 *
 * @Johann Lopez
 */
public class NumeroRomano {

    /**
     * @param args the command line arguments
     */
        // Función para obtener la cifra de las decenas
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función para convertir unidades a números romanos
    public static String convertirUnidadesARomano(int numero) {
        switch (numero) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }

    // Función para convertir decenas a números romanos
    public static String convertirDecenasARomano(int numero) {
        switch (numero) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return "";
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un numero entero entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("Error: El numero debe estar entre 1 y 99.");
            
        } else {
            int decenas = obtenerDecenas(numero);
            int unidades = numero % 10;

            String romanoDecenas = convertirDecenasARomano(decenas);
            String romanoUnidades = convertirUnidadesARomano(unidades);

            System.out.println("El numero " + numero + " en numeros romanos es: " + romanoDecenas + romanoUnidades);
        }
    }

    }
    

