package Modulo05;

public class Variavel {

    public static void main(String[] args) {

        int valor = 10;

        Integer intvalor = new Integer(valor);

        float valor2 = 3.14f;

        Float floatvalor2 = new Float(valor2);

        double valor3 = 278.55432;

        Double doublevalor3 = new Double(valor3);

        char caract = 'j';

        Character charcaract = caract;

        char vetores[] = {'a', 'v', 'p'};
        String texto = String.valueOf(vetores);
        System.out.println(texto);

        long longconvertido = 42;
        String valor4 = String.valueOf(longconvertido);
        System.out.println(valor4);
    }






}

