import java.util.Scanner;

public class Uri1038{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int cod, qtde;
        double total;

        cod = teclado.nextInt();
        qtde = teclado.nextInt();

        if (cod == 1){
            total = qtde * 4.00;
        }
        else if (cod == 2){
            total = qtde * 4.50;
            }
        else if (cod == 3){
            total = qtde * 5.00;
        }
        else if (cod == 40){
            total = qtde * 2.00;
            }
        else{
            total = qtde * 1.50;
        }
         System.out.printf("Total: R$ %.2f\n", total);
    }
}