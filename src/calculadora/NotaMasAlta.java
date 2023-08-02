package calculadora;

public class NotaMasAlta {
    public static int caalcularNotaMasAlta(int[]notas){
        int aux=0;
        for(int num: notas){
            if(num>aux){
                aux=num;
            }
        }
        return aux;
    }
}
