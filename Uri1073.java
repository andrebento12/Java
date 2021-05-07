import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int N;
        int contador;
        N = teclado.nextInt();
        

            for (contador = 2; contador <= N; contador +=2){
                System.out.println(contador + "^2 = " + contador * contador);
                
            }
        
    }




}