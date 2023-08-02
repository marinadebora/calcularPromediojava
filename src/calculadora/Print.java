package calculadora;

import java.util.Scanner;

public class Print {
    static Scanner scanner = new Scanner(System.in);

    public static int prints(){
        int option;
        System.out.println("--------------------------------------------------");
        System.out.println("1: Calcular el promedio de las calificaciones.");
        System.out.println("2: Encontrar la calificación más alta.");
        System.out.println("3: Encontrar la calificación más baja.");
        System.out.println("0: Salir del programa.");
        System.out.println("--------------------------------------------------");
        System.out.println("Escribe el número de la opción: ");
        option =scanner.nextInt() ;
        return option;

    }
}
