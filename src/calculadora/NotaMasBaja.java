package calculadora;

public class NotaMasBaja {
    public static int calcularNotaMasBaja(int[]notas){
        int aux = 10;
        for(int num: notas){
            if(num<aux){
                aux=num;
            }
        }
        return  aux;
    }
}
