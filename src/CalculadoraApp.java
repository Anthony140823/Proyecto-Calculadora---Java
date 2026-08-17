import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        // Creamos el objeto sc para poder ingresar datos en consola
        Scanner sc = new Scanner(System.in);

        System.out.println("**** Aplicacion Calculadora ****");

        // Todo irá en un ciclo para que se repita hasta cerrar el programa
        while (true){
            // Mostramos el menu
            mostrarMenu();

            // Manejamos la exepción si se ingresa una opción no numérica
            try {
                int opcion = Integer.parseInt(sc.nextLine());

                // Revisamos que la opción esté dentro de las opciones permitdas
                if (opcion >= 1 && opcion <= 4) {
                    // Ejecutamos la operación deseada
                    ejecutarOperacion(opcion, sc);

                } else if (opcion == 5) { // Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción erronea!: " + opcion);
                }
                // Imprimimos un salto antes de repetir el ciclo par que no se vea todo junto
                System.out.println();
            } // fin try
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        } // fin de while
    }// fin main

    private static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        // Pedimos al usuario que ingrese una opción
        System.out.print("Ingrese una opcion: ");
    }

    private static void ejecutarOperacion(int opcion, Scanner sc) {
        // Pedimos al usuario que ingrese el operando 1
        System.out.print("Proporciona valor de operando1: ");
        double operando1 = Double.parseDouble(sc.nextLine());

        // Pedimos al usuario que ingrese el operando 2
        System.out.print("Proporciona valor de operando2: ");
        double operando2 = Double.parseDouble(sc.nextLine());

        // Incializamos la variable donde se guardará el resultado
        double resultado;

        // Realizamos la operación según la opción elegida
        switch (opcion) {
            case 1 -> { // Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> { // Multiplicación
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicacion: " + resultado);
            }
            case 4 -> { // División
                if(operando2 == 0){
                    System.out.println("No es posible dividir entre zero!");
                }
                else {
                    resultado = operando1 / operando2;
                    System.out.println("Resultado Division: " + resultado);
                }
            }
            default -> System.out.println("Opción erronea!: " + opcion);
        }
    }

}// fin clase
