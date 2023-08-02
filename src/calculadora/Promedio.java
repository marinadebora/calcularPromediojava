package calculadora;

public class Promedio {
    public static double calcularPromedio(int[] notaAlumnos){
        int numeroPromedio = 0;
        for(int num: notaAlumnos){
            numeroPromedio = numeroPromedio + num;
        }
        double promedio = numeroPromedio / notaAlumnos.length;

        return promedio;
    }
}
