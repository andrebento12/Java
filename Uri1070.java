import java.util.Scanner;

public class Uri1070{

    public static void main(String args[]){

        int X;
        int contador = 1;
        int contador_impar = 0;
        Scanner teclado = new Scanner(System.in);
        X = teclado.nextInt();
        
        if (X %2 == 0){
            X++;
            do{
            System.out.println(X + contador_impar);
            contador_impar +=2;
            contador ++;
            } while (contador <= 6);

        } else{
                do{
                System.out.println(X + contador_impar);
                contador_impar +=2;
                contador ++;
                } while (contador <= 6);
                X++;
            }

         
    }


}