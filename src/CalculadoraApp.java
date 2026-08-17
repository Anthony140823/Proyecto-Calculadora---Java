import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        // Creamos el objeto sc para poder ingresar datos en consola
        Scanner sc = new Scanner(System.in);

        // Todo irá en un ciclo para que se repita hasta cerrar el programa
        while (true) {

            System.out.println("**** Aplicacion Calculadora ****");

            // Mostramos el menu
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);

            // Pedimos al usuario que ingrese una opción
            System.out.print("Ingrese una opcion: ");
            int opcion = Integer.parseInt(sc.nextLine());

            // Revisamos que la opción esté dentro de las opciones permitdas
            if (opcion >= 1 && opcion <= 4) {

                // Pedimos al usuario que ingrese el operando 1
                System.out.print("Proporciona valor de operando1: ");
                int operando1 = Integer.parseInt(sc.nextLine());

                // Pedimos al usuario que ingrese el operando 2
                System.out.print("Proporciona valor de operando2: ");
                int operando2 = Integer.parseInt(sc.nextLine());

                // Incializamos la variable donde se guardará el resultado
                int resultado;

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
                        resultado = operando1 / operando2;
                        System.out.println("Resultado Division: " + resultado);
                    }
                    default -> System.out.println("Opción erronea!: " + opcion);
                }
            } else if (opcion == 5) { // Salir
                System.out.println("Hasta pronto...");
                break;
            } else {
                System.out.println("Opción erronea!: " + opcion);
            }
            // Imprimimos un salto antes de repetir el ciclo par que no se vea todo junto
            System.out.println();
        } // fin de while
    }
}
