package calculadora;
import java.util.Scanner;
public class NotaAlumnos {
    static Scanner scanner = new Scanner(System.in);
    public static int[] notaAlumnos(int numero){
        int [] cantidadAlumnos = new int[numero];

        for(int i = 0 ;  i<= cantidadAlumnos.length-1;i++){
            System.out.println("ingrese la nota de su alumno");
            cantidadAlumnos[i]= scanner.nextInt();

        }
        return cantidadAlumnos;

    }
}
