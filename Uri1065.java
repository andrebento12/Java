import java.util.Scanner;

public class Uri1065{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        
        int valores;
        int contador;
        int qtdpares = 0;

        for (contador = 1 ; contador <=5 ; contador++){
            valores = teclado.nextInt();
            if (valores %2 == 0){
            qtdpares++;
            // System.out.println("Verificacao temporaria de pares: quantidades de pares: " + qtdpares);
            }

        }
        System.out.println(qtdpares + " valores pares");


    }


}