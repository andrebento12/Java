import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        double Y, consumo_medio;
        X = teclado.nextInt();
        Y = teclado.nextDouble();

        consumo_medio = X / Y;

        System.out.printf("%.3f" ,consumo_medio);
        System.out.println(" km/l");
        
        //Alternativa: System.out.printf("%.3f km/l\n", consumo_medio);
    }


}