import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int TEMPO, VELOCIDADE_MEDIA, CONSUMO_MEDIO;
        double QUANTIDADE_LITROS, DISTANCIA_PERCORRIDA, X, Y, T;

        CONSUMO_MEDIO = 12;
        TEMPO = teclado.nextInt();
        VELOCIDADE_MEDIA = teclado.nextInt();

        // X = (double) CONSUMO_MEDIO;
        // Y = (double) VELOCIDADE_MEDIA;
        // T = (double) TEMPO;

        DISTANCIA_PERCORRIDA = TEMPO * VELOCIDADE_MEDIA;
        QUANTIDADE_LITROS = DISTANCIA_PERCORRIDA / CONSUMO_MEDIO;

        System.out.printf("%.3f\n" ,QUANTIDADE_LITROS);
           
        
    }


}