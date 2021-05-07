import java.util.Scanner;

public class Uri1067{

    public static void main(String args[]){

        int X;
        int contador;
        Scanner teclado = new Scanner(System.in);
        X = teclado.nextInt();
        
        for (contador = 1; contador <= X; contador++){

            if (contador %2 != 0){
                System.out.println(contador);
            }
        }  
    }


}