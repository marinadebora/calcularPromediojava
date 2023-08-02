package calculadora;

import java.util.Scanner;

import static calculadora.NotaAlumnos.notaAlumnos;
import static calculadora.NotaMasAlta.caalcularNotaMasAlta;
import static calculadora.NotaMasBaja.calcularNotaMasBaja;
import static calculadora.Print.prints;
import static calculadora.Promedio.calcularPromedio;

public class Calculadora {
    static Scanner scanner = new Scanner(System.in);

    public static void crearCalculadora (){
        int cantidadAlumnos;
        int option;
        int[] notasAlumnos;


        System.out.println("Ingrese la cantidad de alumnos");
        cantidadAlumnos = scanner.nextInt();
        notasAlumnos = notaAlumnos(cantidadAlumnos);

        do {
            option = prints();

            switch (option) {
                case 1 -> {
                    double promedio = calcularPromedio(notasAlumnos);
                    System.out.println("El promedio de los Alumnos es: " + promedio);
                }
                case 2 -> {
                    int notaMasAlta = caalcularNotaMasAlta(notasAlumnos);
                    System.out.println("la calificacion mas alta es: " + notaMasAlta);
                }
                case 3 -> {
                    int notaMasBaja = calcularNotaMasBaja(notasAlumnos);
                    System.out.println("la calificacion mas baja es: " + notaMasBaja);
                }
                case 0 -> System.out.println("Gracias vuelva pronto");
                default -> System.out.println("Escribe un número valido");
            }


        } while(option !=0);
        scanner.close();
    }
}


