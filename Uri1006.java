import java.util.Scanner;

public class Uri1006{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

// ENTRADA

        double A, B, C, MEDIA;
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

// PROCESSAMENTO

        MEDIA = ((2 * A) + (3 * B) + (5 * C)) / (2 + 3 + 5);

// SAIDA

        System.out.printf("MEDIA = %.1f\n" ,MEDIA);
        
    }
}